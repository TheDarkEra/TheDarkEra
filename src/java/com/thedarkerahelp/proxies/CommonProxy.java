package com.darkteam.thedarkera.proxies;

import com.darkteam.thedarkera.tileentities.TileEntitySmasher;

import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy 
{
	public void registerRendering() 
	{
		
	}

	public void registerItemRenders()
	{
		
	}
	public void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntitySmasher.class, TileEntitySmasher.publicName); 
	}
}