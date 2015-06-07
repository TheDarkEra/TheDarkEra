package com.thedarkera.api;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.thedarkera.init.TDEItems;

public class TDE {
	
	public static CreativeTabs tabTDEBlocks = new CreativeTabs(CreativeTabs.getNextID(), "the_dark_era_blocks") {
		@Override
		public Item getTabIconItem() {
			return TDEItems.tab_logo_0;
		}
	};
	public static CreativeTabs tabTDEItems = new CreativeTabs(CreativeTabs.getNextID(), "the_dark_era_items") {
		@Override
		public Item getTabIconItem() {
			return TDEItems.tab_logo_1;
		}
	};
	
	/*
	 * Put anything that would normally go in TheDarkEra class but needs to be available to addon developers here.
	 */

}
