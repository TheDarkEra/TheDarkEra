package com.thedarkera.client.gui.achievementbook;

import com.thedarkera.TheDarkEra;
import com.thedarkera.handler.AchievementHandler;
import com.thedarkera.utils.Achievement;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

public class GuiAchievementsBook extends GuiScreen {

    private ResourceLocation texture = new ResourceLocation(TheDarkEra.MODID.toLowerCase(), "textures/gui/achievement_book.png");

    private AchievementHandler achievements = new AchievementHandler();

    private int guiWidth = 256;
    private int guiHeight = 180;
    private int x;
    private int y;
    private int currentPage;
    private int oldPage;
    private int maxPages;
    private PageButton bButton;
    private PageButton nButton;
    //private GuiAchievement test;
    private List<GuiAchievement> achievementList = new ArrayList<>();

    @Override
    public void initGui() {
        currentPage = 0;
        oldPage = 0;
        maxPages = achievements.getPagesNeeded()-2;
        //maxPages = 6;
        x = (width - guiWidth) / 2;
        y = (height - guiHeight) / 2;

        bButton = new PageButton(1, x + 20, y + guiHeight - 20, false);
        nButton = new PageButton(2, x + guiWidth - 36, y + guiHeight - 20, true);
        //test = new GuiAchievement(3, x + 15, y + 20, "Master GUI's", true);
        this.buttonList.add(bButton);
        this.buttonList.add(nButton);
        for(int i = 0; i < AchievementHandler.getAmount(); i++){
            int id = i + 3;
            int xx = 15;
            int j = i;
            Achievement achievement = AchievementHandler.get(AchievementHandler.achievementNames.get(i));

            double k = (i / 8D);
            if(Math.floor(k) % 2 == 0 && i >= 16)
                j = i - 8 * (int)Math.floor(k);
            if(Math.floor(k) % 2 == 1) {
                xx = (guiWidth / 2) + 15;
                j = i - 8 * (int)Math.floor(k);
            }
            int yy = 10 + j * 20;

            this.achievementList.add(new GuiAchievement(id, x + xx, y + yy, achievement));
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.mc.getTextureManager().bindTexture(texture);

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

        this.drawTexturedModalRect(x, y, 0, 0, guiWidth, guiHeight);

        super.drawScreen(mouseX, mouseY, partialTicks);

        for (int i = 0; i < achievementList.size(); ++i)
        {
            (this.achievementList.get(i)).drawButton(this.mc, mouseX, mouseY);
            if(i >= 16 && currentPage == 0)
                (this.achievementList.get(i)).visible = false;
        }

        for(int i = 0; i < achievementList.size(); i ++){
            GuiAchievement button = this.achievementList.get(i);
            if(button.func_146115_a() && button.visible){
                this.func_146283_a(button.description, mouseX, mouseY);
            }
        }
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        if(button.enabled){

            if (button.id == 1 && currentPage != 0) currentPage -= 2;
            if (button.id == 2 && currentPage != maxPages) currentPage += 2;
            //if(button.id == 2) achievements.setAchieved(TDEAchievements.test);

            updateContent(button);
        }
    }

    void updateContent(GuiButton button) {
        if (maxPages % 2 == 1){
            if (currentPage > maxPages)
                currentPage = maxPages;
        }
        else{
            if (currentPage > maxPages)
                currentPage = maxPages;
        }
        if (currentPage % 2 == 1)
            currentPage--;
        if (currentPage < 0)
            currentPage = 0;

        //everything under here may or may not work correctly!
        int j = (int)Math.floor(achievementList.size() / 16D);
        if(currentPage != oldPage){
            for(int i = 0; i < (maxPages*16); i++) {
                int k = (int)Math.floor(i / 16D);
                if (i < 8 * currentPage) k += currentPage / 2;
                if (currentPage == 0) k += 1;
                if (i < achievementList.size()){
                    GuiAchievement achievement = this.achievementList.get(i);
                    if (button.id == 2 && i >= (k * 16))
                            achievement.visible = true;
                    else if (button.id == 1 && i < (k * 16))
                        achievement.visible = true;
                    else achievement.visible = false;
                }
            }
        }
        oldPage = currentPage;
    }
}
