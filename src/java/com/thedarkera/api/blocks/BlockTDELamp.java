package com.thedarkera.api.blocks;

import net.minecraft.block.material.Material;

public class BlockTDELamp extends BlockTDEBase {

	public BlockTDELamp(String name, Material material, float hardness, float resistance, String toolClass, int harvestLevel, SoundType stepSound, Float lightLevel) {
		super(name, material, hardness, resistance, toolClass, harvestLevel, stepSound);
		setLightLevel(lightLevel);
	}
	
}
