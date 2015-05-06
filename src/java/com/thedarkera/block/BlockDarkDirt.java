package com.thedarkera.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.thedarkera.TheDarkEra;

public class BlockDarkDirt extends Block {
	public BlockDarkDirt(String name) {
		super(Material.gourd);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(0.3F);
		setStepSound(soundTypeGravel);
		setHarvestLevel("shovel", 0);
	}

}
