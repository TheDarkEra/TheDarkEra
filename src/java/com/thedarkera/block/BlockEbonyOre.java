package com.thedarkera.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.thedarkera.TheDarkEra;

public class BlockEbonyOre extends Block {
	
	String name = "ebony_ore";
	
	public BlockEbonyOre()
	{
		super(Material.rock);
		setBlockName(name);
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

