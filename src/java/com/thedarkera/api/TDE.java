package com.thedarkera.api;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.thedarkera.init.TDEArmors;
import com.thedarkera.init.TDEBlocks;

public class TDE {
	
	public static CreativeTabs tabTDEBlocks = new CreativeTabs(CreativeTabs.getNextID(), "the_dark_era_blocks") {
		@Override
		public Item getTabIconItem() {
			return TDEBlocks.dark_cobblestone.getItem(null, 0, 0, 0);
		}
	};
	public static CreativeTabs tabTDEItems = new CreativeTabs(CreativeTabs.getNextID(), "the_dark_era_items") {
		@Override
		public Item getTabIconItem() {
			return TDEArmors.daedric_helmet;
		}
	};

}
