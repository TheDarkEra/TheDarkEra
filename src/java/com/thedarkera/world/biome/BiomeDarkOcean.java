package com.thedarkera.world.biome;

import net.minecraft.world.biome.BiomeGenBase;

public class BiomeDarkOcean extends BiomeGenBase {

    public BiomeDarkOcean(int id) {
        super(id);
        setHeight(height_Oceans);
        spawnableCreatureList.clear();
        waterColorMultiplier = 0x000014;
    }

    public BiomeGenBase.TempCategory getTempCategory()
    {
        return BiomeGenBase.TempCategory.OCEAN;
    }
}
