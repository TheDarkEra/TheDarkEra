package com.thedarkera.packet.packets;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;

import com.thedarkera.packet.AbstractPacket;
import com.thedarkera.shouts.ShoutList;
import com.thedarkera.shouts.UseShout;

public class PacketUseShoutOnBlock extends AbstractPacket {

	private int mana, x, y, z, px, py, pz;

	public PacketUseShoutOnBlock() {
	}

	public PacketUseShoutOnBlock(int x, int y, int z, int px, int py, int pz) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void encodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
		buffer.writeByte(this.mana);
		buffer.writeInt(x);
		buffer.writeInt(y);
		buffer.writeInt(z);
		buffer.writeInt(px);
		buffer.writeInt(py);
		buffer.writeInt(pz);
		System.out.println(" encoded x: " + x + " encoded y: " + y + " encoded z: " + z + " encoded mana: " + mana);

	}

	public void decodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
		this.mana = buffer.readByte();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
		this.px = buffer.readInt();
		this.py = buffer.readInt();
		this.pz = buffer.readInt();
		System.out.println(" decoded x: " + x + " decoded y: " + y + " decoded z: " + z + " encoded mana: " + mana);
	}

	public void handleClientSide(EntityPlayer player) {
	}


	public void handleServerSide(EntityPlayer player) {
		int XPlayer = (int) player.posX;
		int YPlayer = (int) player.posY;
		int ZPlayer = (int) player.posZ;
		int shout = ShoutList.getShout();
		UseShout.Shout(10, player, XPlayer, YPlayer, ZPlayer, px, py, pz);
	}

	private boolean isMovable(TileEntity te) {
		if (te instanceof TileEntity) {
			return false;
		}
		return true;
	}
}
