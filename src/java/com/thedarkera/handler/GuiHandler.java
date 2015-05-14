package com.thedarkera.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.thedarkera.TheDarkEra.GuiID;
import com.thedarkera.client.gui.GuiSmeltery;
import com.thedarkera.ingameobjects.tileentity.TESmeltery;
import com.thedarkera.inventory.ContainerSmeltery;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity te = world.getTileEntity(x, y, z);

		if (te != null) {
			if (ID == GuiID.SMELTERY.ordinal()) {
				return new ContainerSmeltery((TESmeltery) te, player);
			}
		}
		return null;
	}

	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity te = world.getTileEntity(x, y, z);

		if (te != null) {
			// if (ID == GuiID.SMASHER.ordinal())
			// {
			// return new GuiSmasher(player, world, x, y, z);
			// }
			if (ID == GuiID.SMELTERY.ordinal()) {
				return new GuiSmeltery((TESmeltery) te, player);
			}
		}
		return null;
	}
}