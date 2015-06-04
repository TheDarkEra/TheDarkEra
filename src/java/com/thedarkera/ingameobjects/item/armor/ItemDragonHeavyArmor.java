package com.thedarkera.ingameobjects.item.armor;

import com.thedarkera.TheDarkEra;
import com.thedarkera.init.TDEArmors;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemDragonHeavyArmor extends ItemArmor {
	public ItemDragonHeavyArmor(ArmorMaterial material, int armorType,
			String name) {
		super(material, 0, armorType);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDEItems);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		if (stack.getItem() == TDEArmors.dragon_heavy_helmet
				|| stack.getItem() == TDEArmors.dragon_heavy_chestplate
				|| stack.getItem() == TDEArmors.dragon_heavy_boots) {
			return TheDarkEra.MODID + ":models/armor/dragon_heavy_armor_1.png";
		} else if (stack.getItem() == TDEArmors.dragon_heavy_leggings) {
			return TheDarkEra.MODID + ":models/armor/dragon_heavy_armor_2.png";
		} else {
			TheDarkEra.logger.warn("Invalid armor item!");
			return null;
		}
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
		if (player.getCurrentArmor(0) != null
				&& player.getCurrentArmor(0).getItem()
						.equals(TDEArmors.dragon_heavy_boots)
				&& player.getCurrentArmor(1) != null
				&& player.getCurrentArmor(1).getItem()
						.equals(TDEArmors.dragon_heavy_leggings)
				&& player.getCurrentArmor(2) != null
				&& player.getCurrentArmor(2).getItem()
						.equals(TDEArmors.dragon_heavy_chestplate)
				&& player.getCurrentArmor(3) != null
				&& player.getCurrentArmor(3).getItem()
						.equals(TDEArmors.dragon_heavy_helmet)) {
			player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id,
					20 * 1));
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.id,
					20 * 1));
		}
	}
}
