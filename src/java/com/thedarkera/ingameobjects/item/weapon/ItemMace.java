package com.thedarkera.ingameobjects.item.weapon;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.google.common.collect.Multimap;
import com.thedarkera.TheDarkEra;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMace extends Item{ // ItemSword
	private float damage;
	private final ToolMaterial material;

	public ItemMace(ToolMaterial material) {
		this.material = material;
		maxStackSize = 1;
		setMaxDamage(material.getMaxUses());
		setCreativeTab(TheDarkEra.tabTDEItems);
		damage = 3.0F + material.getDamageVsEntity();
	}

	public float func_150931_i() {
		return material.getDamageVsEntity();
	}

	public float func_150893_a(ItemStack stack, Block block) {
		if (block == Blocks.web) {
			return 15.0F;
		} else {
			Material material = block.getMaterial();
			return material != Material.plants && material != Material.vine
					&& material != Material.coral
					&& material != Material.leaves
					&& material != Material.gourd ? 1.0F : 1.5F;
		}
	}

	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase entity,
			EntityLivingBase receive) {
		stack.damageItem(1, receive);
		return true;
	}

	@Override
	public boolean onBlockDestroyed(ItemStack stack, World world, Block block,
			int x, int y, int z, EntityLivingBase entity) {
		if ((double) block.getBlockHardness(world, x, y, z) != 0.0D) {
			stack.damageItem(2, entity);
		}

		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean isFull3D() {
		return true;
	}

	@Override
	public EnumAction getItemUseAction(ItemStack stack) {
		return EnumAction.block;
	}

	@Override
	public int getMaxItemUseDuration(ItemStack stack) {
		return 72000;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world,
			EntityPlayer player) {
		player.setItemInUse(stack, getMaxItemUseDuration(stack));
		return stack;
	}

	@Override
	public boolean func_150897_b(Block block) {
		return block == Blocks.web;
	}

	@Override
	public int getItemEnchantability() {
		return material.getEnchantability();
	}

	public String getToolMaterialName() {
		return material.toString();
	}

	@Override
	public boolean getIsRepairable(ItemStack stack, ItemStack repairWith) {
		ItemStack mat = material.getRepairItemStack();
		if (mat != null
				&& net.minecraftforge.oredict.OreDictionary.itemMatches(mat,
						repairWith, false))
			return true;
		return super.getIsRepairable(stack, repairWith);
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes", "deprecation" })
	public Multimap getItemAttributeModifiers() {
		Multimap multimap = super.getItemAttributeModifiers();
		multimap.put(SharedMonsterAttributes.attackDamage
				.getAttributeUnlocalizedName(), new AttributeModifier(
				field_111210_e, "Weapon modifier", (double) damage, 0));
		return multimap;
	}
}
