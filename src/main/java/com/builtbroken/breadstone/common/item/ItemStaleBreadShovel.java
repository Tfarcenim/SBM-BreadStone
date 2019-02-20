package com.builtbroken.breadstone.common.item;

import com.builtbroken.breadstone.BreadStoneMod;
import com.builtbroken.breadstone.init.ItemRegistry;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemTier;

public class ItemStaleBreadShovel extends ItemSpade {

	public ItemStaleBreadShovel() {
		super(ItemTier.STONE, 7.0F, -3.2F, ItemRegistry.getProps());
		this.setRegistryName(BreadStoneMod.MOD_ID, "stalebreadshovel");
	}

}
