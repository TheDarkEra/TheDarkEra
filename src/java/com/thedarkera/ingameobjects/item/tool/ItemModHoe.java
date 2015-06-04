package com.thedarkera.ingameobjects.item.tool;

import com.thedarkera.TheDarkEra;

import net.minecraft.item.ItemHoe;

public class ItemModHoe extends ItemHoe {

	public ItemModHoe(ToolMaterial material, String name, String texture) {
		super(material);
		setCreativeTab(TheDarkEra.tabTDEItems);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + texture);
	}

}
