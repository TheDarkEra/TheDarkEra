package com.thedarkera.item.tool;

import net.minecraft.item.ItemHoe;

import com.thedarkera.TheDarkEra;

public class ItemSteelHoe extends ItemHoe
{
	public ItemSteelHoe(ToolMaterial material, String name) 
	{
		super(material);
		setUnlocalizedName("steel_hoe");
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}
}