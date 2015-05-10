package com.thedarkera.ztesting;

import net.minecraft.client.Minecraft;
import net.minecraft.nbt.NBTTagCompound;
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
				int posX = event.resolution.getScaledWidth() / 2 + 10;
				int posY = event.resolution.getScaledHeight() - 48;

				mc.renderEngine.bindTexture(new ResourceLocation(TheDarkEra.MODID + ":textures/gui/SoulBar.png"));

				mc.ingameGUI.drawTexturedModalRect(posX, posY, 0, 0, 50, 5);
				mc.ingameGUI.drawTexturedModalRect(posX + 1, posY + 1, 0, 6, (int)manaBar, 3);
			}
		}
	}

	public static void addMana(int addedMana) {
//		ReadManaFromNBT();
		mana = mana + addedMana;
		if (mana >= 100) {
			mana = 100;
		}

		manaBar = mana * manaConstant;
		System.out.println("manaBar: " + manaBar);
		writeManaToNBT(mana);
	}

	public static void removeMana(int removedMana) {
//		ReadManaFromNBT();
		mana = mana + removedMana;
		manaBar = (mana * manaConstant);
		writeManaToNBT(mana);
		
	}

	public static double getMana() {
		return mana;
	}
	public static double getManaBar() {
		return manaBar;
	}

	public static void writeManaToNBT(double manaLevel) {
		NBTTagCompound nbt = new NBTTagCompound();
		nbt.setDouble("TDEMana", manaLevel);
		System.out.println("Set NBT to: " + mana);
	}

	public static void ReadManaFromNBT() {
		NBTTagCompound nbt = new NBTTagCompound();
		mana = nbt.getDouble("TDEMana");
		System.out.println("Got NBT " + mana);
	}
}