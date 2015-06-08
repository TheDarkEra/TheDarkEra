package com.thedarkera.ingameobjects.block;

import net.minecraft.block.BlockLadder;

import com.thedarkera.TheDarkEra;
import com.thedarkera.api.TDE;

public class BlockDarkStoneLadder extends BlockLadder {
	String name = "dark_stone_ladder";

	public BlockDarkStoneLadder() {
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TDE.tabTDEBlocks);
		setHardness(1.5F);
		setResistance(10F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 0);
	}
}
