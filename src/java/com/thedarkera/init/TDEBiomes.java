package com.thedarkera.init;

import com.thedarkera.biome.BiomeDarkLand;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;

public class TDEBiomes {
	
	public static BiomeGenBase dark_land;

	public static void init() {
		
		dark_land = (new BiomeDarkLand(52)).setColor(9286496).setBiomeName("dark_land"); 
		BiomeManager.warmBiomes.add(new BiomeManager.BiomeEntry(dark_land, 25)); 
		BiomeManager.addSpawnBiome(dark_land); 
		BiomeDictionary.registerBiomeType(dark_land, new BiomeDictionary.Type[]{BiomeDictionary.Type.PLAINS}); 

		
	}
	
}
