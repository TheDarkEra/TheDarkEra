package com.thedarkera.block;

import com.thedarkera.TheDarkEra;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockDarkBirchPlanks extends Block
{
	String name = "dark_birch_planks";
	
	public BlockDarkBirchPlanks()
	{
		super(Material.wood);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(1.5F);
		setResistance(10F);
		setStepSound(soundTypeStone);
		setHarvestLevel("axe", 0);
	}
}
