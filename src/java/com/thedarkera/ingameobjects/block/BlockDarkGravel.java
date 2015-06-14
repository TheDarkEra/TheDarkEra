package com.thedarkera.ingameobjects.block;

import java.util.Random;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.thedarkera.TheDarkEra;

public class BlockDarkGravel extends BlockFalling {
	public BlockDarkGravel(String name) {
		super(Material.gourd);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDEBlocks);
		setHardness(0.3F);
		setStepSound(soundTypeGravel);
		setHarvestLevel("shovel", 0);
	}
	
	public Item getItemDropped(int par1, Random rand, int par2) {
		if (par2 > 3) {
			par2 = 3;
		}

		return rand.nextInt(10 - par2 * 3) == 0 ? Items.flint : Item.getItemFromBlock(this);
	}
}