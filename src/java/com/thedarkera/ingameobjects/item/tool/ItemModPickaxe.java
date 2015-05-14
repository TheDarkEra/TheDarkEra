package com.thedarkera.ingameobjects.item.tool;

import com.thedarkera.TheDarkEra;

import net.minecraft.item.ItemPickaxe;

public class ItemModPickaxe extends ItemPickaxe {

	public ItemModPickaxe(ToolMaterial material, String name, String texture) {
		super(material);
		setCreativeTab(TheDarkEra.tabTDE);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + texture);
	}

}
