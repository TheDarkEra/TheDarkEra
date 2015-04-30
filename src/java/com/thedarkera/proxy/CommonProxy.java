package com.thedarkera.proxy;

import com.thedarkera.entity.TileEntityWorkBench;

import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy
{
	public void registerTileEntities() {
		 
        GameRegistry.registerTileEntity(TileEntityWorkBench.class, TileEntityWorkBench.publicName);
    }
	
	public void registerRenderers()
	{
		
	}
}
