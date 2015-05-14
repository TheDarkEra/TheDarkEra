package com.thedarkera.ingameobjects.block;

import com.thedarkera.TheDarkEra;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockDarkCobblestone extends Block {
	String name = "dark_cobblestone";

	public BlockDarkCobblestone() {
		super(Material.rock);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(2F);
		setResistance(10F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 0);
	}
}
