package com.thedarkera.block;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;

import com.thedarkera.TheDarkEra;

public class BlockDarkStoneSlab extends BlockSlab{

	String name = "dark_stone_slab";
	String texture = "dark_stone";
	
	public BlockDarkStoneSlab(boolean b, Material m){
		super(b, m);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + texture);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(2F);
		setResistance(10F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 0);
	}

	@Override
	public String func_150002_b(int p_150002_1_) {
		return null;
	}

	//Can't place slab on top of another slab to make a block, needs to be fixed.
	
}
