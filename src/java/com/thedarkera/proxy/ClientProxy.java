package com.thedarkera.proxy;

import com.thedarkera.client.TDEClientEventHandler;
import com.thedarkera.handler.KeyHandler;

import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraftforge.common.MinecraftForge;


public class ClientProxy extends CommonProxy {
	
	public void registerProxies() {
		FMLCommonHandler.instance().bus().register(new KeyHandler());
	}

    public void init(){
        MinecraftForge.EVENT_BUS.register(new TDEClientEventHandler());
    }
	
}
