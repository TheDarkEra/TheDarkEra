package com.thedarkera;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import org.apache.logging.log4j.Logger;

import com.thedarkera.init.TDEBlocks;
import com.thedarkera.init.TDEItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TheDarkEra.MODID, name = TheDarkEra.NAME, version = TheDarkEra.VERSION)

public class TheDarkEra
{
	public static final String NAME = "The Dark Era";
	public static final String MODID = "TheDarkEra";
	public static final String VERSION = "1.7.10-A1"; //Alpha 1; feel free to change
	
	@Mod.Instance("thedarkera")
	public static TheDarkEra instance;
	
	public static Logger logger;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		logger = event.getModLog();
		
		logger.info("Loading " + TheDarkEra.NAME + " version " + TheDarkEra.VERSION + ".");
		
		TDEItems.init();
		TDEBlocks.init();
		
		logger.info(TheDarkEra.NAME + " version " + TheDarkEra.VERSION + " loaded successfully!");
	}
	
	public static CreativeTabs tabTDE = new CreativeTabs(CreativeTabs.getNextID(), "the_dark_era")
	{
		@Override
		public Item getTabIconItem()
		{
			return TDEItems.common_soul_gem;
		}
	};
}
