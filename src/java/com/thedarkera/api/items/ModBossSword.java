package com.thedarkera.api.items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.thedarkera.api.TDE;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModBossSword extends Item {
	private float field_150934_a;
	private final Item.ToolMaterial field_150933_b;
	private static final String __OBFID = "CL_00000072";

	public ModBossSword(ToolMaterial material) {
		setCreativeTab(TDE.tabTDEItems);

		field_150933_b = material;
		maxStackSize = 1;
		setMaxDamage(material.getMaxUses());
		field_150934_a = 10.0F + material.getDamageVsEntity();
	}

	/** Damage **/
	public float func_150931_i() {
		return this.field_150933_b.getDamageVsEntity();
	}

	/**  **/
	public float func_150893_a(ItemStack stack, Block block) {
		if (block == Blocks.web) {
			return 15.0F;
		} else {
			Material material = block.getMaterial();
			return material != Material.plants && material != Material.vine && material != Material.coral && material != Material.leaves && material != Material.gourd ? 1.0F : 1.5F;
		}
	}

	/** Damage **/
	public boolean hitEntity(ItemStack stack, EntityLivingBase par2, EntityLivingBase par3) {
		stack.damageItem(1, par3);
		return true;
	}

	/**  **/
	public boolean onBlockDestroyed(ItemStack par1, World world, Block block, int par4, int par5, int par6, EntityLivingBase par7) {
		if ((double) block.getBlockHardness(world, par4, par5, par6) != 0.0D) {
			par1.damageItem(2, par7);
		}

		return true;
	}

	/** Renders in 3D **/
	@SideOnly(Side.CLIENT)
	public boolean isFull3D() {
		return true;
	}

	/** Block **/
	public EnumAction getItemUseAction(ItemStack stack) {
		return EnumAction.block;
	}

	/** Duration **/
	public int getMaxItemUseDuration(ItemStack stack) {
		return 100000;
	}

	/**  **/
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
		return stack;
	}

	/** Can break webs **/
	public boolean func_150897_b(Block block) {
		return block == Blocks.web;
	}

	/**
	 * Override this in sword classes
	 * 
	 * @Override
	 * @SideOnly(Side.CLIENT) public void addInformation(ItemStack stack,
	 *                        EntityPlayer player, List tooltip, boolean
	 *                        advanced) { tooltip.add("");
	 *                        tooltip.add("Attack Damage:" +
	 *                        EnumChatFormatting.DARK_RED + " Enough...");
	 *                        tooltip.add("Obtained by killing the Boss: " +
	 *                        EnumChatFormatting.DARK_BLUE +
	 *                        "Need to add Boss"); }
	 **/

}
