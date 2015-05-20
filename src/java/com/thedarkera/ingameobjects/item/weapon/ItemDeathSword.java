package com.thedarkera.ingameobjects.item.weapon;

import com.thedarkera.TheDarkEra;

public class ItemDeathSword extends ItemBossSword {
	
	public ItemDeathSword(ToolMaterial material, String name) {
		super(material);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
	}

}
