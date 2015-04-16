package com.thedarkera.init;

import com.thedarkera.item.tool.ItemAncientPickaxe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class TDETools {

	public static Item ancient_pickaxe;
	
	static ToolMaterial ancient = EnumHelper.addToolMaterial("ancient", 3, 1000, 9.5F, 3.5F, 10);

	public static void init()
	 {
		ancient_pickaxe = new ItemAncientPickaxe(ancient, "ancient_pickaxe");
		GameRegistry.registerItem(ancient_pickaxe, "Ancient_Pickaxe");
		 
		 
		 
		 
	 }
}
