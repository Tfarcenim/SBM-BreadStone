package com.builtbroken.breadstone.common.item;

import com.builtbroken.breadstone.BreadStoneMod;
import net.minecraft.item.ItemAxe;

public class ItemStaleBreadAxe extends ItemAxe {

	public ItemStaleBreadAxe() {
		super(ToolMaterial.STONE);
		this.setRegistryName("stalebreadaxe");
		this.setTranslationKey("stalebreadaxe");
		this.setCreativeTab(BreadStoneMod.tab);
	}

}
