package com.thedarkera.ingameobjects.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.thedarkera.TheDarkEra;
import com.thedarkera.ingameobjects.ModBlock;
import com.thedarkera.init.TDEItems;

public class BlockDragonBoneOre extends ModBlock {

	public BlockDragonBoneOre(Material material, Float hardness, Float resistance, String name, String tool, int lvl) {
		super(material, hardness, resistance, name, tool, lvl);
		setStepSound(soundTypeStone);
	}

	@Override
	public Item getItemDropped(int meta, Random rand, int fortune) {
		return TDEItems.dragon_bone;
	}
}