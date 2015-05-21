package com.thedarkera.ztesting;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

import com.thedarkera.TheDarkEra;

public class ExtendedPlayer implements IExtendedEntityProperties {

	public static final String identifier = TheDarkEra.MODID + "_properties";

	private final EntityPlayer player;

	private int mana, maxMana;

	public ExtendedPlayer(EntityPlayer player) {
		this.player = player;
		this.setMaxMana(100);

	}

	@Override
	public void saveNBTData(NBTTagCompound compound) {
		compound.setInteger("mana", mana);
	}

	@Override
	public void loadNBTData(NBTTagCompound compound) {
		mana = compound.getInteger("mana");
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
		return maxMana;
	}

	public void setMaxMana(int maxMana) {
		this.maxMana = maxMana;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public void addMana(int i) {
		if (mana + i >= this.maxMana) {
			this.mana = this.maxMana;
		} else {
			this.mana = this.mana + i;
		}
	}

	public void useMana(int i) {
		if (!(mana - i <= 0)) {
			this.mana = this.mana - i;
		}
	}
}
