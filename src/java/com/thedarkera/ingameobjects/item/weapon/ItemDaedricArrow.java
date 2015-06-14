package com.thedarkera.ingameobjects.item.weapon;

import net.minecraft.item.Item;

import com.thedarkera.TheDarkEra;

public class ItemDaedricArrow extends Item {
	public ItemDaedricArrow(String name) {
		super();
		setCreativeTab(TheDarkEra.tabTDEItems);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
	}
}
