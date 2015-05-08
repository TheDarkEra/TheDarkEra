package com.thedarkera.block;

import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;

import com.thedarkera.TheDarkEra;

public class BlockCrackedGlassPane extends BlockPane {

	private String name = "cracked_glass_pane";
	
	public BlockCrackedGlassPane(String texture, String unknown, Material material, boolean p_i45432_4_) {
		super(texture, unknown, material, p_i45432_4_);
		setCreativeTab(TheDarkEra.tabTDE);
		setBlockName(name);
		setHardness(0.3F);
		setResistance(0F);
		setStepSound(soundTypeGlass);
	}
	
}