package com.thedarkera.item;

import com.thedarkera.TheDarkEra;

import net.minecraft.item.Item;

public class ItemSteelIngot extends Item {
	String name = "steel_ingot";

	public ItemSteelIngot() {
		setUnlocalizedName("steel_ingot");
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}
}