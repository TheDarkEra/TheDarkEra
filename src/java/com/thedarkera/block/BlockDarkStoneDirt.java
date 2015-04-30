package com.thedarkera.block;

import com.thedarkera.TheDarkEra;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockDarkStoneDirt extends Block{

	String name = "dark_stone_dirt";
	
	public BlockDarkStoneDirt(){
		super(Material.grass);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(1F);
		setStepSound(soundTypeGrass);
		setHarvestLevel("shovel", 1);
	}

}
