package com.thedarkera.ingameobjects.item.tool;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import com.thedarkera.api.items.ItemTDEBase;
import com.thedarkera.init.TDEBlocks;

public class ItemBoneAndSteel extends ItemTDEBase {

	public ItemBoneAndSteel(String name) {
		super(name);
		this.setMaxStackSize(1);
		this.setMaxDamage(35);
	}

	public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side, float par8, float par9, float par10) {
		switch (side) {
		case 0: {
			y--;
			break;
		}
		case 1: {
			y++;
			break;
		}
		case 2: {
			z--;
			break;
		}
		case 3: {
			z++;
			break;
		}
		case 4: {
			x--;
			break;
		}
		case 5: {
			x++;
			break;
		}
		}

		if (!player.canPlayerEdit(x, y, z, side, itemStack)) {
			return false;
		} else {
			if (world.isAirBlock(x, y, z)) {
				world.playSoundEffect((double) x + 0.5D, (double) y + 0.5D, (double) z + 0.5D, "fire.ignite", 1F, itemRand.nextFloat() * 0.4F + 0.8F);
				world.setBlock(x, y, z, TDEBlocks.dark_fire);
			}

			itemStack.damageItem(1, player);
			return true;
		}
	}

}
