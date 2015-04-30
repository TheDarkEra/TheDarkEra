package com.thedarkera.item.tool;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

import com.thedarkera.TheDarkEra;


public class ItemAncientHoe extends ItemHoe
{

	public ItemAncientHoe(ToolMaterial material, String name) 
	{
		super(material);
		setUnlocalizedName("ancient_hoe");
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}

}