package com.thedarkera.ingameobjects.block;

import com.thedarkera.api.blocks.ModBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockDarkSand extends ModBlock {

	public BlockDarkSand(Material material, Float hardness, Float resistance, String name, String tool, int lvl, Block.SoundType sound) {
		super(material, hardness, resistance, name, tool, lvl, sound);
	}
}