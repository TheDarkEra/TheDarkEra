package com.thedarkera.packet.packets;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

import com.thedarkera.packet.AbstractPacket;
import com.thedarkera.ztesting.ExtendedPlayer;

import cpw.mods.fml.common.network.ByteBufUtils;

public class PacketSyncMana extends AbstractPacket {

	private NBTTagCompound data;


	public PacketSyncMana() {
	}

	public PacketSyncMana(EntityPlayer player) {

	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {

	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
	}

	@Override
	public void handleClientSide(EntityPlayer player) {
	}

	@Override
	public void handleServerSide(EntityPlayer player) {
		// we never send this packet to the server, so do nothing here
	}
}