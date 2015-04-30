package com.thedarkera.item.tool;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

import com.thedarkera.TheDarkEra;


public class ItemSteelShovel extends ItemSpade 
{

	public ItemSteelShovel(ToolMaterial material, String name) 
	{
		super(material);
		setUnlocalizedName("steel_shovel");
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}

}