package com.thedarkera.packet.packets;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;

import com.thedarkera.packet.AbstractPacket;
import com.thedarkera.ztesting.ExtendedPlayer;

public class PacketGetMana extends AbstractPacket {

	private int maxMana;

	public PacketGetMana() {
	}

	public PacketGetMana(int maxManaa) {
		this.maxMana = maxManaa;
	}

	public void encodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
		buffer.writeInt(this.maxMana);
		//System.out.println("encoded maxMana: " + maxMana);

	}

	public void decodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
		this.maxMana = buffer.readInt();
		//System.out.println("dencoded maxMana: " + maxMana);
	}

	public void handleClientSide(EntityPlayer player) {
//		ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer) player);
//		System.out.println(player.getCommandSenderName());
//		props.setMaxMana(maxMana);
	}

	public void handleServerSide(EntityPlayer player) {

		ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer) player);
		//System.out.println(player.getCommandSenderName());
		props.setMaxMana(maxMana);
	}

}
