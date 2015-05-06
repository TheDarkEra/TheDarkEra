package com.thedarkera.item;

import com.thedarkera.TheDarkEra;

import net.minecraft.item.Item;

public class ItemFireRune extends Item {
	String name = "fire_rune";

	public ItemFireRune() {
		setUnlocalizedName("fire_rune");
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}
}