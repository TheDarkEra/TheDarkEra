package com.darkteam.thedarkera;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.common.MinecraftForge;

import com.darkteam.thedarkera.blocks.ModBlocks;
import com.darkteam.thedarkera.dimension.WorldProviderExample;
import com.darkteam.thedarkera.entity.ModEntities;
import com.darkteam.thedarkera.handlers.GuiHandler;
import com.darkteam.thedarkera.handlers.RecipeHandler;
import com.darkteam.thedarkera.handlers.WorldGenHandler;
import com.darkteam.thedarkera.items.ModItems;
import com.darkteam.thedarkera.proxies.CommonProxy;
import com.darkteam.thedarkera.tileentities.TileEntitySam;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main
{
    public static final String MODID = "darkteam_thedarkera";
    public static final String VERSION = "1.0";
    
    WorldGenHandler handler = new WorldGenHandler();
    
	@SidedProxy(clientSide = "com.darkteam.thedarkera.proxies.ClientProxy", serverSide = "com.darkteam.thedarkera.proxies.CommonProxy")
	public static CommonProxy proxy;
	
	public static int dimension = 5;
	
	@Mod.Instance(Main.MODID)
	public static Main instance; 
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	proxy.registerRendering();
    	
    	ModBlocks.loadBlocks();
    	
    	GameRegistry.registerTileEntity(TileEntitySam.class, "TE_samTE");
    	
    	ModItems.loadItems();
    	
    	proxy.registerItemRenders();
    	
    	ModEntities.loadEntities(this);
    	
    	GameRegistry.registerWorldGenerator(handler, 0);
    	
    	MinecraftForge.EVENT_BUS.register(handler);
    	
    	LanguageRegistry.instance().addStringLocalization("itemGroup.tabTheDarkEra", "en_US", "The Dark Era");
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	RecipeHandler.registerRecipes();
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
        proxy.registerTileEntities();
    	
    	//Dungeon changes
    	DungeonHooks.removeDungeonMob("Spider");
    	DungeonHooks.addDungeonMob("Creeper", 100);
    	ChestGenHooks.removeItem(ChestGenHooks.DUNGEON_CHEST, new ItemStack(Items.saddle));
    	ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new WeightedRandomChestContent(new ItemStack(Blocks.cobblestone), 25, 50, 10));
    	DimensionManager.registerProviderType(dimension, WorldProviderExample.class, false);
    	DimensionManager.registerDimension(dimension, dimension);
    }
}