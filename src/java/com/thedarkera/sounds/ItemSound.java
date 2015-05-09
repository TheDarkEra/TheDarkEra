package com.thedarkera.sounds;

import com.thedarkera.TheDarkEra;

public class ItemSound extends Sounds {

	public final String name;
	public final float volume;
	public final float frequency;

	public ItemSound(String sound, float p_i45393_2_, float p_i45393_3_) {
		this.name = sound;
		this.volume = p_i45393_2_;
		this.frequency = p_i45393_3_;
	}

	public float getVolume() {
		return this.volume;
	}

	public float getPitch() {
		return this.frequency;
	}

	/**
	 * Used when a block breaks, e.g.: Player break, Sheep eating grass, etc..
	 */
	public String getBreakSound() {
		return TheDarkEra.MODID + ":" + "dig." + this.name;
	}

	public String getStepResourcePath() {
		return TheDarkEra.MODID + ":" + "step." + this.name;
	}

	public String func_150496_b() {
		return this.getBreakSound();
	}

}
