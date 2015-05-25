package com.thedarkera.init;

import com.thedarkera.world.biome.*;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;

	

public class TDEBiomes {
	
    protected static final BiomeGenBase.Height height_BigHills = new BiomeGenBase.Height(10F, 6F);

    public static BiomeGenBase dark_ocean;
	public static BiomeGenBase dark_land;
	public static BiomeGenBase dark_forest;
	//public static BiomeGenBase dark_village; //dark village biome???
	public static BiomeGenBase dark_beach;
	public static BiomeGenBase dark_hills;
    public static BiomeGenBase dead_land;
    public static BiomeGenBase dark_roofed_forest;
	public static BiomeGenBase dark_jungle;
    public static BiomeGenBase magical_forest;
    public static BiomeGenBase ancient_land;
    public static BiomeGenBase misty_mountains;

	public static void init() {

        dark_ocean = (new BiomeDarkOcean(51)).setBiomeName("Dark Ocean");
		dark_land = (new BiomeDeadLand(52, 0)).setColor(9286496).setBiomeName("Dark Land");
		BiomeManager.addSpawnBiome(dark_land);
		dark_forest = (new BiomeDarkForest(53, 0)).setColor(9286496).setBiomeName("Dark Forest");
		BiomeManager.addSpawnBiome(dark_forest);
        dark_hills = (new BiomeDarkHills(54, 0)).setColor(6316128).setBiomeName("Dark Extreme Hills");
        BiomeManager.addSpawnBiome(dark_hills);
        dead_land = (new BiomeDeadLand(55, 0)).setColor(6316124).setBiomeName("Dead Land");
        BiomeManager.addSpawnBiome(dead_land);
        dark_roofed_forest = (new BiomeDarkForest(56, 1)).setColor(4215066).setBiomeName("Dark Roofed Forest");
        BiomeManager.addSpawnBiome(dark_roofed_forest);
        dark_jungle = (new BiomeDarkJungle(57, 1)).setColor(6316129).setBiomeName("Dark Jungle");
        BiomeManager.addSpawnBiome(dark_jungle);
        magical_forest = (new BiomeDarkForest(58, 2)).setColor(1234567).setBiomeName("Magical Forest");
        BiomeManager.addSpawnBiome(magical_forest);
        ancient_land = (new BiomeAncientLand(59, 2)).setColor(1111111).setBiomeName("Ancient Land");
        BiomeManager.addSpawnBiome(ancient_land);
        misty_mountains = (new BiomeDarkHills(60, 1)).setColor(999999).setBiomeName("Misty Mountains").setHeight(height_BigHills);
        BiomeManager.addSpawnBiome(misty_mountains);
	}

}
