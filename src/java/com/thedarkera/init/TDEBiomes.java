package com.thedarkera.init;

import com.thedarkera.world.biome.*;
import com.thedarkera.world.biome.BiomeDarkHills;
import com.thedarkera.world.biome.BiomeDarkJungle;
import com.thedarkera.world.biome.BiomeDarkOcean;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;

public class TDEBiomes {

    public static BiomeGenBase dark_ocean;
	public static BiomeGenBase dark_land;
	public static BiomeGenBase dark_forest;
	//public static BiomeGenBase dark_village; //dark village biome???
	public static BiomeGenBase dark_beach;
	public static BiomeGenBase dark_hills;
    public static BiomeGenBase dead_land;
    public static BiomeGenBase dark_roofed_forest;
	public static BiomeGenBase dark_jungle;
	//public static BiomeGenBase test_biome;

	public static void init() {

        dark_ocean = (new BiomeDarkOcean(51)).setBiomeName("Dark Ocean");
		dark_land = (new BiomeDarkLand(52)).setColor(9286496).setBiomeName("Dark Land");
		BiomeManager.addSpawnBiome(dark_land);
		dark_forest = (new BiomeDarkForest(53, 0)).setColor(9286496).setBiomeName("Dark Forest");
		BiomeManager.addSpawnBiome(dark_forest);
        dark_hills = (new BiomeDarkHills(54)).setColor(6316128).setBiomeName("Dark Extreme Hills");
        BiomeManager.addSpawnBiome(dark_hills);
        dead_land = (new BiomeDeadLand(55)).setColor(0).setBiomeName("Dead Land");
        BiomeManager.addSpawnBiome(dead_land);
        dark_roofed_forest = (new BiomeDarkForest(56, 3)).setColor(4215066).setBiomeName("Dark Roofed Forest");
        BiomeManager.addSpawnBiome(dark_roofed_forest);
        dark_jungle = (new BiomeDarkJungle(57)).setColor(6316129).setBiomeName("Dark Jungle");
        BiomeManager.addSpawnBiome(dark_jungle);

	}

}
