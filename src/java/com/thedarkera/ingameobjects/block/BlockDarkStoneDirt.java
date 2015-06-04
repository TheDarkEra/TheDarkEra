package com.thedarkera.ingameobjects.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import com.thedarkera.TheDarkEra;
import com.thedarkera.api.blocks.ModBlock;

public class BlockDarkStoneDirt extends ModBlock {
	private IIcon[] icons = new IIcon[6];

	public BlockDarkStoneDirt(Material material, Float hardness, Float resistance, String name, String tool, int lvl, Block.SoundType sound) {
		super(material, hardness, resistance, name, tool, lvl, sound);
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
