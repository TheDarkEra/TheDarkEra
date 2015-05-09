package com.thedarkera.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.play.server.S2BPacketChangeGameState;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EntityDaedricArrow extends Entity implements IProjectile {
	private int field_145791_d = -1;
	private int field_145792_e = -1;
	private int field_145789_f = -1;
	private Block field_145790_g;
	private int inData;
	private boolean inGround;
	public int canBePickedUp;
	public int arrowShake;
	public Entity shootingEntity;
	private int ticksInGround;
	private int ticksInAir;
	private double damage = 2.0D;
	private int knockbackStrength;

	public EntityDaedricArrow(World world) {
		super(world);
		renderDistanceWeight = 10.0D;
		setSize(0.5F, 0.5F);

	}

	@SideOnly(Side.CLIENT)
    public boolean canRenderOnFire()
    {
        return this.isBurning();
    }
	
	public EntityDaedricArrow(World p_i1754_1_, double p_i1754_2_,
			double p_i1754_4_, double p_i1754_6_) {
		super(p_i1754_1_);
		renderDistanceWeight = 10.0D;
		setSize(0.5F, 0.5F);
		setPosition(p_i1754_2_, p_i1754_4_, p_i1754_6_);
		yOffset = 0.0F;
		setInvisible(false);
	}

	public EntityDaedricArrow(World p_i1755_1_, EntityLivingBase p_i1755_2_,
			EntityLivingBase p_i1755_3_, float p_i1755_4_, float p_i1755_5_) {
		super(p_i1755_1_);
		renderDistanceWeight = 10.0D;
		shootingEntity = p_i1755_2_;

		if (p_i1755_2_ instanceof EntityPlayer) {
			canBePickedUp = 1;
		}

		posY = p_i1755_2_.posY + (double) p_i1755_2_.getEyeHeight()
				- 0.10000000149011612D;
		double d0 = p_i1755_3_.posX - p_i1755_2_.posX;
		double d1 = p_i1755_3_.boundingBox.minY
				+ (double) (p_i1755_3_.height / 3.0F) - posY;
		double d2 = p_i1755_3_.posZ - p_i1755_2_.posZ;
		double d3 = (double) MathHelper.sqrt_double(d0 * d0 + d2 * d2);

		if (d3 >= 1.0E-7D) {
			float f2 = (float) (Math.atan2(d2, d0) * 180.0D / Math.PI) - 90.0F;
			float f3 = (float) (-(Math.atan2(d1, d3) * 180.0D / Math.PI));
			double d4 = d0 / d3;
			double d5 = d2 / d3;
			setLocationAndAngles(p_i1755_2_.posX + d4, posY, p_i1755_2_.posZ
					+ d5, f2, f3);
			yOffset = 0.0F;
			float f4 = (float) d3 * 0.2F;
			setThrowableHeading(d0, d1 + (double) f4, d2, p_i1755_4_,
					p_i1755_5_);
		}
	}

	public EntityDaedricArrow(World p_i1756_1_, EntityLivingBase p_i1756_2_,
			float p_i1756_3_) {
		super(p_i1756_1_);
		renderDistanceWeight = 10.0D;
		shootingEntity = p_i1756_2_;

		if (p_i1756_2_ instanceof EntityPlayer) {
			canBePickedUp = 1;
		}

		setSize(0.5F, 0.5F);
		setLocationAndAngles(p_i1756_2_.posX, p_i1756_2_.posY
				+ (double) p_i1756_2_.getEyeHeight(), p_i1756_2_.posZ,
				p_i1756_2_.rotationYaw, p_i1756_2_.rotationPitch);
		posX -= (double) (MathHelper
				.cos(rotationYaw / 180.0F * (float) Math.PI) * 0.16F);
		posY -= 0.10000000149011612D;
		posZ -= (double) (MathHelper
				.sin(rotationYaw / 180.0F * (float) Math.PI) * 0.16F);
		setPosition(posX, posY, posZ);
		yOffset = 0.0F;
		motionX = (double) (-MathHelper.sin(rotationYaw / 180.0F
				* (float) Math.PI) * MathHelper.cos(rotationPitch / 180.0F
				* (float) Math.PI));
		motionZ = (double) (MathHelper.cos(rotationYaw / 180.0F
				* (float) Math.PI) * MathHelper.cos(rotationPitch / 180.0F
				* (float) Math.PI));
		motionY = (double) (-MathHelper.sin(rotationPitch / 180.0F
				* (float) Math.PI));
		setThrowableHeading(motionX, motionY, motionZ, p_i1756_3_ * 1.5F, 1.0F);
	}

	protected void entityInit() {
		dataWatcher.addObject(16, Byte.valueOf((byte) 0));
	}

	/**
	 * Similar to setArrowHeading, it's point the throwable entity to a x, y, z
	 * direction.
	 */
	public void setThrowableHeading(double p_70186_1_, double p_70186_3_,
			double p_70186_5_, float p_70186_7_, float p_70186_8_) {
		float f2 = MathHelper.sqrt_double(p_70186_1_ * p_70186_1_ + p_70186_3_
				* p_70186_3_ + p_70186_5_ * p_70186_5_);
		p_70186_1_ /= (double) f2;
		p_70186_3_ /= (double) f2;
		p_70186_5_ /= (double) f2;
		p_70186_1_ += rand.nextGaussian()
				* (double) (rand.nextBoolean() ? -1 : 1)
				* 0.007499999832361937D * (double) p_70186_8_;
		p_70186_3_ += rand.nextGaussian()
				* (double) (rand.nextBoolean() ? -1 : 1)
				* 0.007499999832361937D * (double) p_70186_8_;
		p_70186_5_ += rand.nextGaussian()
				* (double) (rand.nextBoolean() ? -1 : 1)
				* 0.007499999832361937D * (double) p_70186_8_;
		p_70186_1_ *= (double) p_70186_7_;
		p_70186_3_ *= (double) p_70186_7_;
		p_70186_5_ *= (double) p_70186_7_;
		motionX = p_70186_1_;
		motionY = p_70186_3_;
		motionZ = p_70186_5_;
		float f3 = MathHelper.sqrt_double(p_70186_1_ * p_70186_1_ + p_70186_5_
				* p_70186_5_);
		prevRotationYaw = rotationYaw = (float) (Math.atan2(p_70186_1_,
				p_70186_5_) * 180.0D / Math.PI);
		prevRotationPitch = rotationPitch = (float) (Math.atan2(p_70186_3_,
				(double) f3) * 180.0D / Math.PI);
		ticksInGround = 0;
	}

	/**
	 * Sets the position and rotation. Only difference from the other one is no
	 * bounding on the rotation. Args: posX, posY, posZ, yaw, pitch
	 */
	@SideOnly(Side.CLIENT)
	public void setPositionAndRotation2(double p_70056_1_, double p_70056_3_,
			double p_70056_5_, float p_70056_7_, float p_70056_8_,
			int p_70056_9_) {
		setPosition(p_70056_1_, p_70056_3_, p_70056_5_);
		setRotation(p_70056_7_, p_70056_8_);
	}

	/**
	 * Sets the velocity to the args. Args: x, y, z
	 */
	@SideOnly(Side.CLIENT)
	public void setVelocity(double p_70016_1_, double p_70016_3_,
			double p_70016_5_) {
		motionX = p_70016_1_;
		motionY = p_70016_3_;
		motionZ = p_70016_5_;

		if (prevRotationPitch == 0.0F && prevRotationYaw == 0.0F) {
			float f = MathHelper.sqrt_double(p_70016_1_ * p_70016_1_
					+ p_70016_5_ * p_70016_5_);
			prevRotationYaw = rotationYaw = (float) (Math.atan2(p_70016_1_,
					p_70016_5_) * 180.0D / Math.PI);
			prevRotationPitch = rotationPitch = (float) (Math.atan2(p_70016_3_,
					(double) f) * 180.0D / Math.PI);
			prevRotationPitch = rotationPitch;
			prevRotationYaw = rotationYaw;
			setLocationAndAngles(posX, posY, posZ, rotationYaw, rotationPitch);
			ticksInGround = 0;
		}
	}

	/**
	 * Called to update the entity's position/logic.
	 */
	@SuppressWarnings("rawtypes")
	public void onUpdate() {
		super.onUpdate();

		if (prevRotationPitch == 0.0F && prevRotationYaw == 0.0F) {
			float f = MathHelper.sqrt_double(motionX * motionX + motionZ
					* motionZ);
			prevRotationYaw = rotationYaw = (float) (Math.atan2(motionX,
					motionZ) * 180.0D / Math.PI);
			prevRotationPitch = rotationPitch = (float) (Math.atan2(motionY,
					(double) f) * 180.0D / Math.PI);
		}

		Block block = worldObj.getBlock(field_145791_d, field_145792_e,
				field_145789_f);

		if (block.getMaterial() != Material.air) {
			block.setBlockBoundsBasedOnState(worldObj, field_145791_d,
					field_145792_e, field_145789_f);
			AxisAlignedBB axisalignedbb = block
					.getCollisionBoundingBoxFromPool(worldObj, field_145791_d,
							field_145792_e, field_145789_f);

			if (axisalignedbb != null
					&& axisalignedbb.isVecInside(Vec3.createVectorHelper(posX,
							posY, posZ))) {
				inGround = true;
			}
		}

		if (arrowShake > 0) {
			--arrowShake;
		}

		if (inGround) {
			int j = worldObj.getBlockMetadata(field_145791_d, field_145792_e,
					field_145789_f);

			if (block == field_145790_g && j == inData) {
				++ticksInGround;

				if (ticksInGround == 1200) {
					setDead();
				}
			} else {
				inGround = false;
				motionX *= (double) (rand.nextFloat() * 0.2F);
				motionY *= (double) (rand.nextFloat() * 0.2F);
				motionZ *= (double) (rand.nextFloat() * 0.2F);
				ticksInGround = 0;
				ticksInAir = 0;
			}
		} else {
			++ticksInAir;
			Vec3 vec31 = Vec3.createVectorHelper(posX, posY, posZ);
			Vec3 vec3 = Vec3.createVectorHelper(posX + motionX, posY + motionY,
					posZ + motionZ);
			MovingObjectPosition movingobjectposition = worldObj.func_147447_a(
					vec31, vec3, false, true, false);
			vec31 = Vec3.createVectorHelper(posX, posY, posZ);
			vec3 = Vec3.createVectorHelper(posX + motionX, posY + motionY, posZ
					+ motionZ);

			if (movingobjectposition != null) {
				vec3 = Vec3.createVectorHelper(
						movingobjectposition.hitVec.xCoord,
						movingobjectposition.hitVec.yCoord,
						movingobjectposition.hitVec.zCoord);
			}

			Entity entity = null;
			List list = worldObj.getEntitiesWithinAABBExcludingEntity(
					this,
					boundingBox.addCoord(motionX, motionY, motionZ).expand(
							1.0D, 1.0D, 1.0D));
			double d0 = 0.0D;
			int i;
			float f1;

			for (i = 0; i < list.size(); ++i) {
				Entity entity1 = (Entity) list.get(i);

				if (entity1.canBeCollidedWith()
						&& (entity1 != shootingEntity || ticksInAir >= 5)) {
					f1 = 0.3F;
					AxisAlignedBB axisalignedbb1 = entity1.boundingBox.expand(
							(double) f1, (double) f1, (double) f1);
					MovingObjectPosition movingobjectposition1 = axisalignedbb1
							.calculateIntercept(vec31, vec3);

					if (movingobjectposition1 != null) {
						double d1 = vec31
								.distanceTo(movingobjectposition1.hitVec);

						if (d1 < d0 || d0 == 0.0D) {
							entity = entity1;
							d0 = d1;
						}
					}
				}
			}

			if (entity != null) {
				movingobjectposition = new MovingObjectPosition(entity);
			}

			if (movingobjectposition != null
					&& movingobjectposition.entityHit != null
					&& movingobjectposition.entityHit instanceof EntityPlayer) {
				EntityPlayer entityplayer = (EntityPlayer) movingobjectposition.entityHit;

				if (entityplayer.capabilities.disableDamage
						|| shootingEntity instanceof EntityPlayer
						&& !((EntityPlayer) shootingEntity)
								.canAttackPlayer(entityplayer)) {
					movingobjectposition = null;
				}
			}

			float f2;
			float f4;

			if (movingobjectposition != null) {
				if (movingobjectposition.entityHit != null) {
					f2 = MathHelper.sqrt_double(motionX * motionX + motionY
							* motionY + motionZ * motionZ);
					int k = MathHelper.ceiling_double_int((double) f2 * damage);

					if (getIsCritical()) {
						k += rand.nextInt(k / 2 + 2);
					}

					DamageSource damagesource = null;

					if (shootingEntity == null) {
						damagesource = DamageSource.causeThrownDamage(this,
								this);
					} else {
						damagesource = DamageSource.causeThrownDamage(this,
								shootingEntity);
					}

					if (isBurning()
							&& !(movingobjectposition.entityHit instanceof EntityEnderman)) {
						movingobjectposition.entityHit.setFire(5);
					}

					if (movingobjectposition.entityHit.attackEntityFrom(
							damagesource, (float) k)) {
						if (movingobjectposition.entityHit instanceof EntityLivingBase) {
							EntityLivingBase entitylivingbase = (EntityLivingBase) movingobjectposition.entityHit;

							if (!worldObj.isRemote) {
								entitylivingbase
										.setArrowCountInEntity(entitylivingbase
												.getArrowCountInEntity() + 1);
							}

							if (knockbackStrength > 0) {
								f4 = MathHelper.sqrt_double(motionX * motionX
										+ motionZ * motionZ);

								if (f4 > 0.0F) {
									movingobjectposition.entityHit
											.addVelocity(
													motionX
															* (double) knockbackStrength
															* 0.6000000238418579D
															/ (double) f4,
													0.1D,
													motionZ
															* (double) knockbackStrength
															* 0.6000000238418579D
															/ (double) f4);
								}
							}

							if (shootingEntity != null
									&& shootingEntity instanceof EntityLivingBase) {
								EnchantmentHelper.func_151384_a(
										entitylivingbase, shootingEntity);
								EnchantmentHelper.func_151385_b(
										(EntityLivingBase) shootingEntity,
										entitylivingbase);
							}

							if (shootingEntity != null
									&& movingobjectposition.entityHit != shootingEntity
									&& movingobjectposition.entityHit instanceof EntityPlayer
									&& shootingEntity instanceof EntityPlayerMP) {
								((EntityPlayerMP) shootingEntity).playerNetServerHandler
										.sendPacket(new S2BPacketChangeGameState(
												6, 0.0F));
							}
						}

						playSound("random.bowhit", 1.0F,
								1.2F / (rand.nextFloat() * 0.2F + 0.9F));

						if (!(movingobjectposition.entityHit instanceof EntityEnderman)) {
							setDead();
						}
					} else {
						motionX *= -0.10000000149011612D;
						motionY *= -0.10000000149011612D;
						motionZ *= -0.10000000149011612D;
						rotationYaw += 180.0F;
						prevRotationYaw += 180.0F;
						ticksInAir = 0;
					}
				} else {
					field_145791_d = movingobjectposition.blockX;
					field_145792_e = movingobjectposition.blockY;
					field_145789_f = movingobjectposition.blockZ;
					field_145790_g = worldObj.getBlock(field_145791_d,
							field_145792_e, field_145789_f);
					inData = worldObj.getBlockMetadata(field_145791_d,
							field_145792_e, field_145789_f);
					motionX = (double) ((float) (movingobjectposition.hitVec.xCoord - posX));
					motionY = (double) ((float) (movingobjectposition.hitVec.yCoord - posY));
					motionZ = (double) ((float) (movingobjectposition.hitVec.zCoord - posZ));
					f2 = MathHelper.sqrt_double(motionX * motionX + motionY
							* motionY + motionZ * motionZ);
					posX -= motionX / (double) f2 * 0.05000000074505806D;
					posY -= motionY / (double) f2 * 0.05000000074505806D;
					posZ -= motionZ / (double) f2 * 0.05000000074505806D;
					playSound("random.bowhit", 1.0F,
							1.2F / (rand.nextFloat() * 0.2F + 0.9F));
					inGround = true;
					arrowShake = 7;
					setIsCritical(false);

					if (field_145790_g.getMaterial() != Material.air) {
						field_145790_g.onEntityCollidedWithBlock(worldObj,
								field_145791_d, field_145792_e, field_145789_f,
								this);
					}
				}
			}

			if (getIsCritical()) {
				for (i = 0; i < 4; ++i) {
					worldObj.spawnParticle("crit", posX + motionX * (double) i
							/ 4.0D, posY + motionY * (double) i / 4.0D, posZ
							+ motionZ * (double) i / 4.0D, -motionX,
							-motionY + 0.2D, -motionZ);
				}
			}

			posX += motionX;
			posY += motionY;
			posZ += motionZ;
			f2 = MathHelper.sqrt_double(motionX * motionX + motionZ * motionZ);
			rotationYaw = (float) (Math.atan2(motionX, motionZ) * 180.0D / Math.PI);

			for (rotationPitch = (float) (Math.atan2(motionY, (double) f2) * 180.0D / Math.PI); rotationPitch
					- prevRotationPitch < -180.0F; prevRotationPitch -= 360.0F) {
				;
			}

			while (rotationPitch - prevRotationPitch >= 180.0F) {
				prevRotationPitch += 360.0F;
			}

			while (rotationYaw - prevRotationYaw < -180.0F) {
				prevRotationYaw -= 360.0F;
			}

			while (rotationYaw - prevRotationYaw >= 180.0F) {
				prevRotationYaw += 360.0F;
			}

			rotationPitch = prevRotationPitch
					+ (rotationPitch - prevRotationPitch) * 0.2F;
			rotationYaw = prevRotationYaw + (rotationYaw - prevRotationYaw)
					* 0.2F;
			float f3 = 0.99F;
			f1 = 0.05F;

			if (isInWater()) {
				for (int l = 0; l < 4; ++l) {
					f4 = 0.25F;
					worldObj.spawnParticle("bubble", posX - motionX
							* (double) f4, posY - motionY * (double) f4, posZ
							- motionZ * (double) f4, motionX, motionY, motionZ);
				}

				f3 = 0.8F;
			}

			if (isWet()) {
				extinguish();
			}

			motionX *= (double) f3;
			motionY *= (double) f3;
			motionZ *= (double) f3;
			motionY -= (double) f1;
			setPosition(posX, posY, posZ);
			func_145775_I();
		}
	}

	/**
	 * (abstract) Protected helper method to write subclass entity data to NBT.
	 */
	public void writeEntityToNBT(NBTTagCompound p_70014_1_) {
		p_70014_1_.setShort("xTile", (short) field_145791_d);
		p_70014_1_.setShort("yTile", (short) field_145792_e);
		p_70014_1_.setShort("zTile", (short) field_145789_f);
		p_70014_1_.setShort("life", (short) ticksInGround);
		p_70014_1_.setByte("inTile",
				(byte) Block.getIdFromBlock(field_145790_g));
		p_70014_1_.setByte("inData", (byte) inData);
		p_70014_1_.setByte("shake", (byte) arrowShake);
		p_70014_1_.setByte("inGround", (byte) (inGround ? 1 : 0));
		p_70014_1_.setByte("pickup", (byte) canBePickedUp);
		p_70014_1_.setDouble("damage", damage);
	}

	/**
	 * (abstract) Protected helper method to read subclass entity data from NBT.
	 */
	public void readEntityFromNBT(NBTTagCompound p_70037_1_) {
		field_145791_d = p_70037_1_.getShort("xTile");
		field_145792_e = p_70037_1_.getShort("yTile");
		field_145789_f = p_70037_1_.getShort("zTile");
		ticksInGround = p_70037_1_.getShort("life");
		field_145790_g = Block.getBlockById(p_70037_1_.getByte("inTile") & 255);
		inData = p_70037_1_.getByte("inData") & 255;
		arrowShake = p_70037_1_.getByte("shake") & 255;
		inGround = p_70037_1_.getByte("inGround") == 1;

		if (p_70037_1_.hasKey("damage", 99)) {
			damage = p_70037_1_.getDouble("damage");
		}

		if (p_70037_1_.hasKey("pickup", 99)) {
			canBePickedUp = p_70037_1_.getByte("pickup");
		} else if (p_70037_1_.hasKey("player", 99)) {
			canBePickedUp = p_70037_1_.getBoolean("player") ? 1 : 0;
		}
	}

	/**
	 * Called by a player entity when they collide with an entity
	 */
	public void onCollideWithPlayer(EntityPlayer p_70100_1_) {
		if (!worldObj.isRemote && inGround && arrowShake <= 0) {
			boolean flag = canBePickedUp == 1 || canBePickedUp == 2
					&& p_70100_1_.capabilities.isCreativeMode;

			if (canBePickedUp == 1
					&& !p_70100_1_.inventory
							.addItemStackToInventory(new ItemStack(Items.arrow,
									1))) {
				flag = false;
			}

			if (flag) {
				playSound(
						"random.pop",
						0.2F,
						((rand.nextFloat() - rand.nextFloat()) * 0.7F + 1.0F) * 2.0F);
				p_70100_1_.onItemPickup(this, 1);
				setDead();
			}
		}
	}

	/**
	 * returns if this entity triggers Block.onEntityWalking on the blocks they
	 * walk on. used for spiders and wolves to prevent them from trampling crops
	 */
	protected boolean canTriggerWalking() {
		return false;
	}

	@SideOnly(Side.CLIENT)
	public float getShadowSize() {
		return 0.0F;
	}

	public void setDamage(double p_70239_1_) {
		damage = p_70239_1_;
	}

	public double getDamage() {
		return damage;
	}

	/**
	 * Sets the amount of knockback the arrow applies when it hits a mob.
	 */
	public void setKnockbackStrength(int p_70240_1_) {
		knockbackStrength = p_70240_1_;
	}

	/**
	 * If returns false, the item will not inflict any damage against entities.
	 */
	public boolean canAttackWithItem() {
		return false;
	}

	/**
	 * Whether the arrow has a stream of critical hit particles flying behind
	 * it.
	 */
	public void setIsCritical(boolean p_70243_1_) {
		byte b0 = dataWatcher.getWatchableObjectByte(16);

		if (p_70243_1_) {
			dataWatcher.updateObject(16, Byte.valueOf((byte) (b0 | 1)));
		} else {
			dataWatcher.updateObject(16, Byte.valueOf((byte) (b0 & -2)));
		}
	}

	/**
	 * Whether the arrow has a stream of critical hit particles flying behind
	 * it.
	 */
	public boolean getIsCritical() {
		byte b0 = dataWatcher.getWatchableObjectByte(16);
		return (b0 & 1) != 0;
	}
}