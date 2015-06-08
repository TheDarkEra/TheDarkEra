package com.thedarkera.ingameobjects.item.tool;

import net.minecraft.item.ItemHoe;

import com.thedarkera.TheDarkEra;
import com.thedarkera.api.TDE;

public class ItemModHoe extends ItemHoe {

	public ItemModHoe(ToolMaterial material, String name, String texture) {
		super(material);
		setCreativeTab(TDE.tabTDEItems);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + texture);
	}

}
