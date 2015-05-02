package com.thedarkera.init;

import net.minecraft.item.Item;

import com.thedarkera.item.weapon.ItemDaedricArrow;
import com.thedarkera.item.weapon.ItemDaedricBow;
import com.thedarkera.item.weapon.ItemModDagger;
import com.thedarkera.item.weapon.ItemModSword;

import cpw.mods.fml.common.registry.GameRegistry;

public class TDEWeapons {
	
	public static Item steel_sword;
	public static Item dark_stone_sword;
	public static Item daedric_bow;
	public static Item daedric_arrow;
	public static Item steel_dagger;
	

	public static void init()
	 {
		//swords
		steel_sword = new ItemModSword(TDEMaterials.steel, "steel_sword");
		GameRegistry.registerItem(steel_sword, steel_sword.getUnlocalizedName());
		dark_stone_sword = new ItemModSword(TDEMaterials.dark_stone, "dark_stone_sword");
		GameRegistry.registerItem(dark_stone_sword, dark_stone_sword.getUnlocalizedName());
		
		//Bows
		daedric_bow = new ItemDaedricBow("daedric_bow");
		GameRegistry.registerItem(daedric_bow, daedric_bow.getUnlocalizedName());
		
		//Arrows
		daedric_arrow = new ItemDaedricArrow("daedric_arrow");
		GameRegistry.registerItem(daedric_arrow, daedric_arrow.getUnlocalizedName());
		
		//Daggers
		steel_dagger = new ItemModDagger(TDEMaterials.steel, "steel_dagger");
		GameRegistry.registerItem(steel_dagger, steel_dagger.getUnlocalizedName());
		
		
	 }
}
