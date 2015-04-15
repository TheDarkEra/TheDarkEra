package com.darkteam.thedarkera.blocks;

import com.darkteam.thedarkera.items.ItemSamStone;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks 
{
    public static Block samStone;
    public static Block samPlant;
    public static Block samTE;
    public static Block smasherTE;
	
	public static void loadBlocks()
	{
		samStone = new BlockSamStone();
    	samPlant = new BlockSamPlant();
    	samTE = new BlockSamTE();
    	smasherTE = new BlockSmasherTE();
    	
    	GameRegistry.registerBlock(samStone, ItemSamStone.class, "SamStone");
    	GameRegistry.registerBlock(samPlant, "SamPlant");
    	GameRegistry.registerBlock(samTE, "SamTE");
    	GameRegistry.registerBlock(smasherTE, "SmasherTE");
	}
}
