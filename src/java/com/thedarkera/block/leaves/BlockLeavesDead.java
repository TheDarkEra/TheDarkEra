package com.thedarkera.block.leaves;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

public class BlockLeavesDead extends BlockModLeavesBase{

	private String name = "dead_leaves";
	Block sapling = Blocks.sapling;
	
	public BlockLeavesDead(Material material) {
		super(material);
		setBlockName(name);
		setBlockTextureName(name);
	}
	
	/* TODO: Make override for dropping saplings
	 */

}
