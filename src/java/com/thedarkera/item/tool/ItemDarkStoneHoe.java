package com.thedarkera.item.tool;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

import com.thedarkera.TheDarkEra;


public class ItemDarkStoneHoe extends ItemHoe 
{

	public ItemDarkStoneHoe(ToolMaterial material, String name) 
	{
		super(material);
		setUnlocalizedName("dark_stone_hoe");
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}

}