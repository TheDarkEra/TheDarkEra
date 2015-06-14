package com.thedarkera.ingameobjects.item.tool;

import net.minecraft.item.ItemHoe;

import com.thedarkera.TheDarkEra;

public class ItemModHoe extends ItemHoe {

	public ItemModHoe(ToolMaterial material, String name, String texture) {
		super(material);
		setCreativeTab(TheDarkEra	.tabTDEItems);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + texture);
	}

}
