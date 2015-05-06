package com.thedarkera.block.leaves;

import com.thedarkera.TheDarkEra;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockModLeavesBase extends Block{

	public BlockModLeavesBase(Material material) {
		super(material);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(1F);
		setResistance(1F);
	}
	
	/* TODO: Make the block decay if no logs are touching the block
	 *       Make leaves have a chance to drop saplings (will be override in leaves class to determine the sapling. will be Blocks.sapling by default.)
	 * 		 Make leaves shearable
	 * 		 Make leaves not drop a block (unless sapling)
	 */

}
