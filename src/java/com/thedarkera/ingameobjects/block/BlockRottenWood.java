package com.thedarkera.ingameobjects.block;

import com.thedarkera.ingameobjects.ModBlock;

import net.minecraft.block.material.Material;

public class BlockRottenWood extends ModBlock {

	public BlockRottenWood(Material material, Float hardness, Float resistance, String name, String tool, int lvl) {
		super(material, hardness, resistance, name, tool, lvl);
		setStepSound(soundTypeWood);
	}
}
