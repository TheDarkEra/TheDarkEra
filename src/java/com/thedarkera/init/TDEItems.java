package com.thedarkera.init;

import com.thedarkera.TheDarkEra;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class TDEItems
{
	public static Item common_soul_gem;
	
	public static void init()
	{
		common_soul_gem = new Item().setUnlocalizedName("common_soul_gem").setTextureName(TheDarkEra.MODID + ":common_soul_gem").setCreativeTab(TheDarkEra.tabTDE);
		
		GameRegistry.registerItem(common_soul_gem, common_soul_gem.getUnlocalizedName());
	}
}
