package com.darkteam.thedarkera.handlers;

import com.darkteam.thedarkera.blocks.BlockSmasherTE.GUIs;
import com.darkteam.thedarkera.guis.GuiSmasher;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID == GUIs.SMASHER.ordinal()) return new GuiSmasher(player, world, x, y, z);
        else return null;
    }
}