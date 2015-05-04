package com.thedarkera.item.tool;

import net.minecraft.item.ItemSpade;

import com.thedarkera.TheDarkEra;

public class ItemDarkStoneShovel extends ItemSpade
{
	public ItemDarkStoneShovel(ToolMaterial material, String name) 
	{
		super(material);
		setUnlocalizedName("dark_stone_shovel");
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}
}