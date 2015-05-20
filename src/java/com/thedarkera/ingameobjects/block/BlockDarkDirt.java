package com.thedarkera.ingameobjects.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.thedarkera.TheDarkEra;

public class BlockDarkDirt extends Block { // BlockDirt
	public BlockDarkDirt(String name) {
		super(Material.gourd);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(0.3F);
		setStepSound(soundTypeGravel);
		setHarvestLevel("shovel", 0);
	}


}