package com.thedarkera.api.items;

import com.thedarkera.TheDarkEra;

import net.minecraft.item.Item;

public class ModItem extends Item{
	
	public ModItem(String name){
		String item = name;
		String resource = TheDarkEra.MODID + ":" + item;
		
		setCreativeTab(TheDarkEra.tabTDEItems);
		setUnlocalizedName(item);
		setTextureName(resource);
	}

}
