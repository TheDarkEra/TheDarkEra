package com.thedarkera;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import org.apache.logging.log4j.Logger;

import com.thedarkera.handler.WorldGenHandler;
import com.thedarkera.init.TDEArmors;
import com.thedarkera.init.TDEBlocks;
import com.thedarkera.init.TDEItems;
import com.thedarkera.init.TDERecipes;
import com.thedarkera.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = TheDarkEra.MODID, name = TheDarkEra.NAME, version = TheDarkEra.VERSION)

public class TheDarkEra
{
	public static final String NAME = "The Dark Era";
	public static final String MODID = "TheDarkEra";
	public static final String VERSION = "1.7.10-A1"; //Alpha 1; feel free to change
	
	@Mod.Instance("thedarkera")
	public static TheDarkEra instance;
	
	WorldGenHandler handler = new WorldGenHandler();
	
	@SidedProxy(clientSide = "com.thedarkera.proxy.ClientProxy", serverSide = "com.thedarkera.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	public static Logger logger;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		logger = event.getModLog();
		
		logger.info("Loading " + TheDarkEra.NAME + " version " + TheDarkEra.VERSION + ".");
		
		TDEItems.init();
		TDEBlocks.init();
		TDEArmors.init();
		TDERecipes.init();
		
		GameRegistry.registerWorldGenerator(handler, 0);
		
		logger.info(TheDarkEra.NAME + " version " + TheDarkEra.VERSION + " loaded successfully!");
	}
	
	public static CreativeTabs tabTDE = new CreativeTabs(CreativeTabs.getNextID(), "the_dark_era")
	{
		@Override
		public Item getTabIconItem()
		{
			return TDEItems.soul_gem;
		}
	};
	
	/*
	 * Will be filled with Gui IDs.
	 * With this we can get GuiID.EXAMPLE_GUI.ordinal() and get its corresponding gui id.
	 */
	public enum GuiID
	{
		
	}
}
