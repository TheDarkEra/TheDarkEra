package com.thedarkera.init;

import com.thedarkera.world.biome.BiomeDarkHills;
import com.thedarkera.world.biome.BiomeDarkOcean;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;

import com.thedarkera.world.biome.BiomeDarkForrest;
import com.thedarkera.world.biome.BiomeDarkLand;

public class TDEBiomes {

    public static BiomeGenBase dark_ocean;
	public static BiomeGenBase dark_land;
	public static BiomeGenBase dark_forrest;
	public static BiomeGenBase dark_village; //dark village biome???
	public static BiomeGenBase dark_beach;
	public static BiomeGenBase dark_hills;
	//public static BiomeGenBase test_biome;

	public static void init() {

        dark_ocean = (new BiomeDarkOcean(51)).setBiomeName("Dark Ocean");
		dark_land = (new BiomeDarkLand(52)).setColor(9286496).setBiomeName("Dark Land");
		BiomeManager.addSpawnBiome(dark_land);
		dark_forrest = (new BiomeDarkForrest(53)).setColor(9286496).setBiomeName("Dark Forrest");
		BiomeManager.addSpawnBiome(dark_forrest);
        dark_hills = (new BiomeDarkHills(54)).setColor(6316128).setBiomeName("Dark Extreme Hills");
        BiomeManager.addSpawnBiome(dark_hills);
	}

}
