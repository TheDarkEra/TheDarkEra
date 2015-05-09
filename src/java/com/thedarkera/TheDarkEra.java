package com.thedarkera;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;

import org.apache.logging.log4j.Logger;

import com.thedarkera.handler.EnterBiomeHandler;
import com.thedarkera.handler.WorldGenHandler;
import com.thedarkera.init.TDEArmors;
import com.thedarkera.init.TDEBiomes;
import com.thedarkera.init.TDEBlocks;
import com.thedarkera.init.TDEItems;
import com.thedarkera.init.TDERecipes;
import com.thedarkera.init.TDETools;
import com.thedarkera.init.TDEWeapons;
import com.thedarkera.proxy.CommonProxy;
import com.thedarkera.updatechecker.UpdateChecker;
import com.thedarkera.utils.Events;
import com.thedarkera.world.TDEWorldProvider;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = TheDarkEra.MODID, name = TheDarkEra.NAME, version = TheDarkEra.VERSION)
public class TheDarkEra {
	public static final String NAME = "The Dark Era";
	public static final String MODID = "TheDarkEra";
	public static final String VERSION = "1.7.10-A1.0"; // Alpha 1.0; feel free
														// to change
	public static int MODVERSION = 1;

	public static int dimension = 2;

	@Mod.Instance("TheDarkEra")
	public static TheDarkEra instance;

	WorldGenHandler worldGenHandler = new WorldGenHandler();

	@SidedProxy(clientSide = "com.thedarkera.proxy.ClientProxy", serverSide = "com.thedarkera.proxy.CommonProxy")
	public static CommonProxy proxy;

	public static Logger logger;

	@SubscribeEvent
	public void checkUpdate(PlayerEvent.PlayerLoggedInEvent event) {
		if (UpdateChecker.outdated) {
			event.player.addChatComponentMessage(new ChatComponentText("TheDarkEra is oudated"));
		}
	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();

		logger.info("Loading " + TheDarkEra.NAME + " version " + TheDarkEra.VERSION + ".");

		proxy.registerRenderers();

		TDEItems.init();
		TDEBlocks.init();
		TDEArmors.init();
		TDERecipes.init();
		TDETools.init();
		TDEWeapons.init();
		TDEBiomes.init();

		GameRegistry.registerWorldGenerator(worldGenHandler, 0);

		FMLCommonHandler.instance().bus().register(new EnterBiomeHandler());

		logger.info(TheDarkEra.NAME + " version " + TheDarkEra.VERSION + " loaded Phase 1 successfully!");
	}

	public static CreativeTabs tabTDE = new CreativeTabs(CreativeTabs.getNextID(), "the_dark_era") {
		@Override
		public Item getTabIconItem() {
			return TDEArmors.daedric_helmet;
		}
	};

	@EventHandler
	public void init(FMLInitializationEvent event) {
		logger.info("Loading " + TheDarkEra.NAME + " version " + TheDarkEra.VERSION + " Phase 2.");

		proxy.registerTileEntities();

		DimensionManager.registerProviderType(dimension, TDEWorldProvider.class, false);
		DimensionManager.registerDimension(dimension, dimension);

		MinecraftForge.EVENT_BUS.register(new Events());

		logger.info(TheDarkEra.NAME + " version " + TheDarkEra.VERSION + " loaded Phase 2 successfully!");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		logger.info("Loading " + TheDarkEra.NAME + " version " + TheDarkEra.VERSION + " Phase 3.");

		proxy.registerGuiHandler();

		logger.info(TheDarkEra.NAME + " version " + TheDarkEra.VERSION + " loaded Phase 3 successfully!");
	}

	public enum GuiID {
		SMASHER, SMELTERY
	}
}

/*
 * TODO: Dimension/Biome Stuff Textures: dead_grass, dead_grass_top,
 * weedy_grass, weedy_grass_top, dark_dirt, dark_grass, dark_grass_top,
 * dark_grass_side. Add new leaves (dead_leaves). Make tree using rotten wood
 * log and dead leaves (Called dark_tree). Make a forest using dark trees in the
 * Dark Forest Biome. Add recipes for the wood etc. Make dark dirt turn to dark
 * grass after a while. Make dark grass drop dark dirt. Rename dark forrest to
 * dark forest.
 */
