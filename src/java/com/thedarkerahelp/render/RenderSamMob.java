package com.darkteam.thedarkera.render;

import com.darkteam.thedarkera.Main;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderSamMob extends RenderLiving
{
	public RenderSamMob(ModelBase par1ModelBase, float par2) 
	{
		super(par1ModelBase, par2);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return new ResourceLocation(Main.MODID, "textures/models/sammob.png");
	}
}