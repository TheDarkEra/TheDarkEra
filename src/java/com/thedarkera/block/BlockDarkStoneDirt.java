package com.thedarkera.block;

import com.thedarkera.TheDarkEra;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockDarkStoneDirt extends Block {
	private IIcon[] icons = new IIcon[6];
	String name = "dark_stone_dirt";

	public BlockDarkStoneDirt() {
		super(Material.grass);
		setBlockName(name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(1F);
		setStepSound(soundTypeGrass);
		setHarvestLevel("shovel", 1);
	}

	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		for (int i = 0; i < icons.length; i++) {
			icons[i] = iconRegister.registerIcon("dirt");
		}
		icons[1] = iconRegister.registerIcon(TheDarkEra.MODID + ":" + name);
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		return icons[side];
	}
}
