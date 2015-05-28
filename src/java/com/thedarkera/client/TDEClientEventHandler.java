package com.thedarkera.client;

import com.thedarkera.shouts.ShoutList;
import com.thedarkera.shouts.SoulBar;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

public class TDEClientEventHandler {

    @SubscribeEvent
    public void onRenderGameOverlay(RenderGameOverlayEvent event) {

        if(FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT) {
            SoulBar.SoulBarRun(event);
            ShoutList.ShoutBarRun(event);
        }

    }
}
