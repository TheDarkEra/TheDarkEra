package com.thedarkera.ingameobjects.item.weapon;

import net.minecraft.item.Item;

import com.thedarkera.TheDarkEra;
import com.thedarkera.api.TDE;

public class ItemDragonArrow extends Item {
	public ItemDragonArrow(String name) {
		super();
		setCreativeTab(TDE.tabTDEItems);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
	}
}
