package com.darkteam.thedarkera.entity;

import com.darkteam.thedarkera.Main;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ModEntities 
{
	public static void loadEntities(Main mod) 
	{
		EntityRegistry.registerModEntity(EntitySamMob.class, "sammob", 0, mod, 80, 3, true);
    	EntityRegistry.registerModEntity(EntitySamThrowable.class, "samthrow", 1, mod, 80, 3, true);
    	
    	for (int i = 0; i < BiomeGenBase.getBiomeGenArray().length; i++)
		{
			if (BiomeGenBase.getBiomeGenArray()[i] != null)
			{
				EntityRegistry.addSpawn(EntitySamMob.class, 10, 1, 3, EnumCreatureType.monster, BiomeGenBase.getBiomeGenArray()[i]);
			}
		}
    	
    	registerEntityEgg(EntitySamMob.class, 0xd8bb9d, 0xa63c1a);
	}
	
	static int startEntityId = 300;
    
    @SuppressWarnings("unchecked")
	public static void registerEntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor)
	{
		int id = getUniqueEntityId();
		EntityList.IDtoClassMapping.put(id, entity);
		EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
	}
    
    public static int getUniqueEntityId()
	{
		do
		{
			startEntityId++;
		}
		while (EntityList.getStringFromID(startEntityId) != null);

		return startEntityId;
	}
}