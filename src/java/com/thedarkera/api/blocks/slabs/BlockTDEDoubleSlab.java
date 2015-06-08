package com.thedarkera.api.blocks.slabs;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.thedarkera.api.blocks.BlockTDEBase;
import com.thedarkera.api.helper.ResourceHelper;
import com.thedarkera.init.TDEBlocks;
import com.thedarkera.init.TDEItems;

public class BlockTDEDoubleSlab extends BlockTDEBase { // BlockSlab

	public BlockTDEDoubleSlab(String name, Material material, float hardness, float resistance, SoundType stepSound, String textureName) {
		super(name, material, hardness, resistance, stepSound);
		setBlockTextureName(ResourceHelper.getSlabResourceName(textureName));
	}

	public int quantityDropped(int meta, int fortune, Random random) {
		fortune = 2;
		return fortune;
	}

	public Item getItemDropped(int par1, Random random, int par3) {
		return Item.getItemFromBlock(TDEBlocks.dark_stone_slab);
	}

	/**
	 * TODO: Double slab
	 */

}
