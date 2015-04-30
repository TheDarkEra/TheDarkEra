package com.thedarkera.gui;

import com.thedarkera.TheDarkEra.GUIs;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{

	@Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }
 
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
    	if(ID == GUIs.WORKBENCH.ordinal()) return new GuiWorkBench(player, world, x, y, z);
        else return null;
    }

}
