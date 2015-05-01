package com.thedarkera.init;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.thedarkera.item.weapon.ItemDaedricBow;
import com.thedarkera.item.weapon.ItemModSword;

import cpw.mods.fml.common.registry.GameRegistry;

public class TDEWeapons {
	
	public static Item steel_sword;
	public static Item dark_stone_sword;
	public static Item daedric_bow;
	
	//harvestLevel, maxUses, efficiencyOnProperMaterial, damageVsEntity, enchantability
	//static ToolMaterial  = EnumHelper.addToolMaterial("", );
	static ToolMaterial dark_stone = EnumHelper.addToolMaterial("dark_stone", 1, 200, 5.5F, 2F, 7);
	static ToolMaterial steel = EnumHelper.addToolMaterial("steel", 2, 325, 8.0F, 3F, 18);

	public static void init()
	 {
		//swords
		steel_sword = new ItemModSword(steel, "steel_sword");
		GameRegistry.registerItem(steel_sword, steel_sword.getUnlocalizedName());
		dark_stone_sword = new ItemModSword(dark_stone, "dark_stone_sword");
		GameRegistry.registerItem(dark_stone_sword, dark_stone_sword.getUnlocalizedName());
		//Bows
		daedric_bow = new ItemDaedricBow("daedric_bow");
		GameRegistry.registerItem(daedric_bow, daedric_bow.getUnlocalizedName());
		
		
	 }
}
