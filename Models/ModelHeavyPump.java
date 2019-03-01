/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2017
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 06/09/2013 5:19:45 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.ReactorCraft.Models;

import java.util.ArrayList;

import org.lwjgl.opengl.GL11;

import net.minecraft.tileentity.TileEntity;

import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelHeavyPump extends RotaryModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape2;
	LODModelPart Shape2a;
	LODModelPart Shape2b;
	LODModelPart Shape2c;
	LODModelPart Shape1a;
	LODModelPart Shape3;
	LODModelPart Shape3a;
	LODModelPart Shape3b;
	LODModelPart Shape3c;
	LODModelPart Shape3d;
	LODModelPart Shape3e;
	LODModelPart Shape4;
	LODModelPart Shape4a;
	LODModelPart Shape4b;
	LODModelPart Shape4c;

	public ModelHeavyPump()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new LODModelPart(this, 0, 19);
		Shape1.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape1.setRotationPoint(-8F, 8F, -8F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 10, 37);
		Shape2.addBox(0F, 0F, 0F, 1, 14, 1);
		Shape2.setRotationPoint(7F, 9F, 7F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape2a = new LODModelPart(this, 0, 37);
		Shape2a.addBox(0F, 0F, 0F, 1, 14, 1);
		Shape2a.setRotationPoint(-8F, 9F, 7F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape2b = new LODModelPart(this, 5, 37);
		Shape2b.addBox(0F, 0F, 0F, 1, 14, 1);
		Shape2b.setRotationPoint(-8F, 9F, -8F);
		Shape2b.setTextureSize(128, 128);
		Shape2b.mirror = true;
		this.setRotation(Shape2b, 0F, 0F, 0F);
		Shape2c = new LODModelPart(this, 15, 37);
		Shape2c.addBox(0F, 0F, 0F, 1, 14, 1);
		Shape2c.setRotationPoint(7F, 9F, -8F);
		Shape2c.setTextureSize(128, 128);
		Shape2c.mirror = true;
		this.setRotation(Shape2c, 0F, 0F, 0F);
		Shape1a = new LODModelPart(this, 0, 0);
		Shape1a.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape1a.setRotationPoint(-8F, 23F, -8F);
		Shape1a.setTextureSize(128, 128);
		Shape1a.mirror = true;
		this.setRotation(Shape1a, 0F, 0F, 0F);
		Shape3 = new LODModelPart(this, 0, 53);
		Shape3.addBox(-5F, 0F, -5F, 10, 13, 10);
		Shape3.setRotationPoint(0F, 9.5F, 0F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0.3926991F, 0F);
		Shape3a = new LODModelPart(this, 0, 77);
		Shape3a.addBox(-1F, 0F, -1F, 2, 17, 2);
		Shape3a.setRotationPoint(0F, 7.5F, 0F);
		Shape3a.setTextureSize(128, 128);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 0F, 0F);
		Shape3b = new LODModelPart(this, 0, 77);
		Shape3b.addBox(-1F, 0F, -1F, 2, 17, 2);
		Shape3b.setRotationPoint(0F, 7.5F, 0F);
		Shape3b.setTextureSize(128, 128);
		Shape3b.mirror = true;
		this.setRotation(Shape3b, 0F, 0.7853982F, 0F);
		Shape3c = new LODModelPart(this, 0, 53);
		Shape3c.addBox(-5F, 0F, -5F, 10, 13, 10);
		Shape3c.setRotationPoint(0F, 9.5F, 0F);
		Shape3c.setTextureSize(128, 128);
		Shape3c.mirror = true;
		this.setRotation(Shape3c, 0F, 0.7853982F, 0F);
		Shape3d = new LODModelPart(this, 0, 53);
		Shape3d.addBox(-5F, 0F, -5F, 10, 13, 10);
		Shape3d.setRotationPoint(0F, 9.5F, 0F);
		Shape3d.setTextureSize(128, 128);
		Shape3d.mirror = true;
		this.setRotation(Shape3d, 0F, 1.178097F, 0F);
		Shape3e = new LODModelPart(this, 0, 53);
		Shape3e.addBox(-5F, 0F, -5F, 10, 13, 10);
		Shape3e.setRotationPoint(0F, 9.5F, 0F);
		Shape3e.setTextureSize(128, 128);
		Shape3e.mirror = true;
		this.setRotation(Shape3e, 0F, 0F, 0F);
		Shape4 = new LODModelPart(this, 66, 31);
		Shape4.addBox(0F, 0F, 0F, 14, 14, 1);
		Shape4.setRotationPoint(-7F, 9F, 7F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape4a = new LODModelPart(this, 97, 0);
		Shape4a.addBox(0F, 0F, 0F, 1, 14, 14);
		Shape4a.setRotationPoint(7F, 9F, -7F);
		Shape4a.setTextureSize(128, 128);
		Shape4a.mirror = true;
		this.setRotation(Shape4a, 0F, 0F, 0F);
		Shape4b = new LODModelPart(this, 97, 31);
		Shape4b.addBox(0F, 0F, 0F, 14, 14, 1);
		Shape4b.setRotationPoint(-7F, 9F, -8F);
		Shape4b.setTextureSize(128, 128);
		Shape4b.mirror = true;
		this.setRotation(Shape4b, 0F, 0F, 0F);
		Shape4c = new LODModelPart(this, 66, 0);
		Shape4c.addBox(0F, 0F, 0F, 1, 14, 14);
		Shape4c.setRotationPoint(-8F, 9F, -7F);
		Shape4c.setTextureSize(128, 128);
		Shape4c.mirror = true;
		this.setRotation(Shape4c, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta)
	{
		Shape1.render(te, f5);
		Shape2.render(te, f5);
		Shape2a.render(te, f5);
		Shape2b.render(te, f5);
		Shape2c.render(te, f5);
		Shape1a.render(te, f5);

		GL11.glRotatef(phi, 0, 1, 0);

		Shape3.render(te, f5);
		Shape3a.render(te, f5);
		Shape3b.render(te, f5);
		Shape3c.render(te, f5);
		Shape3d.render(te, f5);
		Shape3e.render(te, f5);

		GL11.glRotatef(-phi, 0, 1, 0);

		Shape4.render(te, f5);
		Shape4a.render(te, f5);
		Shape4b.render(te, f5);
		Shape4c.render(te, f5);
	}

}
