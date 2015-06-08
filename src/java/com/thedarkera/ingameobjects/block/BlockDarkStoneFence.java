package com.thedarkera.ingameobjects.block;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;

import com.thedarkera.TheDarkEra;
import com.thedarkera.api.TDE;

public class BlockDarkStoneFence extends BlockFence {
	String name = "dark_stone_fence";
	String texture = "dark_stone";

	public BlockDarkStoneFence(String string) {
		super(string, Material.rock);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + texture);
		setCreativeTab(TDE.tabTDEBlocks);
		setHardness(1.5F);
		setResistance(10F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 0);
	}

}
