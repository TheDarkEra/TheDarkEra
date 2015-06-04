package com.thedarkera.ingameobjects.item.tool;

import net.minecraft.item.ItemSpade;

import com.thedarkera.TheDarkEra;
import com.thedarkera.api.TDE;

public class ItemModSpade extends ItemSpade {

	public ItemModSpade(ToolMaterial m, String name, String texture) {
		super(m);
		setCreativeTab(TDE.tabTDEItems);
		setTextureName(TheDarkEra.MODID + ":" + texture);
		setUnlocalizedName(name);
	}

}
