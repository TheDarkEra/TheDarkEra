package com.thedarkera.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

	import com.thedarkera.TheDarkEra;

	public class BlockWispWood extends Block
	{
		String name = "wisp_wood";
	
		public BlockWispWood()
		{
			super(Material.wood);
			setBlockName(name);
			setBlockTextureName(TheDarkEra.MODID + ":" + name);
			setCreativeTab(TheDarkEra.tabTDE);
			setHardness(1.5F);
			setResistance(2F);
			setStepSound(soundTypeWood);
		}
	}

	

