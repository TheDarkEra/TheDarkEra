package com.thedarkera.proxy;

import com.thedarkera.tileentity.TEWorkBench;

import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy
{
	public void registerTileEntities() {
		 
        GameRegistry.registerTileEntity(TEWorkBench.class, TEWorkBench.publicName);
    }
	
	public void registerRenderers()
	{
		
	}
}
