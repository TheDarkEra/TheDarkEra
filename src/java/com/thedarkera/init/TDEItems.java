package com.thedarkera.init;

import net.minecraft.item.Item;

import com.thedarkera.TheDarkEra;
import com.thedarkera.item.ItemSoulGem;

import cpw.mods.fml.common.registry.GameRegistry;

public class TDEItems
{
	public static Item common_soul_gem;
	public static Item lesser_soul_gem;
	public static Item greater_soul_gem;
	public static Item grand_soul_gem;
	public static Item black_soul_gem;
		
	public static Item soul_gem;
	
	public static void init()
	{
		common_soul_gem = new Item().setUnlocalizedName("common_soul_gem").setTextureName(TheDarkEra.MODID + ":common_soul_gem").setCreativeTab(TheDarkEra.tabTDE);
		GameRegistry.registerItem(common_soul_gem, common_soul_gem.getUnlocalizedName());
		lesser_soul_gem = new Item().setUnlocalizedName("lesser_soul_gem").setTextureName(TheDarkEra.MODID + ":lesser_soul_gem").setCreativeTab(TheDarkEra.tabTDE);
		GameRegistry.registerItem(lesser_soul_gem, lesser_soul_gem.getUnlocalizedName());
		greater_soul_gem = new Item().setUnlocalizedName("greater_soul_gem").setTextureName(TheDarkEra.MODID + ":greater_soul_gem").setCreativeTab(TheDarkEra.tabTDE);
		GameRegistry.registerItem(greater_soul_gem, greater_soul_gem.getUnlocalizedName());
		grand_soul_gem = new Item().setUnlocalizedName("grand_soul_gem").setTextureName(TheDarkEra.MODID + ":grand_soul_gem").setCreativeTab(TheDarkEra.tabTDE);
		GameRegistry.registerItem(grand_soul_gem, grand_soul_gem.getUnlocalizedName());
		black_soul_gem = new Item().setUnlocalizedName("black_soul_gem").setTextureName(TheDarkEra.MODID + ":black_soul_gem").setCreativeTab(TheDarkEra.tabTDE);
		GameRegistry.registerItem(black_soul_gem, black_soul_gem.getUnlocalizedName());
			
			//better way in making more items that are kind of the sam//
		soul_gem = new ItemSoulGem();
		GameRegistry.registerItem(soul_gem, "Soul_Gem");
	}
}
