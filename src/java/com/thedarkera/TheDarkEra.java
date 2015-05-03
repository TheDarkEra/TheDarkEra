package com.thedarkera;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.DimensionManager;

import org.apache.logging.log4j.Logger;

import com.thedarkera.dimension.TDEWorldProvider;
import com.thedarkera.handler.WorldGenHandler;
import com.thedarkera.init.TDEArmors;
import com.thedarkera.init.TDEBlocks;
import com.thedarkera.init.TDEItems;
import com.thedarkera.init.TDERecipes;
import com.thedarkera.init.TDETools;
import com.thedarkera.init.TDEWeapons;
import com.thedarkera.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = TheDarkEra.MODID, name = TheDarkEra.NAME, version = TheDarkEra.VERSION)

public class TheDarkEra
{
	public static final String NAME = "The Dark Era";
	public static final String MODID = "TheDarkEra";
	public static final String VERSION = "1.7.10-A1.0"; //Alpha 1.0; feel free to change
	
	public static int dimension = 2;
	
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
		
	 	proxy.registerRenderers();
		
		TDEItems.init();
		TDEBlocks.init();
		TDEArmors.init();
		TDERecipes.init();
		TDETools.init();
		TDEWeapons.init();
		
		GameRegistry.registerWorldGenerator(handler, 0);
		
		logger.info(TheDarkEra.NAME + " version " + TheDarkEra.VERSION + " loaded Phase 1 successfully!");
	}
	
	public static CreativeTabs tabTDE = new CreativeTabs(CreativeTabs.getNextID(), "the_dark_era")
	{
		@Override
		public Item getTabIconItem()
		{
			return TDEArmors.daedric_helmet;
		}
	};
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		logger.info("Loading " + TheDarkEra.NAME + " version " + TheDarkEra.VERSION + " Phase 2.");
		
		proxy.registerTileEntities();
		
		DimensionManager.registerProviderType(dimension, TDEWorldProvider.class, false);
    	DimensionManager.registerDimension(dimension, dimension);
    	
    	logger.info(TheDarkEra.NAME + " version " + TheDarkEra.VERSION + " loaded Phase 2 successfully!");
	    }
}
