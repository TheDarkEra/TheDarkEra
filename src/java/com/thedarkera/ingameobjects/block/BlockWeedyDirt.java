package com.thedarkera.ingameobjects.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import com.thedarkera.TheDarkEra;
import com.thedarkera.api.blocks.ModBlock;

public class BlockWeedyDirt extends ModBlock {
	private IIcon[] icons = new IIcon[6];
	private String textureName = "weedy_dirt";

	public BlockWeedyDirt(Material material, Float hardness, Float resistance, String name, String tool, int lvl, Block.SoundType sound) {
		super(material, hardness, resistance, name, tool, lvl, sound);
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
