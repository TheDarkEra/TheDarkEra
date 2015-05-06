package com.thedarkera.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWorkBench extends ModelBase
{
	ModelRenderer Leg1;
	ModelRenderer Leg2;
	ModelRenderer Leg3;
	ModelRenderer Leg4;
	ModelRenderer Base;
	ModelRenderer Handle;
	ModelRenderer Block;
	ModelRenderer Hammer;

	public ModelWorkBench()
	{
		textureWidth = 128;
		textureHeight = 128;

		Leg1 = new ModelRenderer(this, 0, 0);
		Leg1.addBox(0F, 0F, 0F, 2, 12, 2);
		Leg1.setRotationPoint(6F, 12F, 6F);
		Leg1.setTextureSize(128, 128);
		Leg1.mirror = true;
		setRotation(Leg1, 0F, 0F, 0F);
		Leg2 = new ModelRenderer(this, 0, 0);
		Leg2.addBox(0F, 0F, 0F, 2, 12, 2);
		Leg2.setRotationPoint(6F, 12F, -8F);
		Leg2.setTextureSize(128, 128);
		Leg2.mirror = true;
		setRotation(Leg2, 0F, 0F, 0F);
		Leg3 = new ModelRenderer(this, 0, 0);
		Leg3.addBox(0F, 0F, 0F, 2, 12, 2);
		Leg3.setRotationPoint(-8F, 12F, 6F);
		Leg3.setTextureSize(128, 128);
		Leg3.mirror = true;
		setRotation(Leg3, 0F, 0F, 0F);
		Leg4 = new ModelRenderer(this, 0, 0);
		Leg4.addBox(0F, 0F, 0F, 2, 12, 2);
		Leg4.setRotationPoint(-8F, 12F, -8F);
		Leg4.setTextureSize(128, 128);
		Leg4.mirror = true;
		setRotation(Leg4, 0F, 0F, 0F);
		Base = new ModelRenderer(this, 22, 0);
		Base.addBox(0F, 0F, 0F, 16, 2, 16);
		Base.setRotationPoint(-8F, 10F, -8F);
		Base.setTextureSize(128, 128);
		Base.mirror = true;
		setRotation(Base, 0F, 0F, 0F);
		Handle = new ModelRenderer(this, 100, 0);
		Handle.addBox(0F, 0F, 0F, 1, 1, 5);
		Handle.setRotationPoint(-6F, 8F, -2F);
		Handle.setTextureSize(128, 128);
		Handle.mirror = true;
		setRotation(Handle, -0.1936595F, -0.2477502F, 0F);
		Block = new ModelRenderer(this, 0, 23);
		Block.addBox(0F, 0F, 0F, 3, 1, 2);
		Block.setRotationPoint(-8F, 9F, -5F);
		Block.setTextureSize(128, 128);
		Block.mirror = true;
		setRotation(Block, 0F, 0F, 0F);
		Hammer = new ModelRenderer(this, 23, 23);
		Hammer.addBox(0F, 0F, 0F, 4, 2, 1);
		Hammer.setRotationPoint(-7F, 7F, -3F);
		Hammer.setTextureSize(128, 128);
		Hammer.mirror = true;
		setRotation(Hammer, -0.1919862F, -0.2443461F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Leg1.render(f5);
		Leg2.render(f5);
		Leg3.render(f5);
		Leg4.render(f5);
		Base.render(f5);
		Handle.render(f5);
		Block.render(f5);
		Hammer.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3,
			float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}
}
