package com.thedarkera.block;

import com.thedarkera.TheDarkEra;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockDeadGrass extends Block{

	String name = "dead_grass";
	
	public BlockDeadGrass(){
		super(Material.grass);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(0.4F);
		setStepSound(soundTypeGrass);
		setHarvestLevel("shovel", 0);
	}
	
	/**
	 * Future:
	 * Needs to have dirt texture on sides, bottom and dead_grass on top.
	 */

}
