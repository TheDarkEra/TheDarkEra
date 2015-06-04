package com.thedarkera.api.blocks;

import net.minecraft.block.material.Material;

import com.thedarkera.TheDarkEra;

public class ModClay extends ModBlock{

	public ModClay(Material material, Float hardness, Float resistance, String name, String tool, int lvl, SoundType sound, String color, int id) {
		super(material, hardness, resistance, name, tool, lvl, sound);
		String BlockId = name + "." + id;
		String resource = TheDarkEra.MODID + ":" + name + "_" + color;
		
		setBlockName(BlockId); // This means when making recipes use name_id for now
		setBlockTextureName(resource); // Texture are name_color
		setHarvestLevel(tool, lvl);
	}

}


/**
 * Using id to make it easier for the future when I will switch it to use meta.
 * Make Id's the same as the wool Id's and Dye Id's to make it easier!!
 * 
 * Id's
 * 1 - Red
 * 2 - Blue
 */