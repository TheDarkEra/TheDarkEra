package com.thedarkera.proxy;

import com.thedarkera.tileentity.TEWorkBench;
import com.thedarkera.tileentity.TileEntitySmasher;

import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy
{
	public void registerTileEntities() {
        GameRegistry.registerTileEntity(TEWorkBench.class, TEWorkBench.publicName);
        GameRegistry.registerTileEntity(TileEntitySmasher.class, TileEntitySmasher.publicName);
    }
	
	public void registerRenderers()
	{
		
	}
}
