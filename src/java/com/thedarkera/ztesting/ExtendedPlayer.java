package com.thedarkera.ztesting;

import com.thedarkera.TheDarkEra;
import com.thedarkera.packet.packets.PacketGetMana;
import com.thedarkera.packet.packets.PacketSyncMana;
import com.thedarkera.proxy.CommonProxy;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class ExtendedPlayer implements IExtendedEntityProperties {

	public final static String EXT_PROP_NAME = "ExtendedPlayerTDE";
	public static final int MANA_WATCHER = 21;
	private final EntityPlayer player;

	private int currentMana, maxMana, manaRegenTimer;

	public ExtendedPlayer(EntityPlayer player) {
		this.player = player;
		this.maxMana = 50;

		this.player.getDataWatcher().addObject(MANA_WATCHER, this.maxMana);
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

	private static final String getSaveKey(EntityPlayer player) {
		return player.getCommandSenderName() + ":" + EXT_PROP_NAME;
	}

	public static final void loadProxyData(EntityPlayer player) {
		ExtendedPlayer playerData = ExtendedPlayer.get(player);
		NBTTagCompound savedData = CommonProxy.getEntityData(getSaveKey(player));
		if (savedData != null) {
			playerData.loadNBTData(savedData);
		}
		// we are replacing the entire sync() method with a single line; more on
		// packets later
		// data can by synced just by sending the appropriate packet, as
		// everything is handled internally by the packet class
		TheDarkEra.packetPipeline.sendToServer(new PacketSyncMana(player));
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
		int mana = this.player.getDataWatcher().getWatchableObjectInt(MANA_WATCHER);
		boolean sufficient = amount <= mana;
		mana -= (amount < mana ? amount : mana);
		this.player.getDataWatcher().updateObject(MANA_WATCHER, mana);
		return sufficient;
	}

	public final void replenishMana() {
		this.player.getDataWatcher().updateObject(MANA_WATCHER, this.maxMana);
	}

	public final int getCurrentMana() {
		return this.player.getDataWatcher().getWatchableObjectInt(MANA_WATCHER);
	}

	public final void addMana(int amount) {
		if (amount + this.currentMana >= this.maxMana) {
			int i = this.currentMana;
			this.player.getDataWatcher().updateObject(MANA_WATCHER, (i));
		}

	}

	public void setMaxMana(int amount) {
		this.maxMana = (amount > 0 ? amount : 0);
	}

	public void copy(ExtendedPlayer props) {
		this.player.getDataWatcher().updateObject(MANA_WATCHER, props.getCurrentMana());
		this.maxMana = props.maxMana;
		this.manaRegenTimer = props.manaRegenTimer;
	}
}
