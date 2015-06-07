package com.thedarkera.ingameobjects.item.food;

import net.minecraft.item.ItemFood;

import com.thedarkera.TheDarkEra;
import com.thedarkera.api.TDE;

public class ItemAshHopperMeat extends ItemFood {
	
	public ItemAshHopperMeat(int food, float saturation, boolean wolfFood, String name) {
		super(food, saturation, wolfFood);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TDE.tabTDEItems);
		setAlwaysEdible();
	}
}
