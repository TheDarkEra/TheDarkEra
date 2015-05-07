package com.thedarkera.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import com.thedarkera.TheDarkEra;
import com.thedarkera.inventory.ContainerSmeltery;
import com.thedarkera.tileentity.TESmeltery;

public class GuiSmeltery extends GuiContainer {
	private ResourceLocation texture = new ResourceLocation(TheDarkEra.MODID.toLowerCase(), "textures/gui/container/smeltery.png");

	private InventoryPlayer inventory;
	private TESmeltery te;

	public GuiSmeltery(TESmeltery te, EntityPlayer player) {
		super(new ContainerSmeltery(te, player));
		inventory = player.inventory;
		this.te = te;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float par1, int par2,
			int par3) {
		Minecraft.getMinecraft().renderEngine.bindTexture(texture);

		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

		int x = (width - xSize) / 2;
		int y = (height - ySize) / 2;

		drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
		
		if (te.isBurning()) {
			int scaled = te.getBurnTimeRemainingScaled(13);
			drawTexturedModalRect(x + 56, y + 36 + 12 - scaled, 176, 12 - scaled, 14, scaled + 1);
			scaled = te.getCookProgressScaled(13);
			drawTexturedModalRect(x + 79, y + 34, 176, 14, scaled + 1, 16);
		}
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int par1, int par2) {
		fontRendererObj.drawString(I18n.format(te.getInventoryName()), (xSize / 2) - (fontRendererObj.getStringWidth(I18n.format(te.getInventoryName())) / 2), 6, 2500134, false);
		fontRendererObj.drawString(I18n.format(inventory.getInventoryName()), 8, ySize - 96 + 2, 2500134);
	}
}
