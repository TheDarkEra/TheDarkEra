package com.thedarkera.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.thedarkera.TheDarkEra;

public class BlockDarkDirt extends Block
{
	private String textureName = "dark_dirt";
	
	public BlockDarkDirt(String name)
	{
		super(Material.gourd);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + textureName);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(0.3F);
		setStepSound(soundTypeGravel);
		setHarvestLevel("shovel", 0);
	}

}
