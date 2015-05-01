package com.thedarkera.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.thedarkera.item.armor.ItemAncientArmor;
import com.thedarkera.item.armor.ItemDaedricArmor;
import com.thedarkera.item.armor.ItemDragonHeavyArmor;
import com.thedarkera.item.armor.ItemDragonLightArmor;
import com.thedarkera.item.armor.ItemOrichalcumArmor;
import com.thedarkera.item.armor.ItemSteelArmor;

import cpw.mods.fml.common.registry.GameRegistry;

public class TDEArmors
{

	public static Item daedric_helmet;
	public static Item daedric_chestplate;
	public static Item daedric_leggings;
	public static Item daedric_boots;
	
	static ArmorMaterial daedric_armor = EnumHelper.addArmorMaterial("daedric_armor", 20, new int[] { 4, 7, 6, 3 }, 10);

	public static Item steel_helmet;
	public static Item steel_chestplate;
	public static Item steel_leggings;
	public static Item steel_boots;
	
	static ArmorMaterial steel_armor = EnumHelper.addArmorMaterial("steel_armor", 20, new int[] { 2, 5, 4, 2 }, 10);
	
	public static Item dragon_heavy_helmet;
	public static Item dragon_heavy_chestplate;
	public static Item dragon_heavy_leggings;
	public static Item dragon_heavy_boots;
	
	static ArmorMaterial dragon_heavy_armor = EnumHelper.addArmorMaterial("dragon_heavy_armor", 20, new int[] { 3, 7, 6, 4 }, 10);
	
	public static Item dragon_light_helmet;
	public static Item dragon_light_chestplate;
	public static Item dragon_light_leggings;
	public static Item dragon_light_boots;
	
	static ArmorMaterial dragon_light_armor = EnumHelper.addArmorMaterial("dragon_light_armor", 20, new int[] { 2, 5, 5, 3 }, 10);
	
	public static Item orichalcum_helmet;
	public static Item orichalcum_chestplate;
	public static Item orichalcum_leggings;
	public static Item orichalcum_boots;
	
	static ArmorMaterial orichalcum_armor = EnumHelper.addArmorMaterial("orichalcum_armor", 20, new int[] { 2, 6, 4, 3 }, 10);
	
	public static Item ancient_helmet;
	public static Item ancient_chestplate;
	public static Item ancient_leggings;
	public static Item ancient_boots;
	
	static ArmorMaterial ancient_armor = EnumHelper.addArmorMaterial("ancient_armor", 20, new int[] { 2, 6, 4, 3 }, 10);
	
	public static void init()
	{
			//Daedric armor//
		daedric_helmet = new ItemDaedricArmor(daedric_armor, 0, "daedric_helmet");
		GameRegistry.registerItem(daedric_helmet, daedric_helmet.getUnlocalizedName());
		daedric_chestplate = new ItemDaedricArmor(daedric_armor, 1, "daedric_chestplate");
		GameRegistry.registerItem(daedric_chestplate, daedric_chestplate.getUnlocalizedName());
		daedric_leggings = new ItemDaedricArmor(daedric_armor, 2, "daedric_leggings");
		GameRegistry.registerItem(daedric_leggings, daedric_leggings.getUnlocalizedName());
		daedric_boots = new ItemDaedricArmor(daedric_armor, 3, "daedric_boots");
		GameRegistry.registerItem(daedric_boots, daedric_boots.getUnlocalizedName());
			//Steel armor//
		steel_helmet = new ItemSteelArmor(steel_armor, 0, "steel_helmet");
		GameRegistry.registerItem(steel_helmet, steel_helmet.getUnlocalizedName());
		steel_chestplate = new ItemSteelArmor(steel_armor, 1, "steel_chestplate");
		GameRegistry.registerItem(steel_chestplate, steel_chestplate.getUnlocalizedName());
		steel_leggings = new ItemSteelArmor(steel_armor, 2, "steel_leggings");
		GameRegistry.registerItem(steel_leggings, steel_leggings.getUnlocalizedName());
		steel_boots = new ItemSteelArmor(steel_armor, 3, "steel_boots");
		GameRegistry.registerItem(steel_boots, steel_boots.getUnlocalizedName());
			//Dragon heavy armor//
		dragon_heavy_helmet = new ItemDragonHeavyArmor(dragon_heavy_armor, 0, "dragon_heavy_helmet");
		GameRegistry.registerItem(dragon_heavy_helmet, dragon_heavy_helmet.getUnlocalizedName());
		dragon_heavy_chestplate = new ItemDragonHeavyArmor(dragon_heavy_armor, 1, "dragon_heavy_chestplate");
		GameRegistry.registerItem(dragon_heavy_chestplate, dragon_heavy_chestplate.getUnlocalizedName());
		dragon_heavy_leggings = new ItemDragonHeavyArmor(dragon_heavy_armor, 2, "dragon_heavy_leggings");
		GameRegistry.registerItem(dragon_heavy_leggings, dragon_heavy_leggings.getUnlocalizedName());
		dragon_heavy_boots = new ItemDragonHeavyArmor(dragon_heavy_armor, 3, "dragon_heavy_boots");
		GameRegistry.registerItem(dragon_heavy_boots, dragon_heavy_boots.getUnlocalizedName());
			//Dragon light armor//
		dragon_light_helmet = new ItemDragonLightArmor(dragon_light_armor, 0, "dragon_light_helmet");
		GameRegistry.registerItem(dragon_light_helmet, dragon_light_helmet.getUnlocalizedName());
		dragon_light_chestplate = new ItemDragonLightArmor(dragon_light_armor, 1, "dragon_light_chestplate");
		GameRegistry.registerItem(dragon_light_chestplate, dragon_light_chestplate.getUnlocalizedName());
		dragon_light_leggings = new ItemDragonLightArmor(dragon_light_armor, 2, "dragon_light_leggings");
		GameRegistry.registerItem(dragon_light_leggings, dragon_light_leggings.getUnlocalizedName());
		dragon_light_boots = new ItemDragonLightArmor(dragon_light_armor, 3, "dragon_light_boots");
		GameRegistry.registerItem(dragon_light_boots, dragon_light_boots.getUnlocalizedName());
			//Orichalcum armor//
		orichalcum_helmet = new ItemOrichalcumArmor(orichalcum_armor, 0, "orichalcum_helmet");
		GameRegistry.registerItem(orichalcum_helmet, orichalcum_helmet.getUnlocalizedName());
		orichalcum_chestplate = new ItemSteelArmor(orichalcum_armor, 1, "orichalcum_chestplate");
		GameRegistry.registerItem(orichalcum_chestplate, orichalcum_chestplate.getUnlocalizedName());
		orichalcum_leggings = new ItemSteelArmor(orichalcum_armor, 2, "orichalcum_leggings");
		GameRegistry.registerItem(orichalcum_leggings, orichalcum_leggings.getUnlocalizedName());
		orichalcum_boots = new ItemSteelArmor(orichalcum_armor, 3, "orichalcum_boots");
		GameRegistry.registerItem(orichalcum_boots, orichalcum_boots.getUnlocalizedName());
			//Ancient Armor//
		ancient_helmet = new ItemAncientArmor(ancient_armor, 0, "ancient_helmet");
		GameRegistry.registerItem(ancient_helmet, ancient_helmet.getUnlocalizedName());
		ancient_chestplate = new ItemAncientArmor(ancient_armor, 1, "ancient_chestplate");
		GameRegistry.registerItem(ancient_chestplate, ancient_chestplate.getUnlocalizedName());
		ancient_leggings = new ItemAncientArmor(ancient_armor, 2, "ancient_leggings");
		GameRegistry.registerItem(ancient_leggings, ancient_leggings.getUnlocalizedName());
		ancient_boots = new ItemAncientArmor(ancient_armor, 3, "ancient_boots");
		GameRegistry.registerItem(ancient_boots, ancient_boots.getUnlocalizedName());

	}

}
