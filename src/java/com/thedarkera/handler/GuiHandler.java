package com.thedarkera.handler;

import com.thedarkera.TheDarkEra.GUIs;
import com.thedarkera.gui.GuiWorkBench;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID == GUIs.WORKBENCH.ordinal()) return new GuiWorkBench(player, world, x, y, z);
        else return null;
    }
}