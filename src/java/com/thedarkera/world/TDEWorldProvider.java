package com.thedarkera.world;

import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;

import com.thedarkera.TheDarkEra;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TDEWorldProvider extends WorldProvider {

	@Override
	public void registerWorldChunkManager() {
	
		this.worldChunkMgr = new WorldChunkManagerTDE(worldObj.getSeed(), terrainType);
		this.dimensionId = TheDarkEra.dimension;	
	//	this.isHellWorld = true;
	    this.hasNoSky = true;
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
		return true;

	}
	@Override
	@SideOnly(Side.CLIENT)
	    public boolean isSkyColored()
	    {
	        return false;
	    }
	@Override
	  protected void generateLightBrightnessTable()
	    {
	        float f = 0.1F;

	        for (int i = 0; i <= 15; ++i)
	        {
	            float f1 = 1.0F - (float)i / 15.0F;
	            this.lightBrightnessTable[i] = (1.0F - f1) / (f1 * 3.0F + 1.0F) * (1.0F - f) + f;
	        }
	    }

	//@Override
//	public IRenderHandler getSkyRenderer() {
	//	return new SkyRenderer();
	//}

}
