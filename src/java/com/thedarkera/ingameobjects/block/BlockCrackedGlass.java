package com.thedarkera.ingameobjects.block;

import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;

import com.thedarkera.TheDarkEra;

public class BlockCrackedGlass extends BlockGlass{ //Blocks

	private String name = "cracked_glass";
	
	public BlockCrackedGlass(Material material, boolean p_i45408_2_) {
		super(material, p_i45408_2_);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(0.3F);
		setResistance(0F);
		setStepSound(soundTypeGlass);
		setBlockTextureName(TheDarkEra.MODID + ":" + name);
		setBlockName(name);
	}

}
