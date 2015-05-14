package com.thedarkera.ingameobjects.block;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;

import com.thedarkera.TheDarkEra;

public class BlockRottenWoodSlab extends BlockSlab {
	String name = "rotten_wood_slab";
	String texture = "rotting_wood";

	public BlockRottenWoodSlab(boolean b, Material m) {
		super(b, m);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + texture);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(1F);
		setResistance(2.5F);
		setStepSound(soundTypeWood);
		setHarvestLevel("axe", 0);
	}

	@Override
	public String func_150002_b(int p_150002_1_) {
		return null;
	}

	// TODO: Add ability to stack slabs to make a block

}
