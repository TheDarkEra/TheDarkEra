package com.darkteam.thedarkera.items;

import com.darkteam.thedarkera.blocks.ModBlocks;
import com.darkteam.thedarkera.items.tools.ItemSamAxe;
import com.darkteam.thedarkera.items.tools.ItemSamHoe;
import com.darkteam.thedarkera.items.tools.ItemSamPaxel;
import com.darkteam.thedarkera.items.tools.ItemSamPickaxe;
import com.darkteam.thedarkera.items.tools.ItemSamShovel;
import com.darkteam.thedarkera.items.tools.ItemSamSpax;
import com.darkteam.thedarkera.items.tools.ItemSamSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems 
{
    public static Item key;
    public static Item berry;
    public static Item samseed;
    public static Item samdust;
    public static Item samingot;
    public static Item samthrow;
    
    //tools
    public static Item sampickaxe;
    public static Item samaxe;
    public static Item samhoe;
    public static Item samshovel;
    public static Item samsword;
    
    public static Item sampaxel;
    public static Item samspax;
    
    static ToolMaterial samium = EnumHelper.addToolMaterial("samium", 3, 1000, 9.5F, 3.5F, 10);
    
    //armor
    public static Item samhelmet;
    public static Item samchest;
    public static Item samleggings;
    public static Item samboots;
    
    static ArmorMaterial samarmor = EnumHelper.addArmorMaterial("samarmor", 20, new int[] { 3, 7, 6, 3 }, 10);
    
	public static void loadItems() 
	{
    	key = new ItemKey();
    	berry = new ItemBerry(3, 0.3F, true, "berry");
    	samseed = new ItemSamSeed(ModBlocks.samPlant);
    	samdust = new ItemSamGeneric("samdust");
    	samingot = new ItemSamGeneric("samingot");
    	samthrow = new ItemSamThrow("samthrow");
    	
    	//tools
    	sampickaxe = new ItemSamPickaxe(samium, "sampickaxe");
    	samaxe = new ItemSamAxe(samium, "samaxe");
    	samhoe = new ItemSamHoe(samium, "samhoe");
    	samshovel = new ItemSamShovel(samium, "samshovel");
    	samsword = new ItemSamSword(samium, "samsword");
    	
    	sampaxel = new ItemSamPaxel(samium, "sampaxel");
    	samspax = new ItemSamSpax(samium, "samspax");
    	
    	//armor
    	samhelmet = new ItemSamArmor(samarmor, 0, "samhelmet");
    	samchest = new ItemSamArmor(samarmor, 1, "samchestplate");
    	samleggings = new ItemSamArmor(samarmor, 2, "samleggings");
    	samboots = new ItemSamArmor(samarmor, 3, "samboots");
    	
    	
    	GameRegistry.registerItem(key, "Key");
    	GameRegistry.registerItem(berry, "Berry");
    	GameRegistry.registerItem(samseed, "SamSeed");
    	GameRegistry.registerItem(samdust, "SamDust");
    	GameRegistry.registerItem(samingot, "SamIngot");
    	GameRegistry.registerItem(samthrow, "SamThrowable");
    	
    	//tools
    	GameRegistry.registerItem(sampickaxe, "SamPickaxe");
    	GameRegistry.registerItem(samaxe, "SamsAxe");
    	GameRegistry.registerItem(samhoe, "SamsHoe");
    	GameRegistry.registerItem(samshovel, "SamsShovel");
    	GameRegistry.registerItem(samsword, "SamsSword");
    	
    	GameRegistry.registerItem(sampaxel, "SamsPaxel");
    	GameRegistry.registerItem(samspax, "SamsSpax");
    	
    	//armor
    	GameRegistry.registerItem(samhelmet, "SamsHelmet");
    	GameRegistry.registerItem(samchest, "SamsChest");
    	GameRegistry.registerItem(samleggings, "SamsLeggings");
    	GameRegistry.registerItem(samboots, "SamsBoots");
	}
}