package com.thedarkera.ingameobjects.item.weapon;

import com.thedarkera.TheDarkEra;

import net.minecraft.item.Item;

public class ItemDragonArrow extends Item {
	public ItemDragonArrow(String name) {
		super();
		setCreativeTab(TheDarkEra.tabTDE);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
	}
}
