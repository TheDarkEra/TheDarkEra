package com.thedarkera.init;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;

import com.thedarkera.world.biome.BiomeDarkForrest;
import com.thedarkera.world.biome.BiomeDarkLand;
import com.thedarkera.world.biome.TestBiome;

public class TDEBiomes {

	public static BiomeGenBase dark_land;
	public static BiomeGenBase dark_forrest;
	public static BiomeGenBase dark_village;
	public static BiomeGenBase dark_beach;
	public static BiomeGenBase dark_hills;
	public static BiomeGenBase test_biome;

	public static void init() {

		dark_land = (new BiomeDarkLand(52)).setColor(9286496).setBiomeName("dark_land");
		BiomeManager.addSpawnBiome(dark_land);
		dark_forrest = (new BiomeDarkForrest(53)).setColor(9286496).setBiomeName("dark_forrest");
		BiomeManager.addSpawnBiome(dark_forrest);
		test_biome = (new TestBiome(54)).setColor(9286496).setBiomeName("test_biome");
		BiomeManager.addSpawnBiome(test_biome);


	}

}
