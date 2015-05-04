package com.thedarkera.item.tool;

import com.thedarkera.TheDarkEra;

import net.minecraft.item.ItemPickaxe;

public class ItemAncientPickaxe extends ItemPickaxe 
{
	public ItemAncientPickaxe(ToolMaterial material, String name) 
	{
		super(material);
		setUnlocalizedName("ancient_pickaxe");
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}
}