package com.thedarkera.ingameobjects.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.thedarkera.TheDarkEra;

public class BlockDarkWool extends Block{
	
	public BlockDarkWool(Material material, String color){
		super(material);
        String block = "dark_" + color + "_wool";
		
		setBlockName(block);
		setBlockTextureName(TheDarkEra.MODID + ":" + block);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(1F);
		setResistance(1F);
	}

}
