package com.thedarkera.ztesting;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;

import org.lwjgl.opengl.GL11;

import com.thedarkera.TheDarkEra;

public class ShoutList {
	public static String[] ShoutNames = new String[] { "Shout 1", "Shout 2", "Test" };
	private static int Shout;
	private static int NumberIconLocation;
	private static int FontDuration = 0;

	public static void ShoutBarRun(RenderGameOverlayEvent event) {
		if (!event.isCancelable() && event.type == ElementType.EXPERIENCE) {
			Minecraft mc = Minecraft.getMinecraft();

			int posX = ((event.resolution.getScaledWidth() / 4) * 3) + 10;
			int posY = event.resolution.getScaledHeight() - 22;

			NumberIconLocation = Shout * 16;

			mc.renderEngine.bindTexture(new ResourceLocation(TheDarkEra.MODID + ":textures/gui/ShoutBar.png"));
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glDisable(GL11.GL_DEPTH_TEST);
			GL11.glDepthMask(false);
			GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			GL11.glDisable(GL11.GL_ALPHA_TEST);
			mc.ingameGUI.drawTexturedModalRect(posX, posY, 0, 0, 22, 21);
			mc.ingameGUI.drawTexturedModalRect(posX + 3, posY + 3, NumberIconLocation, 22, 16, 16);
			if (FontDuration > 0){
				mc.fontRenderer.drawStringWithShadow(ShoutNames[Shout], posX, posY, 0xFFFFFF);
				FontDuration--;
			}
			GL11.glDisable(GL11.GL_BLEND);
			GL11.glEnable(GL11.GL_DEPTH_TEST);
			GL11.glDepthMask(true);
		}
	}

	public static void NextShout() {
		if (!(Shout >= 2)) {
			Shout++;
		}
		FontDuration = 40;
	}

	public static void PreviousShout() {
		if (!(Shout <= 0)) {
			Shout--;
		}
		FontDuration = 40;
	}
}