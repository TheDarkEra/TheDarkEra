package com.thedarkera.item.tool;

import net.minecraft.item.ItemAxe;

import com.thedarkera.TheDarkEra;

public class ItemAncientAxe extends ItemAxe 
{
	public ItemAncientAxe(ToolMaterial material, String name) 
	{
		super(material);
		setUnlocalizedName("ancient_axe");
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}
}