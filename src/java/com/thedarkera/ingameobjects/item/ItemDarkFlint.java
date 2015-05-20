package com.thedarkera.ingameobjects.item;

import net.minecraft.item.Item;

import com.thedarkera.TheDarkEra;

public class ItemDarkFlint extends Item{
	
	private String name = "dark_flint";
	
	public ItemDarkFlint(){
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}
	
}
