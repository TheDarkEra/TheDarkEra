package com.thedarkera.proxy;

import com.thedarkera.render.RenderDarkBirchWood;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenderers() {
		RenderingRegistry.registerBlockHandler(new RenderDarkBirchWood());
	}
}
