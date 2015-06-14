package com.thedarkera.ingameobjects.item.food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.thedarkera.TheDarkEra;

public class ItemBowlOJelly extends ItemFood { //Items

	public ItemBowlOJelly(String name) {
		super(4, 0.4f, false);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDEItems);
		setAlwaysEdible();
	}

	@Override
	public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player) {
		--stack.stackSize;
		player.getFoodStats().func_151686_a(this, stack);
		world.playSoundAtEntity(player, "random.burp", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
		this.onFoodEaten(stack, world, player);
		return new ItemStack(Items.bowl);
	}

}
