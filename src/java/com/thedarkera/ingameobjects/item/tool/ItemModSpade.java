package com.thedarkera.ingameobjects.item.tool;

import com.thedarkera.TheDarkEra;

import net.minecraft.item.ItemSpade;

public class ItemModSpade extends ItemSpade {

	public ItemModSpade(ToolMaterial m, String name, String texture) {
		super(m);
		setCreativeTab(TheDarkEra.tabTDE);
		setTextureName(TheDarkEra.MODID + ":" + texture);
		setUnlocalizedName(name);
	}

}
