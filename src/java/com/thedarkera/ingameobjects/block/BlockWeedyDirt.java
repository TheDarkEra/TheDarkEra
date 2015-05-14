package com.thedarkera.ingameobjects.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import com.thedarkera.TheDarkEra;

public class BlockWeedyDirt extends Block {
	private IIcon[] icons = new IIcon[6];
	private String textureName = "weedy_dirt";

	public BlockWeedyDirt(String name) {
		super(Material.grass);
		setBlockName(name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(0.4F);
		setStepSound(soundTypeGrass);
		setHarvestLevel("shovel", 0);
	}

	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		for (int i = 0; i < icons.length; i++) {
			icons[i] = iconRegister.registerIcon(TheDarkEra.MODID + ":"
					+ textureName);
		}
		icons[1] = iconRegister.registerIcon(TheDarkEra.MODID + ":"
				+ textureName + "_top");
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		return icons[side];
	}

}
