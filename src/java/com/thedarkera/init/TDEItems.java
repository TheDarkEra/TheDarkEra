package com.thedarkera.init;

import net.minecraft.item.Item;

import com.thedarkera.item.ItemSoulGem;
import com.thedarkera.item.food.ItemGrape;
import com.thedarkera.item.food.ItemGrapeSeed;

import cpw.mods.fml.common.registry.GameRegistry;

public class TDEItems
{
		//Misc items//
	public static Item soul_gem;
		
		//Food items//
	public static Item grape;
	
		//Seed items//
	public static Item grape_seed;
	
	public static void init()
	{	
		//Misc items init//
		soul_gem = new ItemSoulGem();
		GameRegistry.registerItem(soul_gem, soul_gem.getUnlocalizedName());
		
		//Food items init//
		grape = new ItemGrape(3, 0.3F, true, "grape");
		GameRegistry.registerItem(grape, "Grape");
		
		//Seed items//
		grape_seed = new ItemGrapeSeed(TDEBlocks.grape_plant);
		GameRegistry.registerItem(grape_seed, "Grape_Seed");
		
	}
}
