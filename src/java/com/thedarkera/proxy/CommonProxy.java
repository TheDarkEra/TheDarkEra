package com.thedarkera.proxy;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

import com.thedarkera.TheDarkEra;
import com.thedarkera.handler.GuiHandler;
import com.thedarkera.ingameobjects.tileentity.TEDragonBone;
import com.thedarkera.ingameobjects.tileentity.TESmasher;
import com.thedarkera.ingameobjects.tileentity.TESmeltery;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
	private static final Map<String, NBTTagCompound> extendedEntityData = new HashMap<String, NBTTagCompound>();

	public void init() {}

	public void registerRenderers() {

	}

	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TESmasher.class, TESmasher.name);
		GameRegistry.registerTileEntity(TESmeltery.class, "smeltery");
		GameRegistry.registerTileEntity(TEDragonBone.class, "dragon_bone");
	}

	public void registerGuiHandler() {
		NetworkRegistry.INSTANCE.registerGuiHandler(TheDarkEra.instance, new GuiHandler());
	}

	public void registerProxies() {}

	public static void storeEntityData(String name, NBTTagCompound compound) {
		extendedEntityData.put(name, compound);
	}

	/**
	 * Removes the compound from the map and returns the NBT tag stored for name
	 * or null if none exists
	 */
	public static NBTTagCompound getEntityData(String name) {
		return extendedEntityData.remove(name);
	}

	public ModelBiped getArmorModel(int id) {
		return null;
	}

	public int addArmor(String armorName) {
		return 0;
	}

	public EntityPlayer findPlayer(String playerName) {
		return null;
	}

}