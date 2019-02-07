package com.builtbroken.breadstone.common.item;

import com.builtbroken.breadstone.BreadStoneMod;
import com.builtbroken.breadstone.common.entity.EntityBreadArrow;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemStaleBreadArrow extends ItemArrow {
	
	public ItemStaleBreadArrow() {
		super();
		this.setRegistryName("stalebreadarrow");
		this.setTranslationKey("stalebreadarrow");
		this.setCreativeTab(BreadStoneMod.tab);
	}
	
	@Override
	public EntityArrow createArrow(World worldIn, ItemStack stack, EntityLivingBase shooter) {
        return new EntityBreadArrow(worldIn, shooter);
    }
	
}
