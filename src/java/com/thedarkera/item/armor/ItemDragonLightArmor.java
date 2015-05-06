package com.thedarkera.item.armor;

import com.thedarkera.TheDarkEra;
import com.thedarkera.init.TDEArmors;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemDragonLightArmor extends ItemArmor {
	public ItemDragonLightArmor(ArmorMaterial material, int armorType,
			String name) {
		super(material, 0, armorType);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		if (stack.getItem() == TDEArmors.dragon_light_helmet
				|| stack.getItem() == TDEArmors.dragon_light_chestplate
				|| stack.getItem() == TDEArmors.dragon_light_boots) {
			return TheDarkEra.MODID + ":models/armor/dragon_light_armor_1.png";
		} else if (stack.getItem() == TDEArmors.dragon_light_leggings) {
			return TheDarkEra.MODID + ":models/armor/dragon_light_armor_2.png";
		} else {
			TheDarkEra.logger.warn("Invalid armor item!");
			return null;
		}
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
		if (player.getCurrentArmor(0) != null
				&& player.getCurrentArmor(0).getItem()
						.equals(TDEArmors.dragon_light_boots)
				&& player.getCurrentArmor(1) != null
				&& player.getCurrentArmor(1).getItem()
						.equals(TDEArmors.dragon_light_leggings)
				&& player.getCurrentArmor(2) != null
				&& player.getCurrentArmor(2).getItem()
						.equals(TDEArmors.dragon_light_chestplate)
				&& player.getCurrentArmor(3) != null
				&& player.getCurrentArmor(3).getItem()
						.equals(TDEArmors.dragon_light_helmet)) {
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 20 * 1));
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.id,
					20 * 1));
		}
	}
}
