package com.thedarkera.init;

import com.thedarkera.blocks.BlockEbonyOre;
import com.thedarkera.blocks.BlockSteelOre;
import com.thedarkera.items.ItemSteelOre;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class TDEBlocks
{
	public static Block ebony_ore;
	public static Block steel_ore;
	
	public static void init()
	{
			//Blocks//
		ebony_ore = new BlockEbonyOre();
		GameRegistry.registerBlock(ebony_ore, "Ebony_Ore");
		
			//Metdata Blocks//
		steel_ore = new BlockSteelOre();
		GameRegistry.registerBlock(steel_ore, ItemSteelOre.class, "Steel_Ore");	
		
	
		
	}
}
