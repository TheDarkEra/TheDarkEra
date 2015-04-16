package com.thedarkera.init;

import net.minecraft.item.Item;

import com.thedarkera.item.ItemSoulGem;

import cpw.mods.fml.common.registry.GameRegistry;

public class TDEItems
{
	public static Item soul_gem;
	
	public static void init()
	{
		soul_gem = new ItemSoulGem();
		GameRegistry.registerItem(soul_gem, soul_gem.getUnlocalizedName());
	}
}
