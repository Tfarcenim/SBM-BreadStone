package com.builtbroken.breadstone.common.item;

import com.builtbroken.breadstone.BreadStoneMod;
import net.minecraft.item.Item;

public class ItemStaleBread extends Item {

	public ItemStaleBread() {
		super();
		this.setRegistryName("stalebread");
		this.setTranslationKey("stalebread");
		this.setCreativeTab(BreadStoneMod.tab);
	}

}
