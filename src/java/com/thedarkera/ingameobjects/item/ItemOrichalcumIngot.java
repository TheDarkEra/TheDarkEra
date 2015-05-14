package com.thedarkera.ingameobjects.item;

import com.thedarkera.TheDarkEra;

import net.minecraft.item.Item;

public class ItemOrichalcumIngot extends Item {
	String name = "orichalcum_ingot";

	public ItemOrichalcumIngot() {
		setUnlocalizedName("orichalcum_ingot");
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}
}