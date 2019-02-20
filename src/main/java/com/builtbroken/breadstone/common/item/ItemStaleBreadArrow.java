package com.builtbroken.breadstone.common.item;

import com.builtbroken.breadstone.BreadStoneMod;
import com.builtbroken.breadstone.common.entity.EntityBreadArrow;
import com.builtbroken.breadstone.init.ItemRegistry;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemStaleBreadArrow extends ItemArrow {

	public ItemStaleBreadArrow() {
		super(ItemRegistry.getProps());
		this.setRegistryName(BreadStoneMod.MOD_ID, "stalebreadarrow");
	}

	@Override
	public EntityArrow createArrow(World worldIn, ItemStack stack, EntityLivingBase shooter) {
		return new EntityBreadArrow(worldIn, shooter);
	}

}
