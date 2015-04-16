package com.thedarkera.blocks;

import java.util.Random;

import com.thedarkera.TheDarkEra;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class BlockEbonyOre extends Block {
	
	String name = "ebonyOre";
	
	public BlockEbonyOre()
	{
		super(Material.rock);
		setBlockName(TheDarkEra.MODID + "_" + name);
		setBlockTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(2F);
		setResistance(5F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 2);
	}
	
//	@Override
//	public Item getItemDropped(int meta, Random rand, int fortune)
	//{
	//	return TheDarkEra.samdust;
//	}
}

