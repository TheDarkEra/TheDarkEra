package com.thedarkera.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.thedarkera.item.armor.ItemDaedricArmor;

import cpw.mods.fml.common.registry.GameRegistry;

public class TDEArmors
{

	public static Item daedric_helmet;
	public static Item daedric_chest;
	public static Item daedric_leggings;
	public static Item daedric_boots;

	static ArmorMaterial daedric_armor = EnumHelper.addArmorMaterial("daedric_armor", 20, new int[] { 3, 7, 6, 3 }, 10);

	public static void init()
	{

		daedric_helmet = new ItemDaedricArmor(daedric_armor, 0, "daedric_helmet");
		GameRegistry.registerItem(daedric_helmet, "DaedricHelmet");
		daedric_chest = new ItemDaedricArmor(daedric_armor, 1, "daedric_chest");
		GameRegistry.registerItem(daedric_chest, "DaedricChest");
		daedric_leggings = new ItemDaedricArmor(daedric_armor, 2, "daedric_leggings");
		GameRegistry.registerItem(daedric_leggings, "DaedricLeggings");
		daedric_boots = new ItemDaedricArmor(daedric_armor, 3, "daedric_boots");
		GameRegistry.registerItem(daedric_boots, "DaedricBoots");

	}

}
