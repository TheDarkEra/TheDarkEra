package com.thedarkera.api.blocks.slabs;

import net.minecraft.block.material.Material;

import com.thedarkera.api.blocks.BlockTDEBase;
import com.thedarkera.api.helper.ResourceHelper;

public class BlockTDESlab extends BlockTDEBase { // BlockSlab

	public BlockTDESlab(String name, Material material, float hardness, float resistance, SoundType stepSound) {
		super(name, material, hardness, resistance, stepSound);
		setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
		setLightOpacity(255);
		setBlockTextureName(ResourceHelper.getSlabResourceName(name));
	}

	/** TODO:
	 * 	Double slab
	 * 	Fix lighting
	 */
	

}
