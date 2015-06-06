package com.thedarkera.ingameobjects.block;

import net.minecraft.block.material.Material;

import com.thedarkera.TheDarkEra;
import com.thedarkera.api.blocks.BlockTDEBase;

public class BlockWool extends BlockTDEBase{

	public BlockWool(Material material, Float hardness, Float resistance, String name, String tool, int lvl, SoundType sound) {
		super(name, material, hardness, resistance, tool, lvl, sound);
		String BlockId = name;
		String i = "will be the meta eventually";
		String resource = TheDarkEra.MODID + ":" + name + "_" + i;
		
		setBlockName(BlockId); // Blocks are called name.id but use name_id in recipes etc
		setBlockTextureName(resource); // Texture are name_color
		setHarvestLevel(tool, lvl);
	}

}


/**
 * Using id to make it easier for the future when I will switch it to use meta.
 * Make Id's the same as the clay Id's and Dye Id's to make it easier!!
 * 
 * Id's
 * 0 - Red
 * 1 - Blue
 * 2 - Green
 */