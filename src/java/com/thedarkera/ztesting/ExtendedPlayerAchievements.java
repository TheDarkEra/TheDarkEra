package com.thedarkera.ztesting;

import com.thedarkera.TheDarkEra;
import com.thedarkera.handler.AchievementHandler;
import com.thedarkera.utils.Achievement;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class ExtendedPlayerAchievements implements IExtendedEntityProperties {

    public final static String identifier = TheDarkEra.MODID + "_achievements";

    private final EntityPlayer player;

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
        for(int i = 0; i < AchievementHandler.achievementNames.size(); i++) {
            Achievement achievement = AchievementHandler.achievements.get(i);
            String name = achievement.getName();
            boolean isAchieved = achievement.isAchieved();
            properties.setBoolean(name, isAchieved);
        }
        compound.setTag(identifier, properties);
    }

    @Override
    public void loadNBTData(NBTTagCompound compound) {
        NBTTagCompound properties = (NBTTagCompound) compound.getTag(identifier);
        for(int i = 0; i < AchievementHandler.achievementNames.size(); i++) {
            Achievement achievement = AchievementHandler.achievements.get(i);
            String name = achievement.getName();
            achievement.setAchieved(properties.getBoolean(name));
        }
    }

    @Override
    public void init(Entity entity, World world) {}
}
