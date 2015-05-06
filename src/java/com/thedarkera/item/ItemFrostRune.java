package com.thedarkera.item;

import com.thedarkera.TheDarkEra;

import net.minecraft.item.Item;

public class ItemFrostRune extends Item {
	String name = "frost_rune";

	public ItemFrostRune() {
		setUnlocalizedName("frost_rune");
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}
}