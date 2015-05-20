package com.thedarkera.ztesting;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class ExtendedPlayer implements IExtendedEntityProperties {

	public final static String EXT_PROP_NAME = "ExtendedPlayerTDE";

	private final EntityPlayer player;

	private int currentMana, maxMana;

	public ExtendedPlayer(EntityPlayer player) {
		this.player = player;
		this.currentMana = this.maxMana = 50;
	}

	public int getCurrentMana() {
		return this.currentMana;
	}

	public int getMaxMana() {
		return this.maxMana;
	}

	public static final void register(EntityPlayer player) {
		player.registerExtendedProperties(ExtendedPlayer.EXT_PROP_NAME, new ExtendedPlayer(player));
	}

	public static final ExtendedPlayer get(EntityPlayer player) {
		return (ExtendedPlayer) player.getExtendedProperties(EXT_PROP_NAME);
	}

	@Override
	public void saveNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = new NBTTagCompound();

		properties.setInteger("CurrentMana", this.currentMana);
		properties.setInteger("MaxMana", this.maxMana);
		compound.setTag(EXT_PROP_NAME, properties);

	}

	@Override
	public void loadNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_PROP_NAME);
		this.currentMana = properties.getInteger("CurrentMana");
		this.maxMana = properties.getInteger("MaxMana");
		System.out.println("[TUT PROPS] Mana from NBT: " + this.currentMana + "/" + this.maxMana);
	}

	@Override
	public void init(Entity entity, World world) {
	}

	public boolean consumeMana(int amount) {
		boolean sufficient = amount <= this.currentMana;
		this.currentMana -= (amount < this.currentMana ? amount : this.currentMana);
		return sufficient;
	}

	public void replenishMana() {
		this.currentMana = this.maxMana;
	}
}
