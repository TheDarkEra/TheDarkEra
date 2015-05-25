package com.thedarkera.ztesting;

import com.thedarkera.TheDarkEra;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class ExtendedPlayerAchievements implements IExtendedEntityProperties {

    public final static String identifier = TheDarkEra.MODID + "_achievements";

    private final EntityPlayer player;

    private boolean isAchieved = false;
    private String name = "An Achievement";

    public ExtendedPlayerAchievements(EntityPlayer player){
        this.player = player;
    }

    public final ExtendedPlayerAchievements get(EntityPlayer player)
    {
        return (ExtendedPlayerAchievements) player.getExtendedProperties(identifier);
    }

    @Override
    public void saveNBTData(NBTTagCompound compound) {
        NBTTagCompound properties = new NBTTagCompound();
        properties.setBoolean(name, isAchieved);
        compound.setTag(identifier, properties);
    }

    @Override
    public void loadNBTData(NBTTagCompound compound) {
        NBTTagCompound properties = (NBTTagCompound) compound.getTag(identifier);
        isAchieved = properties.getBoolean(name);
    }

    @Override
    public void init(Entity entity, World world) {}

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean getIsAchieved(){
        return isAchieved;
    }

    public void setIsAchieved(boolean isAchieved){
        this.isAchieved = isAchieved;
    }
}
