package com.thedarkera.ingameobjects.item.weapon;

import com.thedarkera.TheDarkEra;

public class ItemModDagger extends ItemDagger {
	public ItemModDagger(ToolMaterial material, String name) {
		super(material);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
	}
}
