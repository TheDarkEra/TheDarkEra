package com.thedarkera.item.tool;

import com.thedarkera.TheDarkEra;

import net.minecraft.item.ItemAxe;

public class ItemModAxe extends ItemAxe{

	public ItemModAxe(ToolMaterial material, String name, String texture) {
		super(material);
		setCreativeTab(TheDarkEra.tabTDE);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + texture);
	}

}
