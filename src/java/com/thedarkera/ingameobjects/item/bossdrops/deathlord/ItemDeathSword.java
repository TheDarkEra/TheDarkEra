package com.thedarkera.ingameobjects.item.bossdrops.deathlord;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import com.thedarkera.TheDarkEra;
import com.thedarkera.ingameobjects.item.bossdrops.ItemBossSword;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDeathSword extends ItemBossSword {
	
	public ItemDeathSword(ToolMaterial material, String name) {
		super(material);
		setUnlocalizedName(name);
		setTextureName(TheDarkEra.MODID + ":" + name);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) {
		tooltip.add("");
		tooltip.add("Attack Damage:" + EnumChatFormatting.DARK_RED + " Enough...");
		tooltip.add("Obtained by killing the Boss: " + EnumChatFormatting.DARK_BLUE + "Death Lord");
	} 

}
