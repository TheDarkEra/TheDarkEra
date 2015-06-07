package com.thedarkera.api.items;

import net.minecraft.item.Item;

import com.thedarkera.TheDarkEra;
import com.thedarkera.api.TDE;

public class ItemTDEBase extends Item{
	
	public ItemTDEBase(String name){
		String item = name;
		String resource = TheDarkEra.MODID + ":" + item;
		
		setCreativeTab(TDE.tabTDEItems);
		setUnlocalizedName(item);
		setTextureName(resource);
	}

}
