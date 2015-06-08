package com.thedarkera.ingameobjects.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

import com.thedarkera.api.blocks.BlockTDEBase;
import com.thedarkera.init.TDEBlocks;

public class BlockDarkOre extends BlockTDEBase { //BlockOre

	public BlockDarkOre(Material material, Float hardness, Float resistance, String name, String tool, int lvl, Block.SoundType sound) {
		super(name, material, hardness, resistance, tool, lvl, sound);
	}
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return this == TDEBlocks.dark_coal_ore ? Items.coal : (this == TDEBlocks.dark_diamond_ore ? Items.diamond :  (this == TDEBlocks.dark_emerald_ore ? Items.emerald : Item.getItemFromBlock(this)));
    }

	public int quantityDroppedWithBonus(int p_149679_1_, Random p_149679_2_)
    {
        if (p_149679_1_ > 0 && Item.getItemFromBlock(this) != this.getItemDropped(0, p_149679_2_, p_149679_1_))
        {
            int j = p_149679_2_.nextInt(p_149679_1_ + 2) - 1;

            if (j < 0)
            {
                j = 0;
            }

            return this.quantityDropped(p_149679_2_) * (j + 1);
        }
        else
        {
            return this.quantityDropped(p_149679_2_);
        }
    }
	
	
	private Random rand = new Random();
    @Override
    public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_)
    {
        if (this.getItemDropped(p_149690_5_, rand, p_149690_7_) != Item.getItemFromBlock(this))
        {
            int j1 = 0;

            if (this == TDEBlocks.dark_coal_ore) {
                j1 = MathHelper.getRandomIntegerInRange(rand, 0, 2);
            }
            else if (this == TDEBlocks.dark_diamond_ore) {
                j1 = MathHelper.getRandomIntegerInRange(rand, 3, 7);
            }
            else if (this == TDEBlocks.dark_emerald_ore) {
                j1 = MathHelper.getRandomIntegerInRange(rand, 3, 7);
            }

            return j1;
        }
        return 0;
    }

}
