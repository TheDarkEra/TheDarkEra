package com.thedarkera.item.weapon;

import com.thedarkera.TheDarkEra;

public class ItemModDagger extends ItemDagger {
	public ItemModDagger(ToolMaterial material, String name) {
		super(material);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}
}
