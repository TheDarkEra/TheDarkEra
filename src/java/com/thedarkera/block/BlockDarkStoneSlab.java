package com.thedarkera.block;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import com.thedarkera.TheDarkEra;

public class BlockDarkStoneSlab extends BlockSlab {
	String name = "dark_stone_slab";
	private IIcon[] icons = new IIcon[6];

	public BlockDarkStoneSlab(boolean b, Material m) {
		super(b, m);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(2F);
		setResistance(10F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 0);
	}

	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		icons[0] = iconRegister.registerIcon(TheDarkEra.MODID + ":" + name + "_top");
		icons[1] = iconRegister.registerIcon(TheDarkEra.MODID + ":" + name + "_top");
		icons[2] = iconRegister.registerIcon(TheDarkEra.MODID + ":" + name);
		icons[3] = iconRegister.registerIcon(TheDarkEra.MODID + ":" + name);
		icons[4] = iconRegister.registerIcon(TheDarkEra.MODID + ":" + name);
		icons[5] = iconRegister.registerIcon(TheDarkEra.MODID + ":" + name);
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		return icons[side];
	}

	@Override
	public String func_150002_b(int p_150002_1_) {
		return null;
	}

	// TODO: Add ability to stack slabs to make a block and fix lighting
}
