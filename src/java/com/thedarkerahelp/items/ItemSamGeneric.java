package com.darkteam.thedarkera.items;

import com.darkteam.thedarkera.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSamGeneric extends Item 
{
	public ItemSamGeneric(String name)
	{
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName(Main.MODID + "_" + name);
		setTextureName(Main.MODID + ":" + name);
	}
}
