package com.thedarkera.item.tool;

import net.minecraft.item.ItemAxe;

import com.thedarkera.TheDarkEra;

public class ItemSteelAxe extends ItemAxe 
{
	public ItemSteelAxe(ToolMaterial material, String name) 
	{
		super(material);
		setUnlocalizedName("steel_axe");
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}
}