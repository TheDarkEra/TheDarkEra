package com.thedarkera.ingameobjects.item.tool;

import net.minecraft.item.ItemAxe;

import com.thedarkera.TheDarkEra;
import com.thedarkera.api.TDE;

public class ItemModAxe extends ItemAxe {

	public ItemModAxe(ToolMaterial material, String name, String texture) {
		super(material);
		setCreativeTab(TDE.tabTDEItems);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + texture);
	}

}
