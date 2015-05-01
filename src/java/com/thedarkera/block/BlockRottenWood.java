package com.thedarkera.block;

import java.util.Random;

import com.thedarkera.TheDarkEra;
import com.thedarkera.init.TDEBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockRottenWood extends Block{

	String name = "rotten_wood";
	String texture = "rotting_wood";
	
	public BlockRottenWood(){
		super(Material.wood);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + texture);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(1.5F);
		setResistance(2F);
		setStepSound(soundTypeWood);
	}

}