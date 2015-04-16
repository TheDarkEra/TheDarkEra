package com.thedarkera.init;

import com.thedarkera.block.BlockEbonyOre;
import com.thedarkera.block.BlockSteel;
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
		steel_ore = new BlockSteel();
		
		// Blocks
		GameRegistry.registerBlock(ebony_ore, "Ebony_Ore");
	
		// Meta Blocks
		GameRegistry.registerBlock(steel_ore, ItemSteelOre.class, steel_ore.getUnlocalizedName());	
		
	}
}
