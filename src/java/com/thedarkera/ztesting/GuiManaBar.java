package com.thedarkera.ztesting;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;

import org.lwjgl.opengl.GL11;

import com.thedarkera.TheDarkEra;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiManaBar extends Gui {
	private Minecraft mc;

	private static final ResourceLocation texturepath = new ResourceLocation(TheDarkEra.MODID + ":textures/gui/SoulBar.png");

	public GuiManaBar(Minecraft mc) {
		super();
		this.mc = mc;
	}

	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void onRenderExperienceBar(RenderGameOverlayEvent event) {

		if (event.isCancelable() || event.type != ElementType.EXPERIENCE) {
			return;
		}
		if (!mc.thePlayer.capabilities.isCreativeMode) {
			int posX = event.resolution.getScaledWidth() / 2 + 10;
			int posY = event.resolution.getScaledHeight() - 48;
			ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer) Minecraft.getMinecraft().thePlayer);
			float maxMana = props.getMaxMana();
			int manabarwidth = (int) ((float) props.getMana() / maxMana * 48);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			GL11.glDisable(GL11.GL_LIGHTING);
			this.mc.getTextureManager().bindTexture(texturepath);
			mc.renderEngine.bindTexture(new ResourceLocation(TheDarkEra.MODID + ":textures/gui/SoulBar.png"));
			mc.ingameGUI.drawTexturedModalRect(posX, posY, 0, 0, 50, 5);
			mc.ingameGUI.drawTexturedModalRect(posX + 1, posY + 1, 0, 6, manabarwidth, 3);
			String a = ""+props.getMaxMana();
			String b = ""+props.getMana();
			mc.fontRenderer.drawStringWithShadow(a, posX, posY, 0xFFFFFF);
			mc.fontRenderer.drawStringWithShadow(b, posX, posY+8, 0xFFFFFF);
			System.out.println(maxMana);
		}
	}
}