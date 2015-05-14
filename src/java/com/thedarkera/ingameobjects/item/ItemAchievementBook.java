package com.thedarkera.ingameobjects.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.thedarkera.TheDarkEra;

public class ItemAchievementBook extends Item {

	private String name = "achievement_book";

	public ItemAchievementBook() {
		super();
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
		setFull3D();
		setMaxStackSize(1);
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}
	
	/* TODO: onItemRightClick openGui
	 */
}
