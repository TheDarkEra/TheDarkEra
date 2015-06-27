package com.thedarkera.client.tesr;

import static org.lwjgl.opengl.GL11.*;
import org.lwjgl.opengl.GL12;

import com.thedarkera.TheDarkEra;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class TESRDragonBone extends TileEntitySpecialRenderer {

	IModelCustom model = AdvancedModelLoader.loadModel(new ResourceLocation(TheDarkEra.MODID.toLowerCase(), "models/blocks/dragon_bone.obj"));
	ResourceLocation texture = new ResourceLocation(TheDarkEra.MODID.toLowerCase(), "textures/blocks/dragon_bone.png");
	
	@Override
	public void renderTileEntityAt(TileEntity te, double x, double y, double z, float p_147500_8_) {
		bindTexture(texture);
		
		glPushMatrix();
		glEnable(GL12.GL_RESCALE_NORMAL);
		glDisable(GL_CULL_FACE);
		glDisable(GL_LIGHTING);
		glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		glTranslatef((float)x + 0.5F, (float)y + 0.0F, (float)z + 0.5F);
		glScalef(0.075F, 0.075F, 0.075F);
		
		model.renderAll();
		glPopMatrix();
	}

}
