package com.thedarkera.item;

import net.minecraft.item.Item;

import com.thedarkera.TheDarkEra;

public class ItemDragonBone extends Item 
{
	String name = "dragon_bone";

	public ItemDragonBone()
	{
		setUnlocalizedName("dragon_bone");
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}
}