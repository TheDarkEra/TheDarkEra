package com.thedarkera.packet;

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

import cpw.mods.fml.common.FMLCommonHandler;

public class getManaPacket extends AbstractPacket {

	private int mana, x, y, z;

	public getManaPacket() {
	}

	public getManaPacket(int x, int y, int z) {
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
		World world = player.worldObj;
		TileEntity te = world.getTileEntity(x, y, z);
		if (!(world.getBlock(x, y, z) == Blocks.air && !FMLCommonHandler.instance().getMinecraftServerInstance().isBlockProtected(world, x, y, z, player) && !(te instanceof TileEntityChest) && te != null) && isMovable(te) == true) {
			world.setBlock(x, y, z, TDEBlocks.blockLog1, 0, 3);
			System.out.println(x + "_" + y + "_" + z);
//			player.addPotionEffect(new PotionEffect(TDEPotionEffects.DarknessID, 200, 1,  true));
		}
	}

	private boolean isMovable(TileEntity te) {
		if (te instanceof TileEntity) {
			return false;
		}
		return true;
	}
}
