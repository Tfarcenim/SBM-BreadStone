package com.builtbroken.breadstone.common.entity;

import com.builtbroken.breadstone.init.ItemRegistry;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityBreadArrow extends EntityArrow {

	public EntityBreadArrow(World worldIn) {
		super(worldIn);
	}
	
	public EntityBreadArrow(World worldIn, EntityLivingBase shooter) {
		super(worldIn, shooter);
	}

	public EntityBreadArrow(World worldIn, double x, double y, double z) {
		super(worldIn, x, y, z);
	}

	@Override
	protected ItemStack getArrowStack() {
		return new ItemStack(ItemRegistry.stalebreadarrow, 1);
	}

}
