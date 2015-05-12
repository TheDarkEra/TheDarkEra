package com.thedarkera.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.thedarkera.TheDarkEra;
import com.thedarkera.init.TDEItems;

public class BlockDragonBoneOre extends Block {

	String name = "dragon_bone_ore";

	public BlockDragonBoneOre() {
		super(Material.rock);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(1F);
		setResistance(5F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 4);
	}

	@Override
	public Item getItemDropped(int meta, Random rand, int fortune) {
		return TDEItems.dragon_bone;
	}
}
