package com.builtbroken.breadstone.common.entity;

import com.builtbroken.breadstone.init.EntityRegistry;
import com.builtbroken.breadstone.init.ItemRegistry;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityBreadArrow extends EntityArrow {

	public EntityBreadArrow(World worldIn) {
		super(EntityRegistry.STALEBREAD_ARROW, worldIn);
	}

	public EntityBreadArrow(World worldIn, EntityLivingBase shooter) {
		super(EntityRegistry.STALEBREAD_ARROW, shooter, worldIn);
	}

	public EntityBreadArrow(World worldIn, double x, double y, double z) {
		super(EntityRegistry.STALEBREAD_ARROW, x, y, z, worldIn);
	}

	@Override
	protected ItemStack getArrowStack() {
		return new ItemStack(ItemRegistry.stalebreadarrow, 1);
	}

}
