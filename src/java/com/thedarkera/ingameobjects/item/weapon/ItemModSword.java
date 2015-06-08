package com.thedarkera.ingameobjects.item.weapon;

import net.minecraft.item.ItemSword;

import com.thedarkera.TheDarkEra;
import com.thedarkera.api.TDE;

public class ItemModSword extends ItemSword {
	public ItemModSword(ToolMaterial material, String name) {
		super(material);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TDE.tabTDEItems);
	}
}
