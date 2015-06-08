package com.thedarkera.ztesting;

import net.minecraft.entity.DataWatcher;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

import com.thedarkera.TheDarkEra;

public class ExtendedPlayer implements IExtendedEntityProperties {

	public static final String identifier = TheDarkEra.MODID + "_properties";

	private final EntityPlayer player;
	
	public final int DataWatcher = 30;

	private static int mana, maxMana = 100;

	public ExtendedPlayer(EntityPlayer player) {
		this.player = player;
		DataWatcher dw = player.getDataWatcher();
		dw.addObject(DataWatcher, ExtendedPlayer.maxMana);
	}

	@Override
	public void saveNBTData(NBTTagCompound compound) {
		compound.setInteger("mana", mana);
		compound.setInteger("maxMana", player.getDataWatcher().getWatchableObjectInt(DataWatcher));
	}

	@Override
	public void loadNBTData(NBTTagCompound compound) {
		mana = compound.getInteger("mana");
		player.getDataWatcher().updateObject(DataWatcher, compound.getInteger("maxMana"));
	}

	@Override
	public void init(Entity entity, World world) {
		mana = 20;
	}

	public static final ExtendedPlayer get(EntityPlayer player) {
		return (ExtendedPlayer) player.getExtendedProperties(identifier);
	}

	public void Sync() {

	}

	public int getMaxMana() {
		return player.getDataWatcher().getWatchableObjectInt(DataWatcher);
	}

	public void setMaxMana(int maxManaa) {
		player.getDataWatcher().updateObject(DataWatcher, maxManaa);
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		ExtendedPlayer.mana = mana;
	}

	public void addMana(int i) {
		if (mana + i >= player.getDataWatcher().getWatchableObjectInt(DataWatcher)) {
			ExtendedPlayer.mana = player.getDataWatcher().getWatchableObjectInt(DataWatcher);
		} else {
			ExtendedPlayer.mana = ExtendedPlayer.mana + i;
		}
	}

	public void useMana(int i) {
		if (!(mana - i <= 0)) {
			ExtendedPlayer.mana = ExtendedPlayer.mana - i;
		}
	}
}
