package com.thedarkera.ingameobjects.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.thedarkera.api.blocks.BlockTDEBase;
import com.thedarkera.init.TDEBlocks;

public class BlockDarkStone extends BlockTDEBase {

	public BlockDarkStone(Material material, Float hardness, Float resistance, String name, String tool, int lvl, Block.SoundType sound) {
		super(name, material, hardness, resistance, tool, lvl, sound);
	}

	@Override
	public Item getItemDropped(int a, Random b, int c) {
		return Item.getItemFromBlock(TDEBlocks.dark_cobblestone);
	}
}
