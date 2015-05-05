package com.thedarkera.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.thedarkera.TheDarkEra.GuiID;
import com.thedarkera.gui.GuiSmasher;

import cpw.mods.fml.common.network.IGuiHandler;

	public class GuiHandler implements IGuiHandler {

	    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	        return null;
	    }

	    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	        if(ID == GuiID.SMASHER.ordinal()) return new GuiSmasher(player, world, x, y, z);
	        else return null;
	    }
	}	    