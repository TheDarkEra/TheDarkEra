package com.thedarkera.item.tool;

import com.thedarkera.TheDarkEra;

import net.minecraft.item.ItemSpade;

public class ItemModSpade extends ItemSpade{

	public ItemModSpade(ToolMaterial m, String name, String texture) {
		super(m);
		setCreativeTab(TheDarkEra.tabTDE);
		setTextureName(texture);
		setUnlocalizedName(name);
	}

}
