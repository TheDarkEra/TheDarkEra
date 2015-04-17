package com.thedarkera.item;

import com.thedarkera.TheDarkEra;

import net.minecraft.item.Item;

public class ItemAncientIngot extends Item 
{
	 String name = "ancient_ingot";
	
	public ItemAncientIngot()
	{
		setUnlocalizedName("ancient_ingot");
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}
}