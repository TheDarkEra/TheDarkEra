package com.thedarkera.ingameobjects.item;

import com.thedarkera.client.gui.achievementbook.GuiAchievementsBook;
import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.thedarkera.TheDarkEra;
import com.thedarkera.TheDarkEra.GuiID;
import net.minecraft.world.World;

public class ItemAchievementBook extends Item {

	private String name = "achievement_book";

	public ItemAchievementBook() {
		super();
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
		setFull3D();
		setMaxStackSize(1);
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}
	
	/* TODO: onItemRightClick openGui
	 */

    @Override
    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {

        player.openGui(TheDarkEra.instance, GuiID.ACHIEVEMENTBOOK.ordinal(), world, (int)player.posX, (int)player.posY, (int)player.posZ);
        FMLClientHandler.instance().displayGuiScreen(player, new GuiAchievementsBook());

        return item;
    }
}
