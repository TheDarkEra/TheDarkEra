package com.thedarkera.api.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.thedarkera.TheDarkEra;

public class ModBlock extends Block{
	
	public ModBlock(Material material, Float hardness, Float resistance, String name, String tool, int lvl, Block.SoundType sound){
		super(material);
		String block = name;
		String resource = TheDarkEra.MODID + ":" + block;
		
		//setHarvestLevel(tool, lvl); //Just add this to the block class its self
		setBlockName(block);
		setBlockTextureName(resource);
		setCreativeTab(TheDarkEra.tabTDE);
		setResistance(resistance);
		setHardness(hardness);
		setStepSound(sound);
	}

}
