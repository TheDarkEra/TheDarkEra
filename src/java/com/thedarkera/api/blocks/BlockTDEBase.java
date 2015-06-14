package com.thedarkera.api.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.thedarkera.TheDarkEra;
import com.thedarkera.api.helper.ResourceHelper;

public class BlockTDEBase extends Block {
	
	public BlockTDEBase(String name, Material material) {
		super(material);
		
		setBlockName(name);
		setBlockTextureName(ResourceHelper.getResourceName(name));
		setCreativeTab(TheDarkEra.tabTDEBlocks);
	}
	
	public BlockTDEBase(String name, Material material, float hardness, float resistance) {
		this(name, material);
		
		setHardness(hardness);
		setResistance(resistance);
	}
	
	public BlockTDEBase(String name, Material material, String toolClass, int harvestLevel) {
		this(name, material);
		
		setHarvestLevel(toolClass, harvestLevel);
	}
	
	public BlockTDEBase(String name, Material material, SoundType stepSound) {
		this(name, material);
		
		setStepSound(stepSound);
	}
	
	public BlockTDEBase(String name, Material material, float hardness, float resistance, String toolClass, int harvestLevel) {
		this(name, material, hardness, resistance);

		setHarvestLevel(toolClass, harvestLevel);
	}
	
	public BlockTDEBase(String name, Material material, float hardness, float resistance, SoundType stepSound) {
		this(name, material, hardness, resistance);
		
		setStepSound(stepSound);
	}
	
	public BlockTDEBase(String name, Material material, String toolClass, int harvestLevel, SoundType stepSound) {
		this(name, material, toolClass, harvestLevel);
		
		setStepSound(stepSound);
	}
	
	public BlockTDEBase(String name, Material material, float hardness, float resistance, String toolClass, int harvestLevel, SoundType stepSound) {
		this(name, material, hardness, resistance);
		
		setHarvestLevel(toolClass, harvestLevel);
		setStepSound(stepSound);
	}
}
