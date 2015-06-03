package com.thedarkera.ingameobjects.block;

import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;

import com.thedarkera.TheDarkEra;

public class BlockCrackedGlassPane extends BlockPane {

	private String name = "cracked_glass_pane";
	
	public BlockCrackedGlassPane(String texture, String par2, Material material, boolean par4) {
		super(texture, par2, material, par4);
		setCreativeTab(TheDarkEra.tabTDE);
		setBlockName(name);
		setHardness(0.3F);
		setResistance(0F);
		setStepSound(soundTypeGlass);
	}
	
}