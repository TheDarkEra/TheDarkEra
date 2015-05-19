package com.thedarkera.ingameobjects.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

import com.thedarkera.TheDarkEra;

public class BlockRottenWoodStairs extends BlockStairs {
	String name = "rotten_wood_stairs";

	public BlockRottenWoodStairs(Block b, int i) {
		super(b, i);
		setBlockName(name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(1F);
		setResistance(2.5F);
		setStepSound(soundTypeWood);
		setHarvestLevel("axe", 0);
	}
}