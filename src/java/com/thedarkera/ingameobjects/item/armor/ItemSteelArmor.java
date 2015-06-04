package com.thedarkera.ingameobjects.item.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.thedarkera.TheDarkEra;
import com.thedarkera.api.TDE;
import com.thedarkera.init.TDEArmors;

public class ItemSteelArmor extends ItemArmor {
	public ItemSteelArmor(ArmorMaterial material, int armorType, String name) {
		super(material, 0, armorType);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TDE.tabTDEItems);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		if (stack.getItem() == TDEArmors.steel_helmet
				|| stack.getItem() == TDEArmors.steel_chestplate
				|| stack.getItem() == TDEArmors.steel_boots) {
			return TheDarkEra.MODID + ":models/armor/steel_armor_1.png";
		} else if (stack.getItem() == TDEArmors.steel_leggings) {
			return TheDarkEra.MODID + ":models/armor/steel_armor_2.png";
		} else {
			TheDarkEra.logger.warn("Invalid armor item!");
			return null;
		}
	}
}


