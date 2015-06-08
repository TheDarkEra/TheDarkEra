package com.thedarkera.ingameobjects.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.thedarkera.TheDarkEra;
import com.thedarkera.TheDarkEra.GuiID;
import com.thedarkera.api.items.ItemTDEBase;

public class ItemAchievementBook extends ItemTDEBase {

	public ItemAchievementBook(String name) {
		super(name);
		setFull3D();
		setMaxStackSize(1);
	}

    @Deprecated
	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}

    @Override
    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
            player.openGui(TheDarkEra.instance, GuiID.ACHIEVEMENTBOOK.ordinal(), world, (int) player.posX, (int) player.posY, (int) player.posZ);

        return item;
    }
}
