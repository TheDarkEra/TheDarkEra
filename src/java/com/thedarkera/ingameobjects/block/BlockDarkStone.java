package com.thedarkera.ingameobjects.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.thedarkera.ingameobjects.ModBlock;
import com.thedarkera.init.TDEBlocks;

public class BlockDarkStone extends ModBlock {

	public BlockDarkStone(Material material, Float hardness, Float resistance, String name, String tool, int lvl, Block.SoundType sound) {
		super(material, hardness, resistance, name, tool, lvl, sound);
		setHarvestLevel(tool, lvl);
	}

	@Override
	public Item getItemDropped(int a, Random b, int c) {
		return Item.getItemFromBlock(TDEBlocks.dark_cobblestone);
	}
}
