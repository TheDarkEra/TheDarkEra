package com.thedarkera.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDoubleWorkBenchTwo extends ModelBase {
	ModelRenderer Leg1;
	ModelRenderer Leg2;
	ModelRenderer Base;
	ModelRenderer Hammer_Head;
	ModelRenderer Hammer_Handle;

	public ModelDoubleWorkBenchTwo() {
		textureWidth = 128;
		textureHeight = 128;

		Leg1 = new ModelRenderer(this, 0, 0);
		Leg1.addBox(0F, 0F, 0F, 2, 12, 2);
		Leg1.setRotationPoint(-8F, 12F, -8F);
		Leg1.setTextureSize(128, 128);
		Leg1.mirror = true;
		setRotation(Leg1, 0F, 0F, 0F);
		Leg2 = new ModelRenderer(this, 0, 17);
		Leg2.addBox(0F, 0F, 0F, 2, 12, 2);
		Leg2.setRotationPoint(-8F, 12F, 6F);
		Leg2.setTextureSize(128, 128);
		Leg2.mirror = true;
		setRotation(Leg2, 0F, 0F, 0F);
		Base = new ModelRenderer(this, 11, 0);
		Base.addBox(0F, 0F, 0F, 16, 2, 16);
		Base.setRotationPoint(-8F, 10F, -8F);
		Base.setTextureSize(128, 128);
		Base.mirror = true;
		setRotation(Base, 0F, 0F, 0F);
		Hammer_Head = new ModelRenderer(this, 15, 24);
		Hammer_Head.addBox(0F, 0F, 0F, 3, 1, 2);
		Hammer_Head.setRotationPoint(-5F, 9F, -3F);
		Hammer_Head.setTextureSize(128, 128);
		Hammer_Head.mirror = true;
		setRotation(Hammer_Head, 0F, -0.2443461F, 0F);
		Hammer_Handle = new ModelRenderer(this, 31, 23);
		Hammer_Handle.addBox(0F, 0F, 0F, 1, 1, 4);
		Hammer_Handle.setRotationPoint(-4.5F, 9F, -1F);
		Hammer_Handle.setTextureSize(128, 128);
		Hammer_Handle.mirror = true;
		setRotation(Hammer_Handle, 0F, -0.2443461F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Leg1.render(f5);
		Leg2.render(f5);
		Base.render(f5);
		Hammer_Head.render(f5);
		Hammer_Handle.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
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
