package com.darkteam.thedarkera.tabs;

import com.darkteam.thedarkera.items.ModItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TheDarkEraTab extends CreativeTabs
{
	public TheDarkEraTab(int par1, String par2Str)
	{
		super(par1, par2Str);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem()
	{
		return ModItems.sampickaxe;
	}
}