package com.thedarkera.api.blocks;

import net.minecraft.block.material.Material;

import com.thedarkera.TheDarkEra;

public class ModWool extends ModBlock{

	public ModWool(Material material, Float hardness, Float resistance, String name, String tool, int lvl, SoundType sound, String color, int id) {
		super(material, hardness, resistance, name, tool, lvl, sound);
		String BlockId = name + "." + id;
		String resource = TheDarkEra.MODID + ":" + name + "_" + color;
		
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
 * 1 - Red
 * 2 - Blue
 */