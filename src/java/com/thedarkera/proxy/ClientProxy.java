package com.thedarkera.proxy;

import com.thedarkera.client.TDEClientEventHandler;
import com.thedarkera.client.TDEPotionEffectHandler;
import com.thedarkera.handler.KeyHandler;

import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraftforge.common.MinecraftForge;


public class ClientProxy extends CommonProxy {
	
	public void registerProxies() {
		FMLCommonHandler.instance().bus().register(new KeyHandler());

        MinecraftForge.EVENT_BUS.register(new TDEPotionEffectHandler());
        MinecraftForge.EVENT_BUS.register(new TDEClientEventHandler());
	}
	
}
