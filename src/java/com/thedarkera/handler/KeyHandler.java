package com.thedarkera.handler;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import com.thedarkera.TheDarkEra;
import com.thedarkera.packet.packets.PacketGetMana;
import com.thedarkera.shouts.ShoutList;
import com.thedarkera.ztesting.ExtendedPlayer;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyHandler {

	private final static String[] keyDesc = { "Shout", "Shout_Left", "Shout_Right" };
	private static final int[] keyValues = { Keyboard.KEY_Y, Keyboard.KEY_O, Keyboard.KEY_P };
	private final KeyBinding[] keys;

	public KeyHandler() {
		keys = new KeyBinding[keyValues.length];
		for (int i = 0; i < keyValues.length; i++) {

			keys[i] = new KeyBinding(keyDesc[i], keyValues[i], TheDarkEra.MODID);
			ClientRegistry.registerKeyBinding(keys[i]);
		}

	}

	@SubscribeEvent
	public void onMouseInput(InputEvent.MouseInputEvent event) {
		if (!FMLClientHandler.instance().isGUIOpen(GuiChat.class)) {
			Minecraft mc = Minecraft.getMinecraft();
			EntityPlayer thePlayer = mc.getMinecraft().thePlayer;
			ItemStack hand = thePlayer.getCurrentEquippedItem();
			ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer) thePlayer);
			int x = mc.objectMouseOver.blockX;
			int y = mc.objectMouseOver.blockY;
			int z = mc.objectMouseOver.blockZ;
			if (Mouse.isButtonDown(1) && hand == null)
				props.useMana(10);
			// TheDarkEra.packetPipeline.sendToServer(new PacketUseShout(x, y,
			// z));
		}
	}

	@SubscribeEvent
	public void onKeyInput(InputEvent.KeyInputEvent event) {
		if (!FMLClientHandler.instance().isGUIOpen(GuiChat.class)) {
			int key = Keyboard.getEventKey();
			boolean isDown = Keyboard.getEventKeyState();

			if (isDown) {
				switch (key) {
				case Keyboard.KEY_Y:
					Minecraft mc = Minecraft.getMinecraft();
					int x = mc.objectMouseOver.blockX;
					int y = mc.objectMouseOver.blockY;
					int z = mc.objectMouseOver.blockZ;
					ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer) Minecraft.getMinecraft().thePlayer);
					int a = props.getMaxMana();
					TheDarkEra.packetPipeline.sendToServer(new PacketGetMana(a + 10));
                    AchievementHandler.setAchieved(AchievementHandler.achievements.get("Test"));
					break;
				case Keyboard.KEY_O:
					ShoutList.PreviousShout();
					break;
				case Keyboard.KEY_P:
					ShoutList.NextShout();
					break;
				default:
					break;
				}

			}
		}
	}
}
