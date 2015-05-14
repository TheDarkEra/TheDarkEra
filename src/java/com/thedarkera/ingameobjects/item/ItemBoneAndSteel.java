package com.thedarkera.ingameobjects.item;

import com.thedarkera.TheDarkEra;
import com.thedarkera.init.TDEBlocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBoneAndSteel extends Item {
    String name = "bone_and_steel";

    public ItemBoneAndSteel(){
        super();
        this.setUnlocalizedName(name);
        this.setTextureName(TheDarkEra.MODID + ":" + name);
        this.setMaxStackSize(1);
        this.setMaxDamage(35);
        this.setCreativeTab(TheDarkEra.tabTDE);
    }

    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side, float par8, float par9, float par10){
        switch(side){
            case 0: {y--; break;}
            case 1: {y++; break;}
            case 2: {z--; break;}
            case 3: {z++; break;}
            case 4: {x--; break;}
            case 5: {x++; break;}
        }

        if(!player.canPlayerEdit(x, y, z, side, itemStack)){
            return false;
        }else{
            if(world.isAirBlock(x, y, z)){
                world.playSoundEffect((double)x + 0.5D, (double)y + 0.5D, (double)z + 0.5D, "fire.ignite", 1F, itemRand.nextFloat()*0.4F + 0.8F);
                world.setBlock(x, y, z, TDEBlocks.dark_fire);
            }

            itemStack.damageItem(1, player);
            return true;
        }
    }

}
