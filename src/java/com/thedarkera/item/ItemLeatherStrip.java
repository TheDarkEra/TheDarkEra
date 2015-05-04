package com.thedarkera.item;

import com.thedarkera.TheDarkEra;

import net.minecraft.item.Item;

public class ItemLeatherStrip extends Item 
{
	String name = "leather_strip";

	public ItemLeatherStrip()
	{
		setUnlocalizedName("leather_strip");
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}
}