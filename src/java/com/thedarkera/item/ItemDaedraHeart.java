package com.thedarkera.item;

import com.thedarkera.TheDarkEra;

import net.minecraft.item.Item;

public class ItemDaedraHeart extends Item 
{
	String name = "daedra_heart";

	public ItemDaedraHeart()
	{
		setUnlocalizedName("daedra_heart");
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}
}