package com.thedarkera.ingameobjects.block;

import net.minecraft.block.material.Material;

import com.thedarkera.TheDarkEra;
import com.thedarkera.api.blocks.BlockTDEBase;

public class BlockClay extends BlockTDEBase {

	public BlockClay(Material material, Float hardness, Float resistance, String name, String tool, int lvl, SoundType sound) {
		super(name, material, hardness, resistance, tool, lvl, sound);
		String i = "will be the meta eventually";
		String resource = TheDarkEra.MODID + ":" + name + "_" + i;
		
		setBlockTextureName(resource);
	}
}


/**
 * Using id to make it easier for the future when I will switch it to use meta.
 * Make Id's the same as the wool Id's and Dye Id's to make it easier!!
 * 
 * Id's
 * 0 - Red
 * 1 - Blue
 * 2 - Green
 */