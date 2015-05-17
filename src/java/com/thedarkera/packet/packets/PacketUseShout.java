package com.thedarkera.packet.packets;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

import com.thedarkera.packet.AbstractPacket;
import com.thedarkera.shouts.ShoutList;
import com.thedarkera.shouts.UseShout;

public class PacketUseShout extends AbstractPacket {

	public PacketUseShout() {
	}

	public PacketUseShout(int x, int y, int z) {

	}

	public void encodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {


	}

	public void decodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {

	}

	public void handleClientSide(EntityPlayer player) {
//		int XPlayer = (int) player.posX;
//		int YPlayer = (int) player.posY;
//		int ZPlayer = (int) player.posZ;
//		int shout = ShoutList.getShout();
//		player.addChatComponentMessage(new ChatComponentText("Shout!"));
//		UseShout.Shout(10, XPlayer, YPlayer, ZPlayer, player);
	}


	public void handleServerSide(EntityPlayer player) {
		int XPlayer = (int) player.posX;
		int YPlayer = (int) player.posY;
		int ZPlayer = (int) player.posZ;
		int shout = ShoutList.getShout();
		player.addChatComponentMessage(new ChatComponentText("Shout!"));
		UseShout.Shout(10, XPlayer, YPlayer, ZPlayer, player);
	}
}