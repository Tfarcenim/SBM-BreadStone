package com.builtbroken.breadstone.common.item;

import com.builtbroken.breadstone.BreadStoneMod;
import net.minecraft.item.ItemHoe;

public class ItemStaleBreadHoe extends ItemHoe {

	public ItemStaleBreadHoe() {
		super(ToolMaterial.STONE);
		this.setRegistryName("stalebreadhoe");
		this.setTranslationKey("stalebreadhoe");
		this.setCreativeTab(BreadStoneMod.tab);
	}

}
