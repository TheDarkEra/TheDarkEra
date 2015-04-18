package com.thedarkera.item;

import net.minecraft.item.Item;

import com.thedarkera.TheDarkEra;

public class ItemDragonScale extends Item 
{
	 String name = "dragon_scale";
	
	public ItemDragonScale()
	{
		setUnlocalizedName("dragon_scale");
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}
}