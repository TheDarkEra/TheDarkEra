package com.thedarkera.ingameobjects.block;

import net.minecraft.block.material.Material;

public class BlockEbonyOre extends ModBlock {

	public BlockEbonyOre(Material material, Float hardness, Float resistance, String name, String tool, int lvl) {
		super(material, hardness, resistance, name, tool, lvl);
		setStepSound(soundTypeStone);
	}
}
