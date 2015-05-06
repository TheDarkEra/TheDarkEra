package com.thedarkera.item.weapon;

import net.minecraft.item.ItemSword;

import com.thedarkera.TheDarkEra;

public class ItemModSword extends ItemSword {
	public ItemModSword(ToolMaterial material, String name) {
		super(material);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}
}
