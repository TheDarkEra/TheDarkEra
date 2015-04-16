package com.thedarkera.item.armor;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.thedarkera.TheDarkEra;
import com.thedarkera.init.TDEArmors;

public class ItemDaedricArmor extends ItemArmor
{
	public ItemDaedricArmor(ArmorMaterial material, int armorType, String name)
	{
		super(material, 0, armorType);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (stack.getItem() == TDEArmors.daedric_helmet || stack.getItem() == TDEArmors.daedric_chestplate || stack.getItem() == TDEArmors.daedric_boots)
		{
			return TheDarkEra.MODID + ":models/armor/daedric_armor_1.png";
		}
		else if (stack.getItem() == TDEArmors.daedric_leggings)
		{
			return TheDarkEra.MODID + ":models/armor/daedric_armor_2.png";
		}
		else
		{
			TheDarkEra.logger.warn("Invalid armor item!");
			return null;
		}
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		if (itemStack.getItem().equals(TDEArmors.daedric_helmet))
		{
			if (player.isInWater())
			{
				player.setAir(300);
			}
		}
	}
}