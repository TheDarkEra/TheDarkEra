package com.thedarkera.packet.packets;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

import com.thedarkera.packet.AbstractPacket;
import com.thedarkera.ztesting.ExtendedPlayer;

import cpw.mods.fml.common.network.ByteBufUtils;

public class PacketSyncMana extends AbstractPacket {
	// Previously, we've been writing each field in our properties one at a
	// time,
	// but that is really annoying, and we've already done it in the save and
	// load
	// NBT methods anyway, so here's a slick way to efficiently send all of your
	// extended data, and no matter how much you add or remove, you'll never
	// have
	// to change the packet / synchronization of your data.

	// this will store our ExtendedPlayer data, allowing us to easily read and
	// write
	private NBTTagCompound data;

	// The basic, no-argument constructor MUST be included to use the new
	// automated handling
	public PacketSyncMana() {
	}

	// We need to initialize our data, so provide a suitable constructor:
	public PacketSyncMana(EntityPlayer player) {
		// create a new tag compound
		data = new NBTTagCompound();
		// and save our player's data into it
//		ExtendedPlayer.get(player).saveNBTData(data);
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
		// ByteBufUtils provides a convenient method for writing the compound
		ByteBufUtils.writeTag(buffer, data);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
		// luckily, ByteBufUtils provides an easy way to read the NBT
		data = ByteBufUtils.readTag(buffer);
	}

	@Override
	public void handleClientSide(EntityPlayer player) {
		// now we can just load the NBTTagCompound data directly; one and done,
		// folks
//		ExtendedPlayer.get(player).loadNBTData(data);
	}

	@Override
	public void handleServerSide(EntityPlayer player) {
		// we never send this packet to the server, so do nothing here
	}
}