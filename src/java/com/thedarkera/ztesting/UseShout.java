package com.thedarkera.ztesting;

import java.util.Random;

import com.thedarkera.init.TDEBlocks;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;

public class UseShout {

	public static void CostMana(int manaCost, int x, int y, int z) {
//		EntityClientPlayerMP player = Minecraft.getMinecraft().thePlayer;
		System.out.println(x + ", " + y + ", " + z);
		WorldClient world = Minecraft.getMinecraft().theWorld;
		final EntityPlayer player = (EntityPlayer) Minecraft.getMinecraft().thePlayer;
		Random rand = new Random();
//		int x = (int) player.posX;
//		int y = (int) player.posY;
//		int z = (int) player.posZ;
		SoulBar.removeMana(manaCost);

//		if (!world.isRemote) {

			double d0 = (double) ((float) x + rand.nextFloat());
			double d1 = (double) ((float) y + rand.nextFloat());
			double d2 = (double) ((float) z + rand.nextFloat());
			double d3 = 0.0D;
			double d4 = 0.0D;
			double d5 = 0.0D;
			int i1 = rand.nextInt(2) * 2 - 1;
			d3 = ((double) rand.nextFloat() - 0.5D) * 0.5D;
			d4 = ((double) rand.nextFloat() - 0.5D) * 0.5D;
			d5 = ((double) rand.nextFloat() - 0.5D) * 0.5D;
	
			double motionX = rand.nextGaussian() * 0.02D;
			double motionY = rand.nextGaussian() * 0.02D;
			double motionZ = rand.nextGaussian() * 0.02D;
			world.spawnParticle("happyVillager", x + rand.nextFloat() * 1 * 2.0F - 1, y + 0.5D + rand.nextFloat() * 1, z + rand.nextFloat() * 1 * 2.0F - 1, motionX, motionY, motionZ);
			Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTreeFX(world, d0, d1, d2, d3, d4, d5, 11f, 141f, 148f));
			world.setBlock(x, y, z, Blocks.bedrock);
			System.out.println(player.posX  +" POSX");
//		}

	}
	public static void Shout(int manaCost, int x, int y, int z){
		double i = SoulBar.getMana();
		if (i > manaCost){
			UseShout.CostMana(20, x, y, z);
		}
	}
}
