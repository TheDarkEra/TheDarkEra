package com.thedarkera.ingameobjects.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.thedarkera.api.blocks.BlockTDEBase;
import com.thedarkera.init.TDEItems;

public class BlockDragonBoneOre extends BlockTDEBase {

	public BlockDragonBoneOre(Material material, Float hardness, Float resistance, String name, String tool, int lvl, Block.SoundType sound) {
		super(name, material, hardness, resistance, tool, lvl, sound);
	}

	@Override
	public Item getItemDropped(int meta, Random rand, int fortune) {
		return TDEItems.dragon_bone;
	}
}