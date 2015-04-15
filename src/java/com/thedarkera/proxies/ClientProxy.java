package com.darkteam.thedarkera.proxies;

import com.darkteam.thedarkera.entity.EntitySamMob;
import com.darkteam.thedarkera.entity.EntitySamThrowable;
import com.darkteam.thedarkera.items.ModItems;
import com.darkteam.thedarkera.render.ModelSamMob;
import com.darkteam.thedarkera.render.RenderSamMob;

import net.minecraft.client.renderer.entity.RenderSnowball;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRendering() 
	{
		RenderingRegistry.registerEntityRenderingHandler(EntitySamMob.class, new RenderSamMob(new ModelSamMob(), 0.5F));
	}
	
	@Override
	public void registerItemRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntitySamThrowable.class, new RenderSnowball(ModItems.samthrow));
	}
}