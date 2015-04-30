package com.thedarkera.item.tool;

import com.thedarkera.TheDarkEra;

import net.minecraft.item.ItemPickaxe;


public class ItemSteelPickaxe extends ItemPickaxe 
{

	public ItemSteelPickaxe(ToolMaterial material, String name) 
	{
		super(material);
		setUnlocalizedName("steel_pickaxe");
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}

}