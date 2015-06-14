package com.thedarkera.ingameobjects.item.weapon;

import net.minecraft.item.Item;

import com.thedarkera.TheDarkEra;

public class ItemDragonArrow extends Item {
	public ItemDragonArrow(String name) {
		super();
		setCreativeTab(TheDarkEra.tabTDEItems);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
	}
}
