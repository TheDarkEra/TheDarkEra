package com.thedarkera.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.thedarkera.TheDarkEra;
import com.thedarkera.init.TDETools;

public class BlockAncientHoeOre extends Block {

	String name = "ancienthoe_ore";

	public BlockAncientHoeOre() {
		super(Material.gourd);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(1F);
		setResistance(5F);
		setStepSound(soundTypeSand);
		setHarvestLevel("shovel", 0);
	}

	@Override
	public Item getItemDropped(int meta, Random rand, int fortune) {
		return TDETools.ancient_hoe;
	}
}
