package com.thedarkera.shouts;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;

import com.thedarkera.TheDarkEra;

public class SoulBar {
	// max manaBar should be 48
	private static double manaBar;
	private static double mana;
	private final static double manaConstant = 0.48;

	public static void SoulBarRun(RenderGameOverlayEvent event) {
		if (!event.isCancelable() && event.type == ElementType.EXPERIENCE) {
			Minecraft mc = Minecraft.getMinecraft();
			if (!mc.thePlayer.capabilities.isCreativeMode) {
				//int posX = event.resolution.getScaledWidth() / 2 + 10;
				//int posY = event.resolution.getScaledHeight() - 48;

				mc.renderEngine.bindTexture(new ResourceLocation(TheDarkEra.MODID + ":textures/gui/SoulBar.png"));

//				mc.ingameGUI.drawTexturedModalRect(posX, posY, 0, 0, 50, 5);
//				mc.ingameGUI.drawTexturedModalRect(posX + 1, posY + 1, 0, 6, (int) manaBar, 3);
			}
		}
	}

	public static void addMana(double addedMana) {
		mana = mana + addedMana;
		if (mana >= 100) {
			mana = 100;
		}

		manaBar = mana * manaConstant;
	}

	public static void removeMana(double removedMana) {
		mana = mana - removedMana;
		if (mana <= 0) {
			mana = 0;
		}

		manaBar = (mana * manaConstant);
		

	}

	public static double getMana() {
		return mana;
	}

	public static double getManaBar() {
		return manaBar;
	}

//	public static void writeManaToNBT(double manaLevel, Entity player) {
//		NBTTagCompound nbt = new NBTTagCompound();
//		player.getEntityData().getDouble("TDEMana");
//
//		NBTTagCompound tag = player.getEntityData();
//		tag.setDouble("TDEMana", mana);
//		player.writeToNBT(tag);
//
//		nbt.setDouble("TDEMana", manaLevel);
//		System.out.println("Set NBT to: " + mana);
//	}
//
//	public static void ReadManaFromNBT(Entity player) {
//		if (player.getEntityData().hasKey("TDEMana")) {
//			System.out.println("Read data!");
//		}
//		mana = player.getEntityData().getDouble("TDEMana");
//		System.out.println("Got NBT " + mana);
//	}
}