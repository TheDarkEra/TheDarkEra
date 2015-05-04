package com.thedarkera.proxy;

import com.thedarkera.tileentity.TESmasher;

import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy
{
	public void registerTileEntities() {

	        GameRegistry.registerTileEntity(TESmasher.class, TESmasher.name);
	    }
	
	
	public void registerRenderers() {}
}
