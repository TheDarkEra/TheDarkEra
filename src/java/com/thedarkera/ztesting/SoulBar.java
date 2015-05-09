package com.thedarkera.ztesting;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;

import com.thedarkera.TheDarkEra;

public class SoulBar {

	public static int manaBarWidth;
	public static int mana;

	public static void SoulBarRun(RenderGameOverlayEvent event) {
		if (!event.isCancelable() && event.type == ElementType.EXPERIENCE) {
			Minecraft mc = Minecraft.getMinecraft();

			if (!mc.thePlayer.capabilities.isCreativeMode) {
				int posX = event.resolution.getScaledWidth() / 2 + 10;
				int posY = event.resolution.getScaledHeight() - 48;

				mc.renderEngine.bindTexture(new ResourceLocation(TheDarkEra.MODID + ":textures/gui/SoulBar.png"));

				mc.ingameGUI.drawTexturedModalRect(posX, posY, 0, 0, 50, 5);
				mc.ingameGUI.drawTexturedModalRect(posX + 1, posY + 1, 0, 6, manaBarWidth, 3);
			}
		}
	}

	public static void addMana(int mana) {
		manaBarWidth = manaBarWidth + mana;
	}

	public static void removeMana() {

	}

}
