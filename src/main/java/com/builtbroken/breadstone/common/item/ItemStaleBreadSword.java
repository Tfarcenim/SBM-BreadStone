package com.builtbroken.breadstone.common.item;

import com.builtbroken.breadstone.BreadStoneMod;
import com.builtbroken.breadstone.init.ItemRegistry;

import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTier;

public class ItemStaleBreadSword extends ItemSword {

	public ItemStaleBreadSword() {
		super(ItemTier.STONE, 7, -3.2F, ItemRegistry.getProps());
		this.setRegistryName(BreadStoneMod.MOD_ID, "stalebreadsword");
	}

}
