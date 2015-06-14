package com.thedarkera.api.items;

import net.minecraft.item.Item;

import com.thedarkera.TheDarkEra;
import com.thedarkera.api.helper.ResourceHelper;

public class ItemTDEBase extends Item{
	
	public ItemTDEBase(String name){
		String resource = ResourceHelper.getResourceName(name);
		
		setCreativeTab(TheDarkEra.tabTDEItems);
		setUnlocalizedName(name);
		setTextureName(resource);
	}

}
