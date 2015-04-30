package com.thedarkera.item.tool;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

import com.thedarkera.TheDarkEra;


public class ItemDarkStoneAxe extends ItemAxe 
{

	public ItemDarkStoneAxe(ToolMaterial material, String name) 
	{
		super(material);
		setUnlocalizedName("dark_stone_axe");
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}

}