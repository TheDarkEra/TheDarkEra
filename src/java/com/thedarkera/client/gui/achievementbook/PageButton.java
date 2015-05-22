package com.thedarkera.client.gui.achievementbook;

import com.thedarkera.TheDarkEra;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class PageButton extends GuiButton{

    private ResourceLocation texture = new ResourceLocation(TheDarkEra.MODID.toLowerCase(), "textures/gui/achievement_book.png");
    private final boolean nextPage;

    public PageButton(int id, int x, int y, boolean nextPage) {
        super(id, x, y, 16, 11,"");
        this.nextPage = nextPage;
    }

    @Override
    public void drawButton(Minecraft mc, int mouseX, int mouseY){
        if (this.visible)
        {
            boolean var4 = mouseX >= this.xPosition && mouseY >= this.yPosition && mouseX < this.xPosition + this.width && mouseY < this.yPosition + this.height;
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            mc.getTextureManager().bindTexture(texture);
            int var5 = 7;
            int var6 = 187;

            if (var4)
            {
                var5 += 16;
            }

            if (this.nextPage)
            {
                var6 += 11;
            }

            this.drawTexturedModalRect(this.xPosition, this.yPosition, var5, var6, 16, 11);
        }
    }


}
