package com.thedarkera.block.logs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.thedarkera.TheDarkEra;

public class BlockLogWisp extends Block {
	String name = "wisp_log";

	public BlockLogWisp() {
		super(Material.wood);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(1.5F);
		setResistance(2F);
		setStepSound(soundTypeWood);
	}
}
