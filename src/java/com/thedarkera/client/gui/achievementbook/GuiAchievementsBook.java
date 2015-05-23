package com.thedarkera.client.gui.achievementbook;

import com.thedarkera.TheDarkEra;
import com.thedarkera.handler.AchievementHandler;
import com.thedarkera.init.TDEAchievements;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class GuiAchievementsBook extends GuiScreen {

    private ResourceLocation texture = new ResourceLocation(TheDarkEra.MODID.toLowerCase(), "textures/gui/achievement_book.png");

    private AchievementHandler achievements = new AchievementHandler();

    private int guiWidth = 256;
    private int guiHeight = 180;
    private int x;
    private int y;
    private int currentPage;
    private int maxPages;
    private PageButton bButton;
    private PageButton nButton;
    private GuiAchievement test;

    @Override
    public void initGui() {
        currentPage = 0;
        maxPages = achievements.getPagesNeeded();
        x = (width - guiWidth) / 2;
        y = (height - guiHeight) / 2;

        bButton = new PageButton(1, x + 20, y + guiHeight - 20, false);
        nButton = new PageButton(2, x + guiWidth - 36, y + guiHeight - 20, true);
        test = new GuiAchievement(3, x + 15, y + 20, "Master GUI's", true);
        this.buttonList.add(bButton);
        this.buttonList.add(nButton);
        this.buttonList.add(test);
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.mc.getTextureManager().bindTexture(texture);

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

        this.drawTexturedModalRect(x, y, 0, 0, guiWidth, guiHeight);

        super.drawScreen(mouseX, mouseY, partialTicks);

        if(test.func_146115_a()){
            this.drawCreativeTabHoveringText("A description", mouseX, mouseY);
        }
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        if(button.enabled){

            if (button.id == 1) currentPage -= maxPages;
            if (button.id == 2) currentPage += 2;
            //if(button.id == 2) achievements.setAchieved(TDEAchievements.test);

            updateContent();
        }
    }

    void updateContent() {
        if (maxPages % 2 == 1) {
            if (currentPage > maxPages) currentPage = maxPages;
        } else {
            if (currentPage >= maxPages) currentPage = maxPages - 2;
        }
        if (currentPage % 2 == 1) currentPage--;
        if (currentPage < 0) currentPage = 0;


    }
}