package com.thedarkera.ingameobjects.item.tool;

import net.minecraft.item.ItemPickaxe;

import com.thedarkera.TheDarkEra;

public class ItemModPickaxe extends ItemPickaxe {

	public ItemModPickaxe(ToolMaterial material, String name, String texture) {
		super(material);
		setCreativeTab(TheDarkEra.tabTDEItems);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + texture);
	}

}
