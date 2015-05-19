package com.thedarkera.proxy;

import com.thedarkera.TheDarkEra;
import com.thedarkera.handler.GuiHandler;
import com.thedarkera.ingameobjects.tileentity.*;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TESmasher.class, TESmasher.name);
		GameRegistry.registerTileEntity(TESmeltery.class, "smeltery");
	}

	public void registerGuiHandler() {
		NetworkRegistry.INSTANCE.registerGuiHandler(TheDarkEra.instance, new GuiHandler());
	}

	public void registerProxies() {
	}

}