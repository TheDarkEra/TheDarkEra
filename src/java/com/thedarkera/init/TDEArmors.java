package com.thedarkera.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.thedarkera.ingameobjects.item.armor.ItemAncientArmor;
import com.thedarkera.ingameobjects.item.armor.ItemDaedricArmor;
import com.thedarkera.ingameobjects.item.armor.ItemDragonHeavyArmor;
import com.thedarkera.ingameobjects.item.armor.ItemDragonLightArmor;
import com.thedarkera.ingameobjects.item.armor.ItemOrichalcumArmor;
import com.thedarkera.ingameobjects.item.armor.ItemSteelArmor;
import com.thedarkera.utils.RegUtils;

public class TDEArmors {
	public static Item daedric_helmet;
	public static Item daedric_chestplate;
	public static Item daedric_leggings;
	public static Item daedric_boots;

	static ArmorMaterial daedric_armor = EnumHelper.addArmorMaterial(
			"daedric_armor", 20, new int[] { 4, 7, 6, 3 }, 10);

	public static Item steel_helmet;
	public static Item steel_chestplate;
	public static Item steel_leggings;
	public static Item steel_boots;

	static ArmorMaterial steel_armor = EnumHelper.addArmorMaterial(
			"steel_armor", 20, new int[] { 2, 5, 4, 2 }, 10);

	public static Item dragon_heavy_helmet;
	public static Item dragon_heavy_chestplate;
	public static Item dragon_heavy_leggings;
	public static Item dragon_heavy_boots;

	static ArmorMaterial dragon_heavy_armor = EnumHelper.addArmorMaterial(
			"dragon_heavy_armor", 20, new int[] { 3, 7, 6, 4 }, 10);

	public static Item dragon_light_helmet;
	public static Item dragon_light_chestplate;
	public static Item dragon_light_leggings;
	public static Item dragon_light_boots;

	static ArmorMaterial dragon_light_armor = EnumHelper.addArmorMaterial(
			"dragon_light_armor", 20, new int[] { 2, 5, 5, 3 }, 10);

	public static Item orichalcum_helmet;
	public static Item orichalcum_chestplate;
	public static Item orichalcum_leggings;
	public static Item orichalcum_boots;

	static ArmorMaterial orichalcum_armor = EnumHelper.addArmorMaterial(
			"orichalcum_armor", 20, new int[] { 2, 6, 4, 3 }, 10);

	public static Item ancient_helmet;
	public static Item ancient_chestplate;
	public static Item ancient_leggings;
	public static Item ancient_boots;

	static ArmorMaterial ancient_armor = EnumHelper.addArmorMaterial(
			"ancient_armor", 20, new int[] { 2, 6, 4, 3 }, 10);

	public static void init() {
		// Daedric armor//
		daedric_helmet = new ItemDaedricArmor(daedric_armor, 0,
				"daedric_helmet");
		reg(daedric_helmet);
		daedric_chestplate = new ItemDaedricArmor(daedric_armor, 1,
				"daedric_chestplate");
		reg(daedric_chestplate);
		daedric_leggings = new ItemDaedricArmor(daedric_armor, 2,
				"daedric_leggings");
		reg(daedric_leggings);
		daedric_boots = new ItemDaedricArmor(daedric_armor, 3, "daedric_boots");
		reg(daedric_boots);

		// Steel armor//
		steel_helmet = new ItemSteelArmor(steel_armor, 0, "steel_helmet");
		reg(steel_helmet);
		steel_chestplate = new ItemSteelArmor(steel_armor, 1,
				"steel_chestplate");
		reg(steel_chestplate);
		steel_leggings = new ItemSteelArmor(steel_armor, 2, "steel_leggings");
		reg(steel_leggings);
		steel_boots = new ItemSteelArmor(steel_armor, 3, "steel_boots");
		reg(steel_boots);

		// Dragon heavy armor//
		dragon_heavy_helmet = new ItemDragonHeavyArmor(dragon_heavy_armor, 0,
				"dragon_heavy_helmet");
		reg(dragon_heavy_helmet);
		dragon_heavy_chestplate = new ItemDragonHeavyArmor(dragon_heavy_armor,
				1, "dragon_heavy_chestplate");
		reg(dragon_heavy_chestplate);
		dragon_heavy_leggings = new ItemDragonHeavyArmor(dragon_heavy_armor, 2,
				"dragon_heavy_leggings");
		reg(dragon_heavy_leggings);
		dragon_heavy_boots = new ItemDragonHeavyArmor(dragon_heavy_armor, 3,
				"dragon_heavy_boots");
		reg(dragon_heavy_boots);

		// Dragon light armor//
		dragon_light_helmet = new ItemDragonLightArmor(dragon_light_armor, 0,
				"dragon_light_helmet");
		reg(dragon_light_helmet);
		dragon_light_chestplate = new ItemDragonLightArmor(dragon_light_armor,
				1, "dragon_light_chestplate");
		reg(dragon_light_chestplate);
		dragon_light_leggings = new ItemDragonLightArmor(dragon_light_armor, 2,
				"dragon_light_leggings");
		reg(dragon_light_leggings);
		dragon_light_boots = new ItemDragonLightArmor(dragon_light_armor, 3,
				"dragon_light_boots");
		reg(dragon_light_boots);

		// Orichalcum armor//
		orichalcum_helmet = new ItemOrichalcumArmor(orichalcum_armor, 0,
				"orichalcum_helmet");
		reg(orichalcum_helmet);
		orichalcum_chestplate = new ItemSteelArmor(orichalcum_armor, 1,
				"orichalcum_chestplate");
		reg(orichalcum_chestplate);
		orichalcum_leggings = new ItemSteelArmor(orichalcum_armor, 2,
				"orichalcum_leggings");
		reg(orichalcum_leggings);
		orichalcum_boots = new ItemSteelArmor(orichalcum_armor, 3,
				"orichalcum_boots");
		reg(orichalcum_boots);

		// Ancient Armor//
		ancient_helmet = new ItemAncientArmor(ancient_armor, 0,
				"ancient_helmet");
		reg(ancient_helmet);
		ancient_chestplate = new ItemAncientArmor(ancient_armor, 1,
				"ancient_chestplate");
		reg(ancient_chestplate);
		ancient_leggings = new ItemAncientArmor(ancient_armor, 2,
				"ancient_leggings");
		reg(ancient_leggings);
		ancient_boots = new ItemAncientArmor(ancient_armor, 3, "ancient_boots");
		reg(ancient_boots);
	}

	public static void reg(Item item) {
		RegUtils.reg(item);
	}
}
