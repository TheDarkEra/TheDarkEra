package com.thedarkera.block;

import com.thedarkera.TheDarkEra;

import net.minecraft.block.BlockLadder;

public class BlockDarkStoneLadder extends BlockLadder{
	
	String name = "dark_stone_ladder";
	
	public BlockDarkStoneLadder(){
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(1.5F);
		setResistance(10F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 0);
	}

}
