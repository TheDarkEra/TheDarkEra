package com.thedarkera.ingameobjects.block;

import net.minecraft.block.BlockTorch;

import com.thedarkera.TheDarkEra;
import com.thedarkera.api.TDE;

public class BlockLamp extends BlockTorch {
	
	private String name = "lamp";
	
	public BlockLamp(){
		setCreativeTab(TDE.tabTDEBlocks);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + name);
	}
}
