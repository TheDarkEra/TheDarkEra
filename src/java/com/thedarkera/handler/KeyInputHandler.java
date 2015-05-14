package com.thedarkera.handler;

import com.thedarkera.ztesting.ShoutList;

import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputHandler {
	@SubscribeEvent
	public void onKeyInput(InputEvent.KeyInputEvent event) {
		if (TDEKeyBindings.Shout_Left.isPressed())
			ShoutList.PreviousShout();
		if (TDEKeyBindings.Shout_Right.isPressed())
			ShoutList.NextShout();
		if (TDEKeyBindings.Shout.isPressed()) {
			int l = ShoutList.getShout();
			switch (l) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			default:
				break;
			}

		}
	}

}
