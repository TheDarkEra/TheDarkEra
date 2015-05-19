package com.thedarkera.ingameobjects.item;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

import com.thedarkera.TheDarkEra;
import com.thedarkera.init.TDEBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSaplingBlocks extends ItemBlock {

	public static final String[] saplings = TDEBlocks.allTreeTypes;
	private static IIcon[] saplingicon = new IIcon[saplings.length];

	public ItemSaplingBlocks(Block block) {
		super(block);
		this.hasSubtypes = true;
	}

	public String getUnlocalizedName(ItemStack itemstack) {
		int i = itemstack.getItemDamage();
		if (i < 0 || i >= saplings.length) {
			i = 0;
		}
		return super.getUnlocalizedName() + "_" + saplings[i];
	}

	public int getMetadata(int Meta) {
		return Meta;
	}

	/** * Gets an icon index based on an item's damage value */
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int meta) {
		int j = MathHelper.clamp_int(meta, 0, saplings.length);
		return saplingicon[j];
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iicon) {
		this.saplingicon = new IIcon[saplings.length];
		for (int i = 0; i < saplings.length; ++i) {
			saplingicon[i] = iicon.registerIcon(TheDarkEra.MODID + ":saplings/" + saplings[i] + "_sapling");
		}
	}
}
