package com.thedarkera.init;

import net.minecraft.item.Item;

import com.thedarkera.item.ItemAncientIngot;
import com.thedarkera.item.ItemDaedraHeart;
import com.thedarkera.item.ItemDragonBone;
import com.thedarkera.item.ItemDragonScale;
import com.thedarkera.item.ItemEbonyIngot;
import com.thedarkera.item.ItemLeatherStrip;
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
	public static Item leather_strip;
	public static Item daedra_heart;
	public static Item dragon_bone;
	public static Item dragon_scale;
	
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
		leather_strip = new ItemLeatherStrip();
		GameRegistry.registerItem(leather_strip, leather_strip.getUnlocalizedName());
		daedra_heart = new ItemDaedraHeart();
		GameRegistry.registerItem(daedra_heart, daedra_heart.getUnlocalizedName());
		dragon_bone = new ItemDragonBone();
		GameRegistry.registerItem(dragon_bone, dragon_bone.getUnlocalizedName());
		dragon_scale = new ItemDragonScale();
		GameRegistry.registerItem(dragon_scale, dragon_scale.getUnlocalizedName());
		
		
		
		//Ingot items init//
		steel_ingot = new ItemSteelIngot();
		GameRegistry.registerItem(steel_ingot, steel_ingot.getUnlocalizedName());
		ebony_ingot = new ItemEbonyIngot();
		GameRegistry.registerItem(ebony_ingot, ebony_ingot.getUnlocalizedName());
		orichalcum_ingot = new ItemOrichalcumIngot();
		GameRegistry.registerItem(orichalcum_ingot, orichalcum_ingot.getUnlocalizedName());
		ancient_ingot = new ItemAncientIngot();
		GameRegistry.registerItem(ancient_ingot, ancient_ingot.getUnlocalizedName());
		
		//Food items init//
		grape = new ItemGrape(3, 0.3F, true, "grape");
		GameRegistry.registerItem(grape, grape.getUnlocalizedName());
		
		//Seed items//
		grape_seed = new ItemGrapeSeed(TDEBlocks.grape_plant);
		GameRegistry.registerItem(grape_seed, grape_seed.getUnlocalizedName());
		
	}
}
