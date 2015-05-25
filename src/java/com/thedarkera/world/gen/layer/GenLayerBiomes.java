package com.thedarkera.world.gen.layer;

import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.layer.IntCache;
import static com.thedarkera.init.TDEBiomes.*;

public class GenLayerBiomes extends GenLayer {

	// TODO: spawning with temperatures
    protected BiomeGenBase[] allowedBiomes = {
    		 dead_land, 
    		 dark_jungle, 
    		 dark_forest,
    		 ancient_land,
    		 misty_mountains,
    };
    
    public GenLayerBiomes(long seed) {
		super(seed);
	}
	
	public GenLayerBiomes(long seed, GenLayer genlayer) {
		super(seed);
		this.parent = genlayer;
	}
	
    @Override
    public int[] getInts(int x, int z, int width, int depth) {
        int[] dest = IntCache.getIntCache(width * depth);
        for (int dz = 0; dz < depth; dz++) {
            for (int dx = 0; dx < width; dx++) {
                this.initChunkSeed(dx + x, dz + z);
                dest[(dx + dz * width)] = this.allowedBiomes[nextInt(this.allowedBiomes.length)].biomeID;
            }
        }
        return dest;
    }
}

