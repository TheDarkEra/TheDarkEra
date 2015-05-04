package com.thedarkera.block;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;

import com.thedarkera.TheDarkEra;

public class BlockRottenWoodFence extends BlockFence
{
	String name = "rotten_wood_fence";
	String texture = "rotting_wood";
	
	public BlockRottenWoodFence(String s)
	{
		super(s, Material.wood);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + texture);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(1F);
		setResistance(2.5F);
		setStepSound(soundTypeWood);
		setHarvestLevel("axe", 0);
	}
}
