package com.thedarkera.ingameobjects.block;

import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;

import com.thedarkera.TheDarkEra;

public class BlockCrackedGlass extends BlockGlass{ //Blocks

	private String name = "cracked_glass";
	
	public BlockCrackedGlass(Material material, boolean par2) {
		super(material, par2);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(0.3F);
		setResistance(0F);
		setStepSound(soundTypeGlass);
		setBlockTextureName(TheDarkEra.MODID + ":" + name);
		setBlockName(name);
	}

}
