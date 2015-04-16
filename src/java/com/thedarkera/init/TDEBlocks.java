package com.thedarkera.init;

import net.minecraft.block.Block;

import com.thedarkera.block.BlockEbonyOre;
import com.thedarkera.block.BlockSteel;
import com.thedarkera.item.ItemSteelOre;

import cpw.mods.fml.common.registry.GameRegistry;

public class TDEBlocks
{
	public static Block ebony_ore;
	public static Block steel_ore;
	
	public static void init()
	{
			//Blocks//
		ebony_ore = new BlockEbonyOre();
		steel_ore = new BlockSteel();	
		// Meta Blocks
		GameRegistry.registerBlock(steel_ore, ItemSteelOre.class, steel_ore.getUnlocalizedName());
		GameRegistry.registerBlock(ebony_ore, ebony_ore.getUnlocalizedName());		
	}
}
