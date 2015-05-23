package com.thedarkera.client.gui.achievementbook;

import com.thedarkera.TheDarkEra;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiAchievement extends GuiButton{

    private ResourceLocation texture = new ResourceLocation(TheDarkEra.MODID.toLowerCase(), "textures/gui/achievement_book.png");

    private boolean isAchieved;
    private int boxWidth;

    public GuiAchievement(int id, int x, int y, String displayString,boolean isAchieved){
        super(id, x, y,displayString);
        this.isAchieved = isAchieved;
        this.boxWidth = 10;
        this.height = 12;
        this.width = boxWidth + 2 + Minecraft.getMinecraft().fontRenderer.getStringWidth(displayString);
    }

    @Override
    public void drawButton(Minecraft mc, int mouseX, int mouseY) {
        if (this.visible)
        {
            this.field_146123_n = mouseX >= this.xPosition && mouseY >= this.yPosition && mouseX < this.xPosition + this.width && mouseY < this.yPosition + this.height;
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            mc.getTextureManager().bindTexture(texture);
            int y = 221;

            if(isAchieved){
                y = 209;
            }

            this.drawTexturedModalRect(this.xPosition, this.yPosition, 7, y, width, height);
            mc.fontRenderer.drawString(displayString, xPosition + boxWidth + 2, yPosition + 4, 3355443);
        }
    }


}