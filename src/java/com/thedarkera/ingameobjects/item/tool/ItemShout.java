package com.thedarkera.ingameobjects.item.tool;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.thedarkera.TheDarkEra;
import com.thedarkera.shouts.UseShout;

public class ItemShout extends Item {
	public ItemShout() {
		super();
		setCreativeTab(TheDarkEra.tabTDEItems);
		setTextureName(TheDarkEra.MODID + ":");
	}

	public boolean onItemUse(ItemStack Item, EntityPlayer player, World world, int x, int y, int z, int side, float px, float py, float pz) {
//		UseShout.Shout(10, x, y, z, player);
		return true;
	}

}
