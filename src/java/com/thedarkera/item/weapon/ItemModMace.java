package com.thedarkera.item.weapon;

import com.thedarkera.TheDarkEra;

public class ItemModMace extends ItemMace {
	public ItemModMace(ToolMaterial material, String name) {
		super(material);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}
}
