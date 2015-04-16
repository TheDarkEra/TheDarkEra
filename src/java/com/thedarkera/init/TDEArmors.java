package com.thedarkera.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.thedarkera.item.armor.ItemDaedricArmor;
import com.thedarkera.item.armor.ItemSteelArmor;

import cpw.mods.fml.common.registry.GameRegistry;

public class TDEArmors
{

	public static Item daedric_helmet;
	public static Item daedric_chestplate;
	public static Item daedric_leggings;
	public static Item daedric_boots;
	
	static ArmorMaterial daedric_armor = EnumHelper.addArmorMaterial("daedric_armor", 20, new int[] { 3, 7, 6, 3 }, 10);

	public static Item steel_helmet;
	public static Item steel_chestplate;
	public static Item steel_leggings;
	public static Item steel_boots;
	
	static ArmorMaterial steel_armor = EnumHelper.addArmorMaterial("steel_armor", 20, new int[] { 3, 7, 6, 3 }, 10);
	
	public static void init()
	{

		daedric_helmet = new ItemDaedricArmor(daedric_armor, 0, "daedric_helmet");
		GameRegistry.registerItem(daedric_helmet, daedric_helmet.getUnlocalizedName());
		daedric_chestplate = new ItemDaedricArmor(daedric_armor, 1, "daedric_chestplate");
		GameRegistry.registerItem(daedric_chestplate, daedric_chestplate.getUnlocalizedName());
		daedric_leggings = new ItemDaedricArmor(daedric_armor, 2, "daedric_leggings");
		GameRegistry.registerItem(daedric_leggings, daedric_leggings.getUnlocalizedName());
		daedric_boots = new ItemDaedricArmor(daedric_armor, 3, "daedric_boots");
		GameRegistry.registerItem(daedric_boots, daedric_boots.getUnlocalizedName());
		
		steel_helmet = new ItemSteelArmor(steel_armor, 0, "steel_helmet");
		GameRegistry.registerItem(steel_helmet, steel_helmet.getUnlocalizedName());
		steel_chestplate = new ItemSteelArmor(steel_armor, 1, "steel_chestplate");
		GameRegistry.registerItem(steel_chestplate, steel_chestplate.getUnlocalizedName());
		steel_leggings = new ItemSteelArmor(steel_armor, 2, "steel_leggings");
		GameRegistry.registerItem(steel_leggings, steel_leggings.getUnlocalizedName());
		steel_boots = new ItemSteelArmor(steel_armor, 3, "steel_boots");
		GameRegistry.registerItem(steel_boots, steel_boots.getUnlocalizedName());

	}

}
