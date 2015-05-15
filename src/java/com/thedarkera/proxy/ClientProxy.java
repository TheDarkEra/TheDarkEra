package com.thedarkera.proxy;

import com.thedarkera.handler.KeyHandler;

import cpw.mods.fml.common.FMLCommonHandler;


public class ClientProxy extends CommonProxy {
	
	public void registerProxies() {
		FMLCommonHandler.instance().bus().register(new KeyHandler());
	}
	
}
