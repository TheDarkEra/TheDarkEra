package com.darkteam.thedarkera.items.tools;

import com.darkteam.thedarkera.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ItemSamAxe extends ItemAxe 
{
	public ItemSamAxe(ToolMaterial material, String name) 
	{
		super(material);
		setUnlocalizedName(Main.MODID + "_" + name);
		setTextureName(Main.MODID + ":" + name);
	}
}