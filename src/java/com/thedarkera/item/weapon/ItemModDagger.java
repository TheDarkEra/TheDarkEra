package com.thedarkera.item.weapon;

import com.thedarkera.TheDarkEra;

import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class ItemModDagger extends ItemDagger{
	
	
	public ItemModDagger(ToolMaterial material, String name) {
		super(material);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}

}
