package com.thedarkera.handler;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.settings.KeyBinding;

import org.lwjgl.input.Keyboard;

import com.thedarkera.TheDarkEra;
import com.thedarkera.packet.getManaPacket;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyHandler {

	public static final int SHOUT_KEY = 0;
	public static final int SHOUT_LEFT = 1;
	public static final int SHOUT_RIGHT = 2;
	
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
	public void onKeyInput(InputEvent.KeyInputEvent event) {
		if(!FMLClientHandler.instance().isGUIOpen(GuiChat.class)){
			int key = Keyboard.getEventKey();
			boolean isDown = Keyboard.getEventKeyState();
			
			if(isDown && key == keyValues[SHOUT_KEY]){
				System.out.println("IT IS WORKING");
				Minecraft mc = Minecraft.getMinecraft();

				int x = mc.objectMouseOver.blockX;
				int y = mc.objectMouseOver.blockY;
				int z = mc.objectMouseOver.blockZ;
				System.out.println(" got x: " + x + " got y: " + y + " got z: " + z);
				TheDarkEra.packetPipeline.sendToServer(new getManaPacket(x, y, z));
			}
		}
	}

}
