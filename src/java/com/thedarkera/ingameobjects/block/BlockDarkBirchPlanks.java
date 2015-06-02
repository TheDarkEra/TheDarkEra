package com.thedarkera.ingameobjects.block;

import com.thedarkera.TheDarkEra;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockDarkBirchPlanks extends ModBlock {

	public BlockDarkBirchPlanks(Material material, Float hardness, Float resistance, String name, String tool, int lvl) {
		super(material, hardness, resistance, name, tool, lvl);
		setStepSound(soundTypeStone);
	}
}
