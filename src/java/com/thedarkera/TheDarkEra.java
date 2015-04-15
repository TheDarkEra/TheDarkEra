package com.thedarkera;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TheDarkEra.MODID, name = TheDarkEra.NAME, version = TheDarkEra.VERSION)

public class TheDarkEra
{
	public static final String NAME = "The Dark Era";
	public static final String MODID = "thedarkera";
	public static final String VERSION = "1.7.10-A1"; //Alpha 1; feel free to change
	
	@Mod.Instance("thedarkera")
	public static TheDarkEra instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
}
