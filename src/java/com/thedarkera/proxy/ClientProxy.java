package com.thedarkera.proxy;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;

import com.thedarkera.client.TDEClientEventHandler;
import com.thedarkera.client.TDEPotionEffectHandler;
import com.thedarkera.client.model.ModelDaedricHelmet;
import com.thedarkera.client.tesr.TESRDragonBone;
import com.thedarkera.handler.KeyHandler;
import com.thedarkera.ingameobjects.tileentity.TEDragonBone;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;

public class ClientProxy extends CommonProxy {

	private static final ModelDaedricHelmet daedric_helmet = new ModelDaedricHelmet();

	@Override
	public ModelBiped getArmorModel(int id) {
		switch (id) {
			case 1:
				//return daedric_helmet;  TODO
			default:
				break;
		}
		//return daedric_helmet;  TODO
		return null;
	}
	
	@Override
    public int addArmor(String armorName) {
        return RenderingRegistry.addNewArmourRendererPrefix(armorName);
    }

    @Override
    public EntityPlayer findPlayer(String playerName) {
        for (Object a : FMLClientHandler.instance().getClient().theWorld.playerEntities) {
            EntityPlayer player = (EntityPlayer) a;
            if (player.getDisplayName().toLowerCase().equals(playerName.toLowerCase())) {
                return player;
            }
        }
        return null;
    }


	@Override
	public void registerRenderers() {
		ClientRegistry.bindTileEntitySpecialRenderer(TEDragonBone.class, new TESRDragonBone());
	}

	@Override
	public void registerProxies() {
		FMLCommonHandler.instance().bus().register(new KeyHandler());
	}

	@Override
	public void init() {
		MinecraftForge.EVENT_BUS.register(new TDEPotionEffectHandler());
		MinecraftForge.EVENT_BUS.register(new TDEClientEventHandler());
	}

}
