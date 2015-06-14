package com.thedarkera.ingameobjects.item.tool;

import net.minecraft.item.ItemAxe;

import com.thedarkera.TheDarkEra;

public class ItemModAxe extends ItemAxe {

	public ItemModAxe(ToolMaterial material, String name, String texture) {
		super(material);
		setCreativeTab(TheDarkEra.tabTDEItems);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + texture);
	}

}
