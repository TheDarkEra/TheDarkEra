package com.thedarkera.item;

import com.thedarkera.TheDarkEra;

import net.minecraft.item.Item;

public class ItemAshHopperJelly extends Item{
	
String name = "ash_hopper_jelly";
	
	public ItemAshHopperJelly()
	{
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}

}
