package com.thedarkera.item;

import com.thedarkera.TheDarkEra;

import net.minecraft.item.Item;

public class ItemAshHopperMeat extends Item{
	
String name = "ash_hopper_meat";
	
	public ItemAshHopperMeat()
	{
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}

}
