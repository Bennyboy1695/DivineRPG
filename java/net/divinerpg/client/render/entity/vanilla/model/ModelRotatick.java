package net.divinerpg.client.render.entity.vanilla.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;


public class ModelRotatick extends ModelBase
{
	//fields
	ModelRenderer Box8;
	ModelRenderer Body;
	ModelRenderer LegRBT;
	ModelRenderer LegLBT;
	ModelRenderer LegRFT;
	ModelRenderer LegLFT;
	ModelRenderer LegRMT;
	ModelRenderer LegLMT;
	ModelRenderer LegRF;
	ModelRenderer LegLF;
	ModelRenderer LegLM;
	ModelRenderer LegLB;
	ModelRenderer LegRM;
	ModelRenderer LegRB;
	ModelRenderer LegRFB;
	ModelRenderer LegLFB;
	ModelRenderer LegRMB;
	ModelRenderer LegRBB;
	ModelRenderer LegLMB;
	ModelRenderer LegLBB;
	ModelRenderer LegLFC;
	ModelRenderer LegLMC;
	ModelRenderer LegLBC;
	ModelRenderer LegRBC;
	ModelRenderer LegRMC;
	ModelRenderer LegRFC;
	ModelRenderer Box1;
	ModelRenderer Box2;
	ModelRenderer Box3;
	ModelRenderer Box4;
	ModelRenderer Box5;
	ModelRenderer Box6;
	ModelRenderer Box7;
	ModelRenderer Box9;
	ModelRenderer Head;
	ModelRenderer Box10;

	public ModelRotatick()
	{
		textureWidth = 64;
		textureHeight = 32;

		Box8 = new ModelRenderer(this, 41, 13);
		Box8.addBox(-4F, -3F, -1F, 3, 3, 1);
		Box8.setRotationPoint(5F, 19F, -10F);
		Box8.setTextureSize(64, 32);
		Box8.mirror = true;
		setRotation(Box8, 0.6320364F, 0F, 0F);
		Body = new ModelRenderer(this, 40, 7);
		Body.addBox(-4F, -2F, -3F, 6, 19, 6);
		Body.setRotationPoint(0F, 14F, -3F);
		Body.setTextureSize(64, 32);
		Body.mirror = true;
		setRotation(Body, 1.570796F, 0F, 0F);
		LegRBT = new ModelRenderer(this, 42, 15);
		LegRBT.addBox(-2F, -1F, -2F, 4, 2, 4);
		LegRBT.setRotationPoint(-4.5F, 16F, 12F);
		LegRBT.setTextureSize(64, 32);
		LegRBT.mirror = true;
		setRotation(LegRBT, 0F, 0F, 0F);
		LegLBT = new ModelRenderer(this, 42, 15);
		LegLBT.addBox(-2F, -1F, -2F, 4, 2, 4);
		LegLBT.setRotationPoint(2.5F, 16F, 12F);
		LegLBT.setTextureSize(64, 32);
		LegLBT.mirror = true;
		setRotation(LegLBT, 0F, 0F, 0F);
		LegRFT = new ModelRenderer(this, 42, 15);
		LegRFT.addBox(-2F, -1F, -2F, 4, 2, 4);
		LegRFT.setRotationPoint(-4.5F, 16F, -4F);
		LegRFT.setTextureSize(64, 32);
		LegRFT.mirror = true;
		setRotation(LegRFT, 0F, 0F, 0F);
		LegLFT = new ModelRenderer(this, 42, 15);
		LegLFT.addBox(-2F, -1F, -2F, 4, 2, 4);
		LegLFT.setRotationPoint(2.5F, 16F, -4F);
		LegLFT.setTextureSize(64, 32);
		LegLFT.mirror = true;
		setRotation(LegLFT, 0F, 0F, 0F);
		LegRMT = new ModelRenderer(this, 42, 15);
		LegRMT.addBox(-2F, -1F, -1F, 4, 2, 4);
		LegRMT.setRotationPoint(-4.5F, 16F, 2F);
		LegRMT.setTextureSize(64, 32);
		LegRMT.mirror = true;
		setRotation(LegRMT, 0F, 0F, 0F);
		LegLMT = new ModelRenderer(this, 42, 15);
		LegLMT.addBox(-2F, -1F, -1F, 4, 2, 4);
		LegLMT.setRotationPoint(2.5F, 16F, 2F);
		LegLMT.setTextureSize(64, 32);
		LegLMT.mirror = true;
		setRotation(LegLMT, 0F, 0F, 0F);
		LegRF = new ModelRenderer(this, 0, 18);
		LegRF.addBox(-1F, 0F, -1F, 2, 8, 2);
		LegRF.setRotationPoint(-4.5F, 16F, -4F);
		LegRF.setTextureSize(64, 32);
		LegRF.mirror = true;
		setRotation(LegRF, 0F, 0F, 0F);
		LegLF = new ModelRenderer(this, 0, 18);
		LegLF.addBox(-1F, 0F, -1F, 2, 8, 2);
		LegLF.setRotationPoint(2.5F, 16F, -4F);
		LegLF.setTextureSize(64, 32);
		LegLF.mirror = true;
		setRotation(LegLF, 0F, 0F, 0F);
		LegLM = new ModelRenderer(this, 0, 18);
		LegLM.addBox(-1F, 0F, 0F, 2, 8, 2);
		LegLM.setRotationPoint(-4.5F, 16F, 2F);
		LegLM.setTextureSize(64, 32);
		LegLM.mirror = true;
		setRotation(LegLM, 0F, 0F, 0F);
		LegLB = new ModelRenderer(this, 0, 18);
		LegLB.addBox(-1F, 0F, -1F, 2, 8, 2);
		LegLB.setRotationPoint(-4.5F, 16F, 12F);
		LegLB.setTextureSize(64, 32);
		LegLB.mirror = true;
		setRotation(LegLB, 0F, 0F, 0F);
		LegRM = new ModelRenderer(this, 0, 18);
		LegRM.addBox(-1F, 0F, 0F, 2, 8, 2);
		LegRM.setRotationPoint(2.5F, 16F, 2F);
		LegRM.setTextureSize(64, 32);
		LegRM.mirror = true;
		setRotation(LegRM, 0F, 0F, 0F);
		LegRB = new ModelRenderer(this, 0, 18);
		LegRB.addBox(-1F, 0F, -1F, 2, 8, 2);
		LegRB.setRotationPoint(2.5F, 16F, 12F);
		LegRB.setTextureSize(64, 32);
		LegRB.mirror = true;
		setRotation(LegRB, 0F, 0F, 0F);
		LegRFB = new ModelRenderer(this, 14, 26);
		LegRFB.addBox(-2F, 6F, -2F, 4, 2, 4);
		LegRFB.setRotationPoint(-4.5F, 16F, -4F);
		LegRFB.setTextureSize(64, 32);
		LegRFB.mirror = true;
		setRotation(LegRFB, 0F, 0F, 0F);
		LegLFB = new ModelRenderer(this, 14, 26);
		LegLFB.addBox(-2F, 6F, -2F, 4, 2, 4);
		LegLFB.setRotationPoint(2.5F, 16F, -4F);
		LegLFB.setTextureSize(64, 32);
		LegLFB.mirror = true;
		setRotation(LegLFB, 0F, 0F, 0F);
		LegRMB = new ModelRenderer(this, 14, 26);
		LegRMB.addBox(-2F, 6F, -1F, 4, 2, 4);
		LegRMB.setRotationPoint(-4.5F, 16F, 2F);
		LegRMB.setTextureSize(64, 32);
		LegRMB.mirror = true;
		setRotation(LegRMB, 0F, 0F, 0F);
		LegRBB = new ModelRenderer(this, 14, 26);
		LegRBB.addBox(-2F, 6F, -2F, 4, 2, 4);
		LegRBB.setRotationPoint(-4.5F, 16F, 12F);
		LegRBB.setTextureSize(64, 32);
		LegRBB.mirror = true;
		setRotation(LegRBB, 0F, 0F, 0F);
		LegLMB = new ModelRenderer(this, 14, 26);
		LegLMB.addBox(-2F, 6F, -1F, 4, 2, 4);
		LegLMB.setRotationPoint(2.5F, 16F, 2F);
		LegLMB.setTextureSize(64, 32);
		LegLMB.mirror = true;
		setRotation(LegLMB, 0F, 0F, 0F);
		LegLBB = new ModelRenderer(this, 14, 26);
		LegLBB.addBox(-2F, 6F, -2F, 4, 2, 4);
		LegLBB.setRotationPoint(2.5F, 16F, 12F);
		LegLBB.setTextureSize(64, 32);
		LegLBB.mirror = true;
		setRotation(LegLBB, 0F, 0F, 0F);
		LegLFC = new ModelRenderer(this, 14, 18);
		LegLFC.addBox(-2F, 3F, -2F, 4, 1, 4);
		LegLFC.setRotationPoint(2.5F, 16F, -4F);
		LegLFC.setTextureSize(64, 32);
		LegLFC.mirror = true;
		setRotation(LegLFC, 0F, 0F, 0F);
		LegLMC = new ModelRenderer(this, 14, 18);
		LegLMC.addBox(-2F, 3F, -1F, 4, 1, 4);
		LegLMC.setRotationPoint(2.5F, 16F, 2F);
		LegLMC.setTextureSize(64, 32);
		LegLMC.mirror = true;
		setRotation(LegLMC, 0F, 0F, 0F);
		LegLBC = new ModelRenderer(this, 14, 18);
		LegLBC.addBox(-2F, 3F, -2F, 4, 1, 4);
		LegLBC.setRotationPoint(2.5F, 16F, 12F);
		LegLBC.setTextureSize(64, 32);
		LegLBC.mirror = true;
		setRotation(LegLBC, 0F, 0F, 0F);
		LegRBC = new ModelRenderer(this, 14, 18);
		LegRBC.addBox(-2F, 3F, -2F, 4, 1, 4);
		LegRBC.setRotationPoint(-4.5F, 16F, 12F);
		LegRBC.setTextureSize(64, 32);
		LegRBC.mirror = true;
		setRotation(LegRBC, 0F, 0F, 0F);
		LegRMC = new ModelRenderer(this, 14, 18);
		LegRMC.addBox(-2F, 3F, -1F, 4, 1, 4);
		LegRMC.setRotationPoint(-4.5F, 16F, 2F);
		LegRMC.setTextureSize(64, 32);
		LegRMC.mirror = true;
		setRotation(LegRMC, 0F, 0F, 0F);
		LegRFC = new ModelRenderer(this, 14, 18);
		LegRFC.addBox(-2F, 3F, -2F, 4, 1, 4);
		LegRFC.setRotationPoint(-4.5F, 16F, -4F);
		LegRFC.setTextureSize(64, 32);
		LegRFC.mirror = true;
		setRotation(LegRFC, 0F, 0F, 0F);
		Box1 = new ModelRenderer(this, 42, 21);
		Box1.addBox(-2F, -3F, 3F, 4, 4, 4);
		Box1.setRotationPoint(-1F, 11F, 7F);
		Box1.setTextureSize(64, 32);
		Box1.mirror = true;
		setRotation(Box1, 0F, 0F, 0F);
		Box2 = new ModelRenderer(this, 41, 13);
		Box2.addBox(-4F, -3F, -1F, 3, 3, 1);
		Box2.setRotationPoint(-2F, 19F, -10F);
		Box2.setTextureSize(64, 32);
		Box2.mirror = true;
		setRotation(Box2, 0.6320364F, 0F, 0F);
		Box3 = new ModelRenderer(this, 45, 16);
		Box3.addBox(-3F, 0F, -2F, 2, 2, 2);
		Box3.setRotationPoint(5F, 13.5F, -6F);
		Box3.setTextureSize(64, 32);
		Box3.mirror = true;
		setRotation(Box3, 0F, 0F, 0F);
		Box4 = new ModelRenderer(this, 42, 12);
		Box4.addBox(-2F, -3F, -2F, 4, 7, 4);
		Box4.setRotationPoint(-1F, 11.5F, -3F);
		Box4.setTextureSize(64, 32);
		Box4.mirror = true;
		setRotation(Box4, 0F, 0F, 0F);
		Box5 = new ModelRenderer(this, 42, 12);
		Box5.addBox(-2F, -3F, -2F, 4, 6, 4);
		Box5.setRotationPoint(-1F, 11.5F, 2F);
		Box5.setTextureSize(64, 32);
		Box5.mirror = true;
		setRotation(Box5, 0F, 0F, 0F);
		Box6 = new ModelRenderer(this, 42, 21);
		Box6.addBox(-2F, -3F, -2F, 4, 6, 4);
		Box6.setRotationPoint(-1F, 11.5F, 7F);
		Box6.setTextureSize(64, 32);
		Box6.mirror = true;
		setRotation(Box6, 0F, 0F, 0F);
		Box7 = new ModelRenderer(this, 41, 13);
		Box7.addBox(-4F, -3F, -1F, 1, 1, 6);
		Box7.setRotationPoint(6F, 19.5F, -9F);
		Box7.setTextureSize(64, 32);
		Box7.mirror = true;
		setRotation(Box7, 0.6320364F, 0F, 0F);
		Box9 = new ModelRenderer(this, 41, 13);
		Box9.addBox(-4F, -3F, -1F, 1, 1, 6);
		Box9.setRotationPoint(-1F, 19.5F, -9F);
		Box9.setTextureSize(64, 32);
		Box9.mirror = true;
		setRotation(Box9, 0.6320364F, 0F, 0F);
		Head = new ModelRenderer(this, 0, 0);
		Head.addBox(-3F, -3F, -2F, 6, 6, 4);
		Head.setRotationPoint(-1F, 13.5F, -7F);
		Head.setTextureSize(64, 32);
		Head.mirror = true;
		setRotation(Head, 0F, 0F, 0F);
		Box10 = new ModelRenderer(this, 45, 16);
		Box10.addBox(-3F, 0F, -2F, 2, 2, 2);
		Box10.setRotationPoint(-3F, 13.5F, -6F);
		Box10.setTextureSize(64, 32);
		Box10.mirror = true;
		setRotation(Box10, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		Box8.render(f5);
		Body.render(f5);
		LegRBT.render(f5);
		LegLBT.render(f5);
		LegRFT.render(f5);
		LegLFT.render(f5);
		LegRMT.render(f5);
		LegLMT.render(f5);
		LegRF.render(f5);
		LegLF.render(f5);
		LegLM.render(f5);
		LegLB.render(f5);
		LegRM.render(f5);
		LegRB.render(f5);
		LegRFB.render(f5);
		LegLFB.render(f5);
		LegRMB.render(f5);
		LegRBB.render(f5);
		LegLMB.render(f5);
		LegLBB.render(f5);
		LegLFC.render(f5);
		LegLMC.render(f5);
		LegLBC.render(f5);
		LegRBC.render(f5);
		LegRMC.render(f5);
		LegRFC.render(f5);
		Box1.render(f5);
		Box2.render(f5);
		Box3.render(f5);
		Box4.render(f5);
		Box5.render(f5);
		Box6.render(f5);
		Box7.render(f5);
		Box9.render(f5);
		Head.render(f5);
		Box10.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
	{
		this.Head.rotateAngleY = var4 / (180F / (float)Math.PI);
		this.Head.rotateAngleX = var5 / (180F / (float)Math.PI);

		this.LegRBT.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
		this.LegLB.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
		this.LegRBB.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
		this.LegRMT.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
		this.LegLM.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
		this.LegRMB.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
		this.LegRFT.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
		this.LegLF.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
		this.LegRFB.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
		this.LegRFC.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
		this.LegRMC.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
		this.LegRBC.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;

		this.LegLBT.rotateAngleX = MathHelper.cos((float) (var1 * 0.6662F + Math.PI)) * 1.4F * var2;
		this.LegRB.rotateAngleX = MathHelper.cos((float) (var1 * 0.6662F + Math.PI)) * 1.4F * var2;
		this.LegLBB.rotateAngleX = MathHelper.cos((float) (var1 * 0.6662F + Math.PI)) * 1.4F * var2;
		this.LegLMT.rotateAngleX = MathHelper.cos((float) (var1 * 0.6662F + Math.PI)) * 1.4F * var2;
		this.LegRM.rotateAngleX = MathHelper.cos((float) (var1 * 0.6662F + Math.PI)) * 1.4F * var2;
		this.LegLMB.rotateAngleX = MathHelper.cos((float) (var1 * 0.6662F + Math.PI)) * 1.4F * var2;
		this.LegLFT.rotateAngleX = MathHelper.cos((float) (var1 * 0.6662F + Math.PI)) * 1.4F * var2;
		this.LegRF.rotateAngleX = MathHelper.cos((float) (var1 * 0.6662F + Math.PI)) * 1.4F * var2;
		this.LegLFB.rotateAngleX = MathHelper.cos((float) (var1 * 0.6662F + Math.PI)) * 1.4F * var2;
		this.LegLFC.rotateAngleX = MathHelper.cos((float) (var1 * 0.6662F + Math.PI)) * 1.4F * var2;
		this.LegLMC.rotateAngleX = MathHelper.cos((float) (var1 * 0.6662F + Math.PI)) * 1.4F * var2;
		this.LegLFC.rotateAngleX = MathHelper.cos((float) (var1 * 0.6662F + Math.PI)) * 1.4F * var2;

		this.LegRBT.rotateAngleY = 0.0F;
		this.LegRB.rotateAngleY = 0.0F;
		this.LegRBB.rotateAngleY = 0.0F;
		this.LegRMT.rotateAngleY = 0.0F;
		this.LegRM.rotateAngleY = 0.0F;
		this.LegRMB.rotateAngleY = 0.0F;
		this.LegRFT.rotateAngleY = 0.0F;
		this.LegRF.rotateAngleY = 0.0F;
		this.LegRFB.rotateAngleY = 0.0F;

		this.LegLBT.rotateAngleY = 0.0F;
		this.LegLB.rotateAngleY = 0.0F;
		this.LegLBB.rotateAngleY = 0.0F;
		this.LegLMT.rotateAngleY = 0.0F;
		this.LegLM.rotateAngleY = 0.0F;
		this.LegLMB.rotateAngleY = 0.0F;
		this.LegLFT.rotateAngleY = 0.0F;
		this.LegLF.rotateAngleY = 0.0F;
		this.LegLFB.rotateAngleY = 0.0F;
	}

}