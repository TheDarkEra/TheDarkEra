package com.thedarkera.init;

import com.thedarkera.block.BlockEbonyOre;
import com.thedarkera.block.BlockSteelOre;
import com.thedarkera.item.ItemSteelOre;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class TDEBlocks
{
	public static Block ebony_ore;
	public static Block steel_ore;
	
	public static void init()
	{
		ebony_ore = new BlockEbonyOre();
		steel_ore = new BlockSteelOre();
		
		//for registering normal blocks//
	GameRegistry.registerBlock(ebony_ore, "Ebony_Ore");
	
		//for registering metadata Blocks//
	GameRegistry.registerBlock(steel_ore, ItemSteelOre.class, "Steel_Ore");	
		
	}
}
