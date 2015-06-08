package com.thedarkera.api.helper;

import com.thedarkera.TheDarkEra;

public class ResourceHelper {

	public static String getResourceName(String name) {
		return TheDarkEra.MODID + ":" + name;
	}
	
	public static String getSlabResourceName(String name) {
		return TheDarkEra.MODID + ":slabs/" + name;
	}
}
