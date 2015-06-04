package com.thedarkera.ingameobjects.item.tool;

import net.minecraft.item.ItemPickaxe;

import com.thedarkera.TheDarkEra;
import com.thedarkera.api.TDE;

public class ItemModPickaxe extends ItemPickaxe {

	public ItemModPickaxe(ToolMaterial material, String name, String texture) {
		super(material);
		setCreativeTab(TDE.tabTDEItems);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + texture);
	}

}
