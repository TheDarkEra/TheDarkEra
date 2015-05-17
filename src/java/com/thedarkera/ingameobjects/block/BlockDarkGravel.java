package com.thedarkera.ingameobjects.block;

import com.thedarkera.TheDarkEra;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;

public class BlockDarkGravel extends BlockFalling {
	public BlockDarkGravel(String name) {
		super(Material.gourd);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(0.3F);
		setStepSound(soundTypeGravel);
		setHarvestLevel("shovel", 0);
	}
}