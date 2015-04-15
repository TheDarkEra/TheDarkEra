package com.darkteam.thedarkera.tileentities;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntitySam extends TileEntity 
{
	private int counter = 0;
	private int metadata;
	private boolean counterEnabled = true;
	
	@Override
	public void updateEntity()
    {
		if(counterEnabled)
		{
			counter++;
		
			if(counter == 20)
			{
				counter = 0;
			
				metadata = worldObj.getBlockMetadata(xCoord, yCoord, zCoord) + 1;
			
				if(metadata > 9)
					metadata = 0;
			
				if(!worldObj.isRemote)
					worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, metadata, 2);
			}
		}
		
		super.updateEntity();
    }
	
	@Override
	public void readFromNBT(NBTTagCompound tag)
	{
		super.readFromNBT(tag);
		
		counter = tag.getInteger("counter");
		counterEnabled = tag.getBoolean("counterEnabled");
	}
	
	@Override
	public void writeToNBT(NBTTagCompound tag)
    {
		super.writeToNBT(tag);
		
		tag.setInteger("counter", counter);
		tag.setBoolean("counterEnabled", counterEnabled);
    }
	
	@Override
	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity packet)
	{
		this.readFromNBT(packet.func_148857_g());
	}
	
	@Override
	public Packet getDescriptionPacket()
	{
		NBTTagCompound var1 = new NBTTagCompound();
		
		this.writeToNBT(var1);
		
		return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, 1, var1);
	}

	public void editCounter() 
	{
		counterEnabled = !counterEnabled;
		markDirty();
		worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
	}
}