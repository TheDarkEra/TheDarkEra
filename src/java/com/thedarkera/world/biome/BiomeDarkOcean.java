package com.thedarkera.world.biome;

import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeDarkOcean extends BiomeGenBase {

    public BiomeDarkOcean(int id) {
        super(id);
        setHeight(height_Oceans);
        spawnableCreatureList.clear();
        spawnableWaterCreatureList.clear();
        waterColorMultiplier = 0x000014;
        
        this.spawnableWaterCreatureList.add(new BiomeGenBase.SpawnListEntry(EntitySquid.class, 10, 4, 4));
    }

    public BiomeGenBase.TempCategory getTempCategory()
    {
        return BiomeGenBase.TempCategory.OCEAN;
    }
}
