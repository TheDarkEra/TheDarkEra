package com.thedarkera.api.blocks.slabs;

import java.util.Random;

import net.minecraft.block.material.Material;

import com.thedarkera.api.blocks.BlockTDEBase;
import com.thedarkera.api.helper.ResourceHelper;

public class BlockTDEDoubleSlab extends BlockTDEBase { // BlockSlab

	public BlockTDEDoubleSlab(String name, Material material, float hardness, float resistance, SoundType stepSound, String textureName) {
		super(name, material, hardness, resistance, stepSound);
		setBlockTextureName(ResourceHelper.getSlabResourceName(textureName));
	}

	public int quantityDropped(int meta, int fortune, Random random) {
		fortune = 2;
		return fortune;
	}

	/**
	 * TODO: Double slab
	 */

}
