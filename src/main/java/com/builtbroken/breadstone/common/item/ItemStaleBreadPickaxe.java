package com.builtbroken.breadstone.common.item;

import com.builtbroken.breadstone.BreadStoneMod;
import com.builtbroken.breadstone.init.ItemRegistry;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemTier;

public class ItemStaleBreadPickaxe extends ItemPickaxe {

	public ItemStaleBreadPickaxe() {
		super(ItemTier.STONE, 1, -3.2F, ItemRegistry.getProps());
		this.setRegistryName(BreadStoneMod.MOD_ID, "stalebreadpickaxe");
	}

}
