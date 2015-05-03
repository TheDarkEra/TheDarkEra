package com.thedarkera.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.thedarkera.TheDarkEra;
import com.thedarkera.init.TDETools;


public class BlockAncientPickaxeOre extends Block {
	
	String name = "ancientpickaxe_ore";
	
	public BlockAncientPickaxeOre()
	{
		super(Material.rock);
		setBlockName(name);
		setBlockTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
		setHardness(2F);
		setResistance(5F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public Item getItemDropped(int meta, Random rand, int fortune)
	{
		return TDETools.ancient_pickaxe;
	}
	


}

