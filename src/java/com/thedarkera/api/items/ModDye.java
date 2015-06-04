package com.thedarkera.api.items;

import com.thedarkera.TheDarkEra;

public class ModDye extends ModItem{

	public ModDye(String name, String color, int id) {
		super(name);
		String ItemId = name + "." + id;
		String resource = TheDarkEra.MODID + ":" + name + "_" + color;
		
		setUnlocalizedName(ItemId);
		setTextureName(resource);
	}

}
