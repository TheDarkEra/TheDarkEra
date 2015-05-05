package com.thedarkera.init;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;

import com.thedarkera.biome.BiomeDarkForrest;
import com.thedarkera.biome.BiomeDarkLand;

public class TDEBiomes {
	
	public static BiomeGenBase dark_land;
	public static BiomeGenBase dark_forrest;
	public static BiomeGenBase dark_village;
	public static BiomeGenBase dark_beach;
	public static BiomeGenBase dark_hills;

	public static void init() {
		
		dark_land = (new BiomeDarkLand(52)).setColor(9286496).setBiomeName("dark_land"); 
		BiomeManager.addSpawnBiome(dark_land);
		dark_forrest = (new BiomeDarkForrest(53)).setColor(9286496).setBiomeName("dark_forrest"); 
		BiomeManager.addSpawnBiome(dark_forrest);
		
	}
	
}
