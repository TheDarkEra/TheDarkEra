package com.thedarkera.api;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.thedarkera.api.items.TabLogo;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class TDE {
	
	
	private static Item tab_logo_0;
	private static Item tab_logo_1;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	
	
	tab_logo_0 = new TabLogo("tab_logo_0");
	GameRegistry.registerItem(tab_logo_0, tab_logo_0.getUnlocalizedName().substring(5));
	tab_logo_1 = new TabLogo("tab_logo_1");
	GameRegistry.registerItem(tab_logo_1, tab_logo_1.getUnlocalizedName().substring(5));
	
	
	}
	
	public static CreativeTabs tabTDEBlocks = new CreativeTabs(CreativeTabs.getNextID(), "the_dark_era_blocks") {
		@Override
		public Item getTabIconItem() {
			this.setNoTitle();
			this.setBackgroundImageName("TDEBlocks.png");
			return tab_logo_0;
		}
	};
	
	public static CreativeTabs tabTDEItems = new CreativeTabs(CreativeTabs.getNextID(), "the_dark_era_items") {
		@Override
		public Item getTabIconItem() {
			this.setNoTitle();
			this.setBackgroundImageName("TDEItems.png");
			return tab_logo_1;
		}
	};
	
	/*
	 * Put anything that would normally go in TheDarkEra class but needs to be available to addon developers here.
	 */

}
