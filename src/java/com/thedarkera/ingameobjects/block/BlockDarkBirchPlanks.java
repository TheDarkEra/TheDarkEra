package com.thedarkera.ingameobjects.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.thedarkera.api.blocks.BlockTDEBase;

public class BlockDarkBirchPlanks extends BlockTDEBase {

	public BlockDarkBirchPlanks(Material material, Float hardness, Float resistance, String name, String tool, int lvl, Block.SoundType sound) {
		super(name, material, hardness, resistance, tool, lvl, sound);
	}
}
