package com.thedarkera.ingameobjects.block;

import com.thedarkera.api.blocks.BlockTDEBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockEbonyOre extends BlockTDEBase {

	public BlockEbonyOre(Material material, Float hardness, Float resistance, String name, String tool, int lvl, Block.SoundType sound) {
		super(name, material, hardness, resistance, tool, lvl, sound);
	}
}
