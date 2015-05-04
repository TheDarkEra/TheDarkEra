package com.thedarkera.item;

import com.thedarkera.TheDarkEra;

import net.minecraft.item.Item;

public class ItemEbonyIngot extends Item 
{
	String name = "ebony_ingot";

	public ItemEbonyIngot()
	{
		setUnlocalizedName("ebony_ingot");
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}
}