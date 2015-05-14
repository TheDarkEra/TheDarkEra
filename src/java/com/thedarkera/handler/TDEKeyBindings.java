package com.thedarkera.handler;

import net.minecraft.client.settings.KeyBinding;

import org.lwjgl.input.Keyboard;

import com.thedarkera.TheDarkEra;

import cpw.mods.fml.client.registry.ClientRegistry;

public class TDEKeyBindings {
	public static KeyBinding Shout_Left;
	public static KeyBinding Shout_Right;
	public static KeyBinding Shout;	

	public static void init() {
		Shout_Left = new KeyBinding("key.Shout_Left", Keyboard.KEY_O, TheDarkEra.MODID);
		Shout_Right = new KeyBinding("key.Shout_Right", Keyboard.KEY_P, TheDarkEra.MODID);
		Shout = new KeyBinding("key.Shout", Keyboard.KEY_Y, TheDarkEra.MODID);

		ClientRegistry.registerKeyBinding(Shout_Left);
		ClientRegistry.registerKeyBinding(Shout_Right);
		ClientRegistry.registerKeyBinding(Shout);
	}

}
