package com.thedarkera.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import net.minecraft.item.Item;

import com.thedarkera.TheDarkEra;
import com.thedarkera.init.TDETools;

public class BlockAncientOre extends Block {

	String name = "ancient_ore";

	public BlockAncientOre() {
		super(Material.gourd);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(1F);
		setResistance(5F);
		setStepSound(soundTypeSand);
		setHarvestLevel("pickaxe", 2);
	}

	@Override
	public Item getItemDropped(int meta, Random rand, int fortune) {
		return TDETools.ancient_hoe;
	}
}
