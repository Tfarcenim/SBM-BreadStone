package com.builtbroken.breadstone.common.item;

import com.builtbroken.breadstone.init.ItemRegistry;

import net.minecraft.item.Item;

public class ItemStaleBread extends Item {

	public ItemStaleBread() {
		super(ItemRegistry.getProps().maxStackSize(64));
		this.setRegistryName("stalebread");
	}

}
