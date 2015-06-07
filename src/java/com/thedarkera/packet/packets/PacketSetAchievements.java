package com.thedarkera.packet.packets;

import com.thedarkera.packet.AbstractPacket;
import com.thedarkera.utils.Achievement;
import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;

public class PacketSetAchievements extends AbstractPacket {

    private Achievement achievement;

    public PacketSetAchievements(Achievement achievement){
        this.achievement = achievement;
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
        ByteBufUtils.writeUTF8String(buffer, achievement.getName());
        buffer.writeBoolean(achievement.isAchieved());
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
        ByteBufUtils.readUTF8String(buffer);
        buffer.readBoolean();
    }

    @Override
    public void handleClientSide(EntityPlayer player) {

    }

    @Override
    public void handleServerSide(EntityPlayer player) {

    }
}
