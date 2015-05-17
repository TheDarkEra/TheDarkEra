package com.thedarkera.packet.packets;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.World;

import com.thedarkera.ingameobjects.potioneffects.PotionEffectDarkness;
import com.thedarkera.init.TDEBlocks;
import com.thedarkera.init.TDEPotionEffects;
import com.thedarkera.packet.AbstractPacket;
import com.thedarkera.shouts.ShoutList;
import com.thedarkera.shouts.UseShout;

import cpw.mods.fml.common.FMLCommonHandler;

public class PacketGetMana extends AbstractPacket {

	private int mana, x, y, z;

	public PacketGetMana() {
	}

	public PacketGetMana(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void encodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
		buffer.writeByte(this.mana);
		buffer.writeInt(x);
		buffer.writeInt(y);
		buffer.writeInt(z);
		System.out.println(" encoded x: " + x + " encoded y: " + y + " encoded z: " + z + " encoded mana: " + mana);

	}

	public void decodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
		this.mana = buffer.readByte();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
		System.out.println(" decoded x: " + x + " decoded y: " + y + " decoded z: " + z + " encoded mana: " + mana);
	}

	public void handleClientSide(EntityPlayer player) {
	}


	public void handleServerSide(EntityPlayer player) {
		int XPlayer = (int) player.posX;
		int YPlayer = (int) player.posY;
		int ZPlayer = (int) player.posZ;
		int shout = ShoutList.getShout();
		UseShout.Shout(10, XPlayer, YPlayer, ZPlayer);
	}
}
