package com.thedarkera.sounds;

import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;

import com.thedarkera.TheDarkEra;

public class ItemSounds extends SoundType {

	public static final Block.SoundType soundWand = new Block.SoundType("wand", 5.0F, 1.0F);

	public final String name;
	public final float volume;
	public final float frequency;

	public ItemSounds(String sound, float p_i45393_2_, float p_i45393_3_) {
		super(sound, p_i45393_2_, p_i45393_3_);
		this.name = sound;
		this.volume = p_i45393_2_;
		this.frequency = p_i45393_3_;
	}

	/**
	 * Used when a block breaks, e.g.: Player break, Sheep eating grass, etc..
	 */
	@Override
	public String getBreakSound() {
		return TheDarkEra.MODID + ":" + "dig." + this.name;
	}

	@Override
	public String getStepResourcePath() {
		return TheDarkEra.MODID + ":" + "step." + this.name;
	}

}
