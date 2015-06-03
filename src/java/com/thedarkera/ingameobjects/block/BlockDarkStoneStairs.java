package com.thedarkera.ingameobjects.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

import com.thedarkera.TheDarkEra;

public class BlockDarkStoneStairs extends BlockStairs {
	String name = "dark_stone_stairs";

	public BlockDarkStoneStairs(Block block, int par2) {
		super(block, par2);
		setBlockName(name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(2F);
		setResistance(10F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 0);
	}
}
