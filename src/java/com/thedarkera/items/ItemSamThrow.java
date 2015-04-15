package com.darkteam.thedarkera.items;



import com.darkteam.thedarkera.Main;
import com.darkteam.thedarkera.entity.EntitySamThrowable;
import com.darkteam.thedarkera.tabs.ModTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSamThrow extends Item 
{
	public ItemSamThrow(String name) 
	{
		setCreativeTab(CreativeTabs.tabBlock);
		setUnlocalizedName(Main.MODID + "_" + name);
		setTextureName(Main.MODID + ":" + name);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
            --par1ItemStack.stackSize;
        }

        if (!par2World.isRemote)
        {
            par2World.spawnEntityInWorld(new EntitySamThrowable(par2World, par3EntityPlayer));
        }

        return par1ItemStack;
    }
}