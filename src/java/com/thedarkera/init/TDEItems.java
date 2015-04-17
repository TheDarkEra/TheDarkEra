package com.thedarkera.init;

import net.minecraft.item.Item;

import com.thedarkera.item.ItemAncientIngot;
import com.thedarkera.item.ItemEbonyIngot;
import com.thedarkera.item.ItemLeatherStrips;
import com.thedarkera.item.ItemOrichalcumIngot;
import com.thedarkera.item.ItemSoulGem;
import com.thedarkera.item.ItemSteelIngot;
import com.thedarkera.item.food.ItemGrape;
import com.thedarkera.item.food.ItemGrapeSeed;

import cpw.mods.fml.common.registry.GameRegistry;

public class TDEItems
{
		//Misc items//
	public static Item soul_gem;
	public static Item leather_strips;
	
		//Ingot items//
	public static Item steel_ingot;
	public static Item ebony_ingot;
	public static Item orichalcum_ingot;
	public static Item ancient_ingot;
		
		//Food items//
	public static Item grape;
	
		//Seed items//
	public static Item grape_seed;
	
	public static void init()
	{	
		//Misc items init//
		soul_gem = new ItemSoulGem();
		GameRegistry.registerItem(soul_gem, soul_gem.getUnlocalizedName());
		leather_strips = new ItemLeatherStrips();
		GameRegistry.registerItem(leather_strips, "Leather_Strips");
		
		//Ingot items init//
		steel_ingot = new ItemSteelIngot();
		GameRegistry.registerItem(steel_ingot, "Steel_Ingot");
		ebony_ingot = new ItemEbonyIngot();
		GameRegistry.registerItem(ebony_ingot, "Ebony_Ingot");
		orichalcum_ingot = new ItemOrichalcumIngot();
		GameRegistry.registerItem(orichalcum_ingot, "Orichalcum_Ingot");
		ancient_ingot = new ItemAncientIngot();
		GameRegistry.registerItem(ancient_ingot, "Ancient_Ingot");
		
		//Food items init//
		grape = new ItemGrape(3, 0.3F, true, "grape");
		GameRegistry.registerItem(grape, "Grape");
		
		//Seed items//
		grape_seed = new ItemGrapeSeed(TDEBlocks.grape_plant);
		GameRegistry.registerItem(grape_seed, "Grape_Seed");
		
	}
}
