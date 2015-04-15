package com.darkteam.thedarkera.items.tools;



import com.darkteam.thedarkera.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class ItemSamShovel extends ItemSpade
{
	public ItemSamShovel(ToolMaterial material, String name) 
	{
		super(material);
		setUnlocalizedName(Main.MODID + "_" + name);
		setTextureName(Main.MODID + ":" + name);
	}
}