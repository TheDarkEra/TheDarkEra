package com.thedarkera.ingameobjects;

import com.thedarkera.TheDarkEra;

import net.minecraft.item.Item;

public class ModItem extends Item{
	
	public ModItem(String name){
		String item = name;
		String resource = TheDarkEra.MODID + ":" + item;
		
		setCreativeTab(TheDarkEra.tabTDE);
		setUnlocalizedName(item);
		setTextureName(resource);
	}

}
