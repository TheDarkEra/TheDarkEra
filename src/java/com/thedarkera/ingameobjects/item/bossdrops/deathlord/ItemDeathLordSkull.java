package com.thedarkera.ingameobjects.item.bossdrops.deathlord;

import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import com.thedarkera.TheDarkEra;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDeathLordSkull extends Item {
	
	public ItemDeathLordSkull(String name){
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
		setCreativeTab(TheDarkEra.tabTDE);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) {
		tooltip.add("");
		tooltip.add("The Death Lord's Skull!");
		tooltip.add(EnumChatFormatting.DARK_RED + "A hero's trophy.");
		tooltip.add("Obtained by killing the Boss: " + EnumChatFormatting.DARK_BLUE + "Death Lord");
	}
	
	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}

}
