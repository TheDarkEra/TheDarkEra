package com.thedarkera.item;

import com.thedarkera.TheDarkEra;

import net.minecraft.item.Item;

	public class ItemLeatherStrips extends Item 
	{
		 String name = "leather_strips";
		
		public ItemLeatherStrips()
		{
			setUnlocalizedName("leather_strips");
			setTextureName(TheDarkEra.MODID + ":" + name);
			setCreativeTab(TheDarkEra.tabTDE);
		}
	}