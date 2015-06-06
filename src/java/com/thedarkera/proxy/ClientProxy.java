package com.thedarkera.proxy;

import com.thedarkera.client.TDEClientEventHandler;
import com.thedarkera.client.tesr.TESRDragonBone;
import com.thedarkera.handler.KeyHandler;
import com.thedarkera.ingameobjects.tileentity.TEDragonBone;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenderers() {
		ClientRegistry.bindTileEntitySpecialRenderer(TEDragonBone.class, new TESRDragonBone());
	}
	
	@Override
	public void registerProxies() {
		FMLCommonHandler.instance().bus().register(new KeyHandler());
	}

	@Override
    public void init() {
        MinecraftForge.EVENT_BUS.register(new TDEClientEventHandler());
    }
	
}
