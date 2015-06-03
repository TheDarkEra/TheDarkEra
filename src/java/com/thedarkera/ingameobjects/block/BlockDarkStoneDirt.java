package com.thedarkera.ingameobjects.block;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import com.thedarkera.TheDarkEra;
import com.thedarkera.ingameobjects.ModBlock;

public class BlockDarkStoneDirt extends ModBlock {
	private IIcon[] icons = new IIcon[6];

	public BlockDarkStoneDirt(Material material, Float hardness, Float resistance, String name, String tool, int lvl) {
		super(material, hardness, resistance, name, tool, lvl);
		setStepSound(soundTypeGrass);
	}

	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		for (int i = 0; i < icons.length; i++) {
			icons[i] = iconRegister.registerIcon("dirt");
		}
		icons[1] = iconRegister.registerIcon(TheDarkEra.MODID + ":" + "dark_stone_dirt");
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		return icons[side];
	}
}
