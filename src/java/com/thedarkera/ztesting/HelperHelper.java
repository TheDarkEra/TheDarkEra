//package com.thedarkera.ztesting;
//
//import java.util.HashMap;
//
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.nbt.NBTTagCompound;
//import cpw.mods.fml.common.eventhandler.SubscribeEvent;
//
//class HelperHelper implements IPlayerTracker{
//	public static final instance = new HelperHelper();
//	private static HashMap<EntityPlayer, SoulBar> playerData = new HashMap<EntityPlayer, SoulBar>();
//
//	public static SoulBar getValuesFor(EntityPlayer player)
//	{
//		return playerData.get(player);
//	}
//@SubscribeEvent
//public void onPlayerLogin(EntityPlayer player)
//{
//	if(player.getEntityData().hasKey("what_so_ever")
//	{
//		playerData.put(player, readFromNBTStream(player.getEntityData().getCompoundTag("what_so_ever");
//	}else{
//	playerData.put(player, new SoulBar());
//}
//
//	@SubscribeEvent
//public void onPlayerLogout(EntityPlayer player)
//{
//	NBTTagCompound toWriteTo = new NBTTagCompound();
//	playerData.get(player).writeToNBTTagCompound(toWriteTo);
//	player.getEntityData().setCompoundTag("what_so_ever", toWriteTo);
//}
//
//private SoulBar readFromNBTStream(NBTTagCompound playerCompound)
//{
//	SoulBar toReturn = new SoulBar();
//	toReturn.readFromNBTTagCompound(playerCompound);
//	return toReturn;
//}
//}
//	