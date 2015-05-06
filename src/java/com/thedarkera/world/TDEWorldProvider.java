package com.thedarkera.world;

import net.minecraft.entity.Entity;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.Vec3;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.client.IRenderHandler;

import com.thedarkera.TheDarkEra;
import com.thedarkera.init.TDEBiomes;
import com.thedarkera.world.renderers.SkyRenderer;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TDEWorldProvider extends WorldProvider {
	public void registerWorldChunkManager() {
		// this.worldChunkMgr = new WorldChunkManagerHell(Biome Generator, Float
		// for Rainfall);
		this.worldChunkMgr = new WorldChunkManagerHell(TDEBiomes.dark_land,
				0.1F);
		this.worldChunkMgr = new WorldChunkManagerHell(TDEBiomes.dark_forrest,
				0.1F);
		// this.worldChunkMgr = new
		// WorldChunkManagerHell(TDEBiomes.dark_village, 0.1F);
		// this.worldChunkMgr = new WorldChunkManagerHell(TDEBiomes.dark_beach,
		// 0.1F);
		// this.worldChunkMgr = new WorldChunkManagerHell(TDEBiomes.dark_hills,
		// 0.1F);
		this.dimensionId = TheDarkEra.dimension;
	}

	public boolean isSurfaceWorld() {
		return false;
	}

	@Override
	public String getSaveFolder() {
		return "DIM-TheDark";
	}

	@Override
	public String getWelcomeMessage() {
		return "Entering The Dark Dimension";
	}

	@Override
	public String getDepartMessage() {
		return "Leaving The Dark Dimension";
	}

	@Override
	public boolean canRespawnHere() {
		return true;
	}

	@Override
	public IChunkProvider createChunkGenerator() {
		return new TDEChunkProvider(worldObj, worldObj.getSeed(), true);
	}

	@Override
	public String getDimensionName() {
		return "The Dark Dimension";
	}

	@Override
	public ChunkCoordinates getEntrancePortalLocation() {
		return null;
	}

	@Override
	public boolean canDoLightning(Chunk chunk) {
		return true;
	}

	@Override
	public boolean canDoRainSnowIce(Chunk chunk) {
		return false;

	}

	@Override
	public IRenderHandler getSkyRenderer() {
		return new SkyRenderer();
	}
}