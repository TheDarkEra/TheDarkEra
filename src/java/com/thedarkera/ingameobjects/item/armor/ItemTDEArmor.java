package com.thedarkera.ingameobjects.item.armor;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.thedarkera.TheDarkEra;
import com.thedarkera.init.TDEArmors;
import com.thedarkera.utils.IBuffHandler;

public class ItemTDEArmor extends ItemArmor {

	private IBuffHandler buffHandler;

	public ItemTDEArmor(ArmorMaterial material, int par2, int armorType, String name) {
		super(material, par2, armorType);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(TheDarkEra.tabTDEItems);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (stack.getItem() == TDEArmors.daedric_helmet || stack.getItem() == TDEArmors.daedric_chestplate || stack.getItem() == TDEArmors.daedric_boots) {
			return TheDarkEra.MODID + ":modles/armor/daedric_layer1";
		} else if (stack.getItem() == TDEArmors.daedric_leggings) {
			return TheDarkEra.MODID + ":modles/armor/daedric_layer2";
		} else {
			return null;
		}
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {

		if (player.getActivePotionEffects().contains(Potion.damageBoost.id) && this instanceof ItemDaedricArmor) {
			ItemStack[] armor = new ItemStack[] { new ItemStack(TDEArmors.daedric_boots), new ItemStack(TDEArmors.daedric_chestplate), new ItemStack(TDEArmors.daedric_leggings), new ItemStack(TDEArmors.daedric_helmet) }; //Create a new itemstack with each piece of your armor
			int gearCounter = 0;
			for (int i = 1; i < 5; i++) {
				if (player.getEquipmentInSlot(i) == armor[i]) {
					gearCounter++;
				}
			}
			if (gearCounter == 3) {
				player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 20, 0));
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 20, 1));
				player.addPotionEffect(new PotionEffect(Potion.resistance.id, 20, 0));
				gearCounter = 0;
			}

			/*
			 * if(net.kloudspace.kloudgear.util.core.ability.ArmorSet.armorSet
			 * == true) {
			 * if(net.kloudspace.kloudgear.util.core.ability.ArmorSet.
			 * scaleArmorSet == true) { player.addPotionEffect(new
			 * PotionEffect(Potion.damageBoost.id, 20, 0));
			 * player.addPotionEffect(new PotionEffect(Potion.fireResistance.id,
			 * 20, 1)); player.addPotionEffect(new
			 * PotionEffect(Potion.resistance.id, 20, 0)); } else
			 * if(net.kloudspace
			 * .kloudgear.util.core.ability.ArmorSet.thiefArmorSet == true) {
			 * player.addPotionEffect(new PotionEffect(Potion.damageBoost.id,
			 * 20, 0)); player.addPotionEffect(new
			 * PotionEffect(Potion.nightVision.id, 21 * 20, 0));
			 * player.capabilities.setPlayerWalkSpeed(0.15F);
			 * player.jumpMovementFactor = player.capabilities.getWalkSpeed() *
			 * 0.5F; } else
			 * if(net.kloudspace.kloudgear.util.core.ability.ArmorSet
			 * .tribalArmorSet) { player.addPotionEffect(new
			 * PotionEffect(Potion.damageBoost.id, 20, 0));
			 * player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 21
			 * * 20, 0)); player.addPotionEffect(new
			 * PotionEffect(Potion.jump.id, 2 * 20, 2)); }
			 * 
			 * else { System.out.println("Error"); }
			 */
			/*
			 * // player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id,
			 * 40)); }
			 */
		}
	}
}
