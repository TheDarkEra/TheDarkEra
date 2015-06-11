package com.thedarkera.ingameobjects.block.slabs;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.thedarkera.api.blocks.slabs.BlockTDEDoubleSlab;
import com.thedarkera.init.TDEBlocks;

public class BlockDarkStoneDoubleSlab extends BlockTDEDoubleSlab {

	public BlockDarkStoneDoubleSlab(String name, Material blockMaterial, Float blockHardness, SoundType stepSound, String textureName) {
		super(name, blockMaterial, blockHardness, blockHardness, stepSound, textureName);
	}
	
	 protected ItemStack createStackedBlock(int x)
	    {
	        return new ItemStack(Item.getItemFromBlock(TDEBlocks.dark_stone_slab), 2, x & 7);
	    }

}
