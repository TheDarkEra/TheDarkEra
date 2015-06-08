package com.thedarkera.api.blocks;

import com.thedarkera.api.TDE;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class BlockTDEStairs extends BlockStairs {

	public BlockTDEStairs(Block textureFromBlock, int par2, Float blockHardness, Float blockResistance, String unlocalizedName, SoundType stepSound) {
		super(textureFromBlock, par2);
		setBlockName(unlocalizedName);
		setHardness(blockHardness);
		setResistance(blockResistance);
		setStepSound(stepSound);
		setCreativeTab(TDE.tabTDEBlocks);
	}

}
