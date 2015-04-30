package com.thedarkera.item.tool;

import com.thedarkera.TheDarkEra;

import net.minecraft.item.ItemPickaxe;


public class ItemDarkStonePickaxe extends ItemPickaxe 
{

	public ItemDarkStonePickaxe(ToolMaterial material, String name) 
	{
		super(material);
		setUnlocalizedName("dark_stone_pickaxe");
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}

}