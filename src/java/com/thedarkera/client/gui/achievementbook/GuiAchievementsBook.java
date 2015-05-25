package com.thedarkera.client.gui.achievementbook;

import com.thedarkera.TheDarkEra;
import com.thedarkera.handler.AchievementHandler;
import com.thedarkera.utils.Achievement;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
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
    private int maxPages;
    private PageButton bButton;
    private PageButton nButton;
    //private GuiAchievement test;
    private List<GuiAchievement> achievementList = new ArrayList<>();
    private EntityPlayer player;

    public GuiAchievementsBook(EntityPlayer player){
        this.player = player;
    }

    @Override
    public void initGui() {
        currentPage = 0;
        maxPages = achievements.getPagesNeeded();
        //maxPages = 6;
        x = (width - guiWidth) / 2;
        y = (height - guiHeight) / 2;
        AchievementHandler.checkNBT(player);

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
            //if(Math.floor(k) % 2 == 0) ;
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

        for (int k = 0; k < this.achievementList.size(); ++k)
        {
            (this.achievementList.get(k)).drawButton(this.mc, mouseX, mouseY);
            if(k >= 16) (this.achievementList.get(k)).visible = false;
        }

        for(int i = 0; i < achievementList.size(); i ++){
            GuiAchievement button = this.achievementList.get(i);
            if(button.func_146115_a() && button.visible){
                this.drawCreativeTabHoveringText(button.description, mouseX, mouseY);
            }
        }
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        if(button.enabled){

            if (button.id == 1) currentPage -= maxPages;
            if (button.id == 2) currentPage += 2;
            //if(button.id == 2) achievements.setAchieved(TDEAchievements.test);

            updateContent(button);
        }
    }

    void updateContent(GuiButton button) {
        if (maxPages % 2 == 1) {
            if (currentPage > maxPages) currentPage = maxPages;
        } else {
            if (currentPage >= maxPages) currentPage = maxPages - 2;
        }
        if (currentPage % 2 == 1) currentPage--;
        if (currentPage < 0) currentPage = 0;

        //everything under here may or may not work correctly!
        int k = (int)Math.floor(achievementList.size() / 8D);
        if(k <= maxPages){
            for(int i = 0; i < (k*8) + 15; i++) {
                if (i < achievementList.size()){
                    GuiAchievement achievement = this.achievementList.get(i);
                    if (button.id == 2 && i >= (k * 16)) achievement.visible = true;
                    if (button.id == 1 && i < (k * 16)) achievement.visible = true;
                    else achievement.visible = false;
                }
            }
        }
    }
}
