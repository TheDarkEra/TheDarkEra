package com.thedarkera.ingameobjects.block;

import com.thedarkera.TheDarkEra;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockDarkStoneBricks extends Block {
	String name = "dark_stone_bricks";

	public BlockDarkStoneBricks() {
		super(Material.rock);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(1.5F);
		setResistance(10F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 0);
	}
}
