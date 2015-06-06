package com.thedarkera;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.thedarkera.handler.*;
import com.thedarkera.init.*;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;

import org.apache.logging.log4j.Logger;

import com.thedarkera.packet.PacketPipeline;
import com.thedarkera.proxy.CommonProxy;
import com.thedarkera.utils.UpdateChecker;
import com.thedarkera.world.TDEWorldProvider;
import com.thedarkera.ztesting.GuiManaBar;

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
	public static final String VERSION = "1.7.10-A1.0";
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
		TDEAchievements.init();

		if (FMLCommonHandler.instance().getEffectiveSide().isClient())
			MinecraftForge.EVENT_BUS.register(new GuiManaBar(Minecraft.getMinecraft()));

		Potion[] potionTypes;

		for (Field f : Potion.class.getDeclaredFields()) {
			f.setAccessible(true);

			try {
				if (f.getName().equals("potionTypes") || f.getName().equals("field_76425_a")) {
					Field modfield = Field.class.getDeclaredField("modifiers");
					modfield.setAccessible(true);
					modfield.setInt(f, f.getModifiers() & ~Modifier.FINAL);
					potionTypes = (Potion[]) f.get(null);
					final Potion[] newPotionTypes = new Potion[256];
					System.arraycopy(potionTypes, 0, newPotionTypes, 0, potionTypes.length);
					f.set(null, newPotionTypes);
				}
			} catch (Exception e) {
				System.err.println("(Potions!) Severe error, please report this to the mod author:");
				System.err.println(e);
			}
		}

		GameRegistry.registerWorldGenerator(worldGenHandler, 0);

		FMLCommonHandler.instance().bus().register(new EnterBiomeHandler());
		FMLCommonHandler.instance().bus().register(new serverTickHandler());

		logger.info(TheDarkEra.NAME + " version " + TheDarkEra.VERSION + " loaded Phase 1 successfully!");
	}
	
	//Tabs

	@EventHandler
	public void init(FMLInitializationEvent event) {
		logger.info("Loading " + TheDarkEra.NAME + " version " + TheDarkEra.VERSION + " Phase 2.");

		packetPipeline.initialize();

		proxy.registerTileEntities();
		proxy.init();

		DimensionManager.registerProviderType(dimension, TDEWorldProvider.class, false);
		DimensionManager.registerDimension(dimension, dimension);

		MinecraftForge.EVENT_BUS.register(new TDEEventHandler());
		MinecraftForge.EVENT_BUS.register(new TDEPotionEffectHandler());

		FMLCommonHandler.instance().bus().register(new AchievedHandler());

		logger.info(TheDarkEra.NAME + " version " + TheDarkEra.VERSION + " loaded Phase 2 successfully!");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		logger.info("Loading " + TheDarkEra.NAME + " version " + TheDarkEra.VERSION + " Phase 3.");

		proxy.registerGuiHandler();
		proxy.registerRenderers();

		packetPipeline.postInitialize();

		logger.info(TheDarkEra.NAME + " version " + TheDarkEra.VERSION + " loaded Phase 3 successfully!");
	}

	public enum GuiID {
		SMASHER, SMELTERY, ACHIEVEMENTBOOK
	}

}
