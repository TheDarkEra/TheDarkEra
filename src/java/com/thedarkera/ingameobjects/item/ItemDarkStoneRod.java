package com.thedarkera.ingameobjects.item;

import com.thedarkera.TheDarkEra;

import net.minecraft.item.Item;

public class ItemDarkStoneRod extends Item {
	String name = "dark_stone_rod";

	public ItemDarkStoneRod() {
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}
}