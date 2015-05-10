package com.thedarkera.ztesting;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputHandler {

	@SubscribeEvent
	public void onKeyInput(InputEvent.KeyInputEvent event) {
		if (TDEKeyBindings.Shout_Left.isPressed())
			ShoutList.PreviousShout();
		if (TDEKeyBindings.Shout_Right.isPressed())
			ShoutList.NextShout();
	}

}
