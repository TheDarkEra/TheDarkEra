package com.thedarkera.item.food;

import com.thedarkera.TheDarkEra;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemAshHopperMeat extends ItemFood{


	public ItemAshHopperMeat(int food, int saturation, boolean wolfFood, String name) {
		super(food, saturation, wolfFood);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
		setAlwaysEdible();
	}
	
}
