package com.thedarkera.item.tool;

import net.minecraft.item.ItemSpade;

import com.thedarkera.TheDarkEra;

public class ItemAncientShovel extends ItemSpade
{
	public ItemAncientShovel(ToolMaterial material, String name) 
	{
		super(material);
		setUnlocalizedName("ancient_shovel");
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}
}