package com.thedarkera.ingameobjects.block;

import net.minecraft.block.BlockTorch;

import com.thedarkera.TheDarkEra;

public class BlockLamp extends BlockTorch {
	
	private String name = "lamp";
	
	public BlockLamp(){
		setCreativeTab(TheDarkEra.tabTDEBlocks);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + name);
	}
}
