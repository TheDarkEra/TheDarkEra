package com.thedarkera.packet;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import com.thedarkera.init.TDEBlocks;

public class getManaPacket extends AbstractPacket {

	private int mana;

	public getManaPacket() {
	}

	public getManaPacket(int mana) {
		this.mana = mana;
	}

	public void encodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
		buffer.writeByte(mana);
	}

	public void decodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
		mana = buffer.readByte();
	}

	public void handleClientSide(EntityPlayer player) {
	}

	public void handleServerSide(EntityPlayer player) {
		World world = Minecraft.getMinecraft().theWorld;
		int x = Minecraft.getMinecraft().objectMouseOver.blockX;
		int y = Minecraft.getMinecraft().objectMouseOver.blockY;
		int z = Minecraft.getMinecraft().objectMouseOver.blockZ;
		if (!(world.getBlock(x, y, z) == Blocks.air)){
		world.setBlock(x, y, z, TDEBlocks.ancient_ore);
		System.out.println(x + y + z);
		}
	}
}
