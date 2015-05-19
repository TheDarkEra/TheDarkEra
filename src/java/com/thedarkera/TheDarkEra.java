package com.thedarkera;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;

import org.apache.logging.log4j.Logger;

import com.thedarkera.handler.EnterBiomeHandler;
import com.thedarkera.handler.TDEEventHandler;
import com.thedarkera.handler.TDEPotionEffectHandler;
import com.thedarkera.handler.WorldGenHandler;
import com.thedarkera.handler.serverTickHandler;
import com.thedarkera.init.TDEArmors;
import com.thedarkera.init.TDEBiomes;
import com.thedarkera.init.TDEBlocks;
import com.thedarkera.init.TDEItems;
import com.thedarkera.init.TDEPotionEffects;
import com.thedarkera.init.TDERecipes;
import com.thedarkera.init.TDETools;
import com.thedarkera.init.TDEWeapons;
import com.thedarkera.packet.PacketPipeline;
import com.thedarkera.proxy.CommonProxy;
import com.thedarkera.utils.UpdateChecker;
import com.thedarkera.world.TDEWorldProvider;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = TheDarkEra.MODID, name = TheDarkEra.NAME, version = TheDarkEra.VERSION)
public class TheDarkEra {
	public static final String NAME = "The Dark Era";
	public static final String MODID = "TheDarkEra";
	public static final String VERSION = "1.7.10-A1.0"; // Alpha 1.0; feel free
														// to change
	public static int MODVERSION = 1;

	public static int dimension = -10;
	
	public static final PacketPipeline packetPipeline = new PacketPipeline();

	@Instance(MODID)
	public static TheDarkEra instance;
	public static SimpleNetworkWrapper network;

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

		proxy.registerProxies();

		TDEItems.init();
		TDEBlocks.init();
		TDEArmors.init();
		TDERecipes.init();
		TDETools.init();
		TDEWeapons.init();
		TDEBiomes.init();
		TDEPotionEffects.init();
		
		 Potion[] potionTypes = null;

	        for (Field f : Potion.class.getDeclaredFields())
	        {
	            f.setAccessible(true);

	            try
	            {
	                if (f.getName().equals("potionTypes") || f.getName().equals("field_76425_a"))
	                {
	                    Field modfield = Field.class.getDeclaredField("modifiers");
	                    modfield.setAccessible(true);
	                    modfield.setInt(f, f.getModifiers() & ~Modifier.FINAL);
	                    potionTypes = (Potion[]) f.get(null);
	                    final Potion[] newPotionTypes = new Potion[256];
	                    System.arraycopy(potionTypes, 0, newPotionTypes, 0, potionTypes.length);
	                    f.set(null, newPotionTypes);
	                }
	            } catch (Exception e)
	            {
	                System.err.println("(Potions!) Severe error, please report this to the mod author:");
	                System.err.println(e);
	            }
	        }
		
		GameRegistry.registerWorldGenerator(worldGenHandler, 0);

		FMLCommonHandler.instance().bus().register(new EnterBiomeHandler());
		FMLCommonHandler.instance().bus().register(new serverTickHandler());

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

		packetPipeline.initialize();
		
		proxy.registerTileEntities();

		DimensionManager.registerProviderType(dimension, TDEWorldProvider.class, false);
		DimensionManager.registerDimension(dimension, dimension);

		MinecraftForge.EVENT_BUS.register(new TDEEventHandler());
		MinecraftForge.EVENT_BUS.register(new TDEPotionEffectHandler());
		
		logger.info(TheDarkEra.NAME + " version " + TheDarkEra.VERSION + " loaded Phase 2 successfully!");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		logger.info("Loading " + TheDarkEra.NAME + " version " + TheDarkEra.VERSION + " Phase 3.");

		proxy.registerGuiHandler();
		
		packetPipeline.postInitialize();

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
