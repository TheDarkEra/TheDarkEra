package com.thedarkera.init;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class TDEMaterials {
	/*
	 * harvestLevel, maxUses, efficiencyOnProperMaterial, damageVsEntity,
	 * enchantability static ToolMaterial = EnumHelper.addToolMaterial("", ) 0 =
	 * Wood, 1 = Stone, 2 = Iron, 3 = Diamond, 4 = Ancient
	 */

	static ToolMaterial ancient = EnumHelper.addToolMaterial("ancient", 4,
			1000, 9.5F, 3.5F, 10);
	static ToolMaterial dark_stone = EnumHelper.addToolMaterial("dark_stone",
			1, 200, 5.5F, 2F, 7);
	static ToolMaterial steel = EnumHelper.addToolMaterial("steel", 2, 325,
			8.0F, 3F, 18);
}
