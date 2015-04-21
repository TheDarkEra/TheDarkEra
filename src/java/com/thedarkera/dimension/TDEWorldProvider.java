package com.thedarkera.dimension;

import com.thedarkera.TheDarkEra;

import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;

	public class TDEWorldProvider extends WorldProvider
	{
		public void registerWorldChunkManager()
		{
			this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase.beach, 0.1F);
			this.dimensionId = TheDarkEra.dimension;
		}

		@Override
		public String getSaveFolder()
		{
			return "DIM-TheDark";
		}

		@Override
		public String getWelcomeMessage()
		{
			return "Entering The Dark Dimension";
		}

		@Override
		public String getDepartMessage()
		{
			return "Leaving The Dark Dimension";
		}

		@Override
		public boolean canRespawnHere()
		{
			return true;
		}

		@Override
		public IChunkProvider createChunkGenerator()
		{
			return new TDEChunkProvider(worldObj, worldObj.getSeed(), true);
		}

		@Override
		public String getDimensionName()
		{
			return "The Dark Dimesion";
		}

		/**
		* Gets the hard-coded portal location to use when entering this dimension.
		*/
		@Override
		public ChunkCoordinates getEntrancePortalLocation()
		{
			return null;
		}

		@Override
		public boolean canDoLightning(Chunk chunk)
		{
			return true;
		}

		@Override
		public boolean canDoRainSnowIce(Chunk chunk)
		{
			return false;
		}
	}