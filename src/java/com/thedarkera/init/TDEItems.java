package com.thedarkera.init;

import net.minecraft.item.Item;

import com.thedarkera.item.ItemSoulGem;
import com.thedarkera.item.food.ItemGrape;

import cpw.mods.fml.common.registry.GameRegistry;

public class TDEItems
{
		//Misc items//
	public static Item soul_gem;
		
		//Food items//
	public static Item grape;
	
	public static void init()
	{	
		//Misc items init//
		soul_gem = new ItemSoulGem();
		GameRegistry.registerItem(soul_gem, soul_gem.getUnlocalizedName());
		
		//Food items init//
		grape = new ItemGrape(3, 0.3F, true, "grape");
		GameRegistry.registerItem(grape, "Grape");
		
	}
}
