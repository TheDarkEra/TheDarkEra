package com.thedarkera.api.helper;


public class ResourceHelper {

	public static String TDE = "thedarkera";
	
	public static String getResourceName(String name) {
		return TDE + ":" + name;
	}
	
	public static String getSlabResourceName(String name) {
		return TDE + ":slabs/" + name;
	}
	
	public static String getMetaResourceName(String name) {
		return TDE + ":meta/" + name;
	}
	
	public static String getGuiResourceName() {
		return TDE + ":textures/gui/";
	}
}
