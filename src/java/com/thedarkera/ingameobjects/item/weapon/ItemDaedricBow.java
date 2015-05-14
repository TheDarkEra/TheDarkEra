package com.thedarkera.ingameobjects.item.weapon;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

import com.thedarkera.TheDarkEra;
import com.thedarkera.entity.EntityDaedricArrow;
import com.thedarkera.entity.EntityDragonArrow;
import com.thedarkera.init.TDEWeapons;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDaedricBow extends Item {
	public static final String[] bowPullIconNameArray = new String[] { "pulling_0", "pulling_1", "pulling_2" };
	@SideOnly(Side.CLIENT)
	private IIcon[] iconArray;

	public ItemDaedricBow(String name) {
		maxStackSize = 1;
		setMaxDamage(384);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}
	
	@Override
	public boolean hasEffect(ItemStack stack) {
		
		return true;
	}
	
	@Override
	public void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int itemUse) {
		int j = getMaxItemUseDuration(stack) - itemUse;

		ArrowLooseEvent event = new ArrowLooseEvent(player, stack, j);
		MinecraftForge.EVENT_BUS.post(event);
		if (event.isCanceled()) {
			return;
		}
		j = event.charge;

		boolean flag = player.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, stack) > 0;

		if (flag || player.inventory.hasItem(TDEWeapons.daedric_arrow)) {
			float f = (float) j / 20.0F;
			f = (f * f + f * 2.0F) / 3.0F;

			if ((double) f < 0.1D) {
				return;
			}

			if (f > 1.0F) {
				f = 1.0F;
			}

			EntityDragonArrow entityarrow = new EntityDragonArrow(world, player, f * 2.0F);

			entityarrow.setFire(100);
			entityarrow.setDamage(entityarrow.getDamage() + 1.0D + 1.0D);
			
			
			if (f == 1.0F) {
				entityarrow.setIsCritical(true);
			}

			int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, stack);

			if (k > 0) {
				entityarrow.setDamage(entityarrow.getDamage() + (double) k * 1.0D + 1.0D);
			}

			int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, stack);

			if (l > 0) {
				entityarrow.setKnockbackStrength(l);
			}

			/*if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, stack) > 0) {
				entityarrow.setFire(100);
			}*/

			stack.damageItem(1, player);
			world.playSoundAtEntity(player, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);
			 	
			
			if (flag) {
				entityarrow.canBePickedUp = 2;
			} else {
				player.inventory.consumeInventoryItem(TDEWeapons.daedric_arrow);
			}

			if (!world.isRemote) {
				world.spawnEntityInWorld(entityarrow);
			}
		}
	}

	@Override
	public int getMaxItemUseDuration(ItemStack stack) {
		return 72000;
	}

	@Override
	public EnumAction getItemUseAction(ItemStack stack) {
		return EnumAction.bow;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		ArrowNockEvent event = new ArrowNockEvent(player, stack);
		MinecraftForge.EVENT_BUS.post(event);
		if (event.isCanceled()) {
			return event.result;
		}

		if (player.capabilities.isCreativeMode || player.inventory.hasItem(TDEWeapons.daedric_arrow)) {
			player.setItemInUse(stack, getMaxItemUseDuration(stack));
		}

		return stack;
	}

	@Override
	public int getItemEnchantability() {
		return 1;
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg) {
		itemIcon = reg.registerIcon(getIconString() + "_standby");
		iconArray = new IIcon[bowPullIconNameArray.length];

		for (int i = 0; i < iconArray.length; ++i) {
			iconArray[i] = reg.registerIcon(getIconString() + "_" + bowPullIconNameArray[i]);
		}
	}

	@SideOnly(Side.CLIENT)
	public IIcon getItemIconForUseDuration(int duration) {
		return iconArray[duration];
	}
}
