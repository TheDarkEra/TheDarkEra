package com.thedarkera.world.renderers;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.ReflectionHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import net.minecraftforge.client.IRenderHandler;

public class SkyRenderer extends IRenderHandler {

	private int starGLCallList;
	private int glSkyList;
	private int glSkyList2;

	public SkyRenderer() {
		RenderGlobal renderGlobal = Minecraft.getMinecraft().renderGlobal;
		this.glSkyList2 = (this.glSkyList = (this.starGLCallList = ReflectionHelper.getPrivateValue(RenderGlobal.class, renderGlobal, "starGLCallList")) + 1) + 1;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void render(float partialTicks, WorldClient world, Minecraft mc) {
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		Vec3 vec3 = world.getSkyColor(mc.renderViewEntity, partialTicks);
		float f1 = (float) vec3.xCoord;
		float f2 = (float) vec3.yCoord;
		float f3 = (float) vec3.zCoord;
		float f4;
		if (mc.gameSettings.anaglyph) {
			float f5 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
			float f6 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
			f4 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
			f1 = f5;
			f2 = f6;
			f3 = f4;
		}
		GL11.glColor3f(f1, f2, f3);
		Tessellator tessellator1 = Tessellator.instance;
		GL11.glDepthMask(false);
		GL11.glEnable(GL11.GL_FOG);
		GL11.glColor3f(f1, f2, f3);
		GL11.glCallList(this.glSkyList);
		GL11.glDisable(GL11.GL_FOG);
		GL11.glDisable(GL11.GL_ALPHA_TEST);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		RenderHelper.disableStandardItemLighting();
		float[] afloat = world.provider.calcSunriseSunsetColors(world.getCelestialAngle(partialTicks), partialTicks);
		float f7;
		float f8;
		float f9;
		float f10;
		if (afloat != null) {
			GL11.glDisable(GL11.GL_TEXTURE_2D);
			GL11.glShadeModel(GL11.GL_SMOOTH);
			GL11.glPushMatrix();
			GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(MathHelper.sin(world.getCelestialAngleRadians(partialTicks)) < 0.0F ? 180.0F : 0.0F, 0.0F, 0.0F, 1.0F);
			GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
			f4 = afloat[0];
			f7 = afloat[1];
			f8 = afloat[2];
			float f11;
			if (mc.gameSettings.anaglyph) {
				f9 = (f4 * 30.0F + f7 * 59.0F + f8 * 11.0F) / 100.0F;
				f10 = (f4 * 30.0F + f7 * 70.0F) / 100.0F;
				f11 = (f4 * 30.0F + f8 * 70.0F) / 100.0F;
				f4 = f9;
				f7 = f10;
				f8 = f11;
			}
			tessellator1.startDrawing(6);
			tessellator1.setColorRGBA_F(f4, f7, f8, afloat[3]);
			tessellator1.addVertex(0.0D, 100.0D, 0.0D);
			byte b0 = 16;
			tessellator1.setColorRGBA_F(afloat[0], afloat[1], afloat[2], 0.0F);
			for (int j = 0; j <= b0; ++j) {
				f11 = (float) j * (float) Math.PI * 2.0F / (float) b0;
				float f12 = MathHelper.sin(f11);
				float f13 = MathHelper.cos(f11);
				tessellator1.addVertex((double) (f12 * 120.0F), (double) (f13 * 120.0F), (double) (-f13 * 40.0F * afloat[3]));
			}
			tessellator1.draw();
			GL11.glPopMatrix();
			GL11.glShadeModel(GL11.GL_FLAT);
		}
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);
		GL11.glPushMatrix();
		f4 = 1.0F - world.getRainStrength(partialTicks);
		f7 = 0.0F;
		f8 = 0.0F;
		f9 = 0.0F;
		GL11.glColor4f(1.0F, 1.0F, 1.0F, f4);
		GL11.glTranslatef(f7, f8, f9);
		GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(world.getCelestialAngle(partialTicks) * 360.0F, 1.0F, 0.0F, 0.0F);

		f10 = 20.0F; // Size of sun from center
		mc.renderEngine.getTexture(new ResourceLocation("thedarkera:/textures/enviroment/sun.png"));

		tessellator1.startDrawingQuads();
		tessellator1.addVertexWithUV((double) (-f10), 100.0D, (double) (-f10), 0.0D, 0.0D);
		tessellator1.addVertexWithUV((double) f10, 100.0D, (double) (-f10), 1.0D, 0.0D);
		tessellator1.addVertexWithUV((double) f10, 100.0D, (double) f10, 1.0D, 1.0D);
		tessellator1.addVertexWithUV((double) (-f10), 100.0D, (double) f10, 0.0D, 1.0D);

		tessellator1.draw(); // Draw sun
		f10 = 15.0F; // Size of moon from center
		mc.renderEngine.bindTexture(new ResourceLocation(":/textures/enviroment/moon_phases.png"));

		int k = world.getMoonPhase();
		int l = k % 4;
		int i1 = k / 4 % 2;
		float f14 = (float) (l + 0) / 4.0F;
		float f15 = (float) (i1 + 0) / 2.0F;
		float f16 = (float) (l + 1) / 4.0F;
		float f17 = (float) (i1 + 1) / 2.0F;
		tessellator1.startDrawingQuads();
		tessellator1.addVertexWithUV((double) (-f10), -100.0D, (double) f10, (double) f16, (double) f17);
		tessellator1.addVertexWithUV((double) f10, -100.0D, (double) f10, (double) f14, (double) f17);
		tessellator1.addVertexWithUV((double) f10, -100.0D, (double) (-f10), (double) f14, (double) f15);
		tessellator1.addVertexWithUV((double) (-f10), -100.0D, (double) (-f10), (double) f16, (double) f15);
		tessellator1.draw();
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		float f18 = world.getStarBrightness(partialTicks) * f4;
		if (f18 > 0.0F) {
			GL11.glColor4f(f18, f18, f18, f18);
			GL11.glCallList(this.starGLCallList);
		}
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glEnable(GL11.GL_ALPHA_TEST);
		GL11.glEnable(GL11.GL_FOG);
		GL11.glPopMatrix();
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		GL11.glColor3f(0.0F, 0.0F, 0.0F);
		double d0 = mc.thePlayer.getPosition(partialTicks).yCoord - world.getHorizon();
		if (d0 < 0.0D) {
			GL11.glPushMatrix();
			GL11.glTranslatef(0.0F, 12.0F, 0.0F);
			GL11.glCallList(this.glSkyList2);
			GL11.glPopMatrix();
			f8 = 1.0F;
			f9 = -((float) (d0 + 65.0D));
			f10 = -f8;
			tessellator1.startDrawingQuads();
			tessellator1.setColorRGBA_I(0, 255);
			tessellator1.addVertex((double) (-f8), (double) f9, (double) f8);
			tessellator1.addVertex((double) f8, (double) f9, (double) f8);
			tessellator1.addVertex((double) f8, (double) f10, (double) f8);
			tessellator1.addVertex((double) (-f8), (double) f10, (double) f8);
			tessellator1.addVertex((double) (-f8), (double) f10, (double) (-f8));
			tessellator1.addVertex((double) f8, (double) f10, (double) (-f8));
			tessellator1.addVertex((double) f8, (double) f9, (double) (-f8));
			tessellator1.addVertex((double) (-f8), (double) f9, (double) (-f8));
			tessellator1.addVertex((double) f8, (double) f10, (double) (-f8));
			tessellator1.addVertex((double) f8, (double) f10, (double) f8);
			tessellator1.addVertex((double) f8, (double) f9, (double) f8);
			tessellator1.addVertex((double) f8, (double) f9, (double) (-f8));
			tessellator1.addVertex((double) (-f8), (double) f9, (double) (-f8));
			tessellator1.addVertex((double) (-f8), (double) f9, (double) f8);
			tessellator1.addVertex((double) (-f8), (double) f10, (double) f8);
			tessellator1.addVertex((double) (-f8), (double) f10, (double) (-f8));
			tessellator1.addVertex((double) (-f8), (double) f10, (double) (-f8));
			tessellator1.addVertex((double) (-f8), (double) f10, (double) f8);
			tessellator1.addVertex((double) f8, (double) f10, (double) f8);
			tessellator1.addVertex((double) f8, (double) f10, (double) (-f8));
			tessellator1.draw();
		}
		if (world.provider.isSkyColored()) {
			GL11.glColor3f(0.2F + 0.04F, f2 * 0.2F + 0.04F, f3 * 0.6F + 0.1F);
		} else {
			GL11.glColor3f(f1, f2, f3);
		}
		GL11.glPushMatrix();
		GL11.glTranslatef(0.0F, -((float) (d0 - 16.0D)), 0.0F);
		GL11.glCallList(this.glSkyList2);
		GL11.glPopMatrix();
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		GL11.glDepthMask(true);
	}
}
