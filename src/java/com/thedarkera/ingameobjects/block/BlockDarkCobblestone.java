package com.thedarkera.ingameobjects.block;

import com.thedarkera.ingameobjects.ModBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockDarkCobblestone extends ModBlock {

	public BlockDarkCobblestone(Material material, Float hardness, Float resistance, String name, String tool, int lvl, Block.SoundType sound) {
		super(material, hardness, resistance, name, tool, lvl, sound);
		setHarvestLevel(tool, lvl);
	}
}
