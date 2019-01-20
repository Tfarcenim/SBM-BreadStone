package com.builtbroken.breadstone.common.item;

import com.builtbroken.breadstone.BreadStoneMod;
import net.minecraft.item.ItemPickaxe;

public class ItemStaleBreadPickaxe extends ItemPickaxe {

	public ItemStaleBreadPickaxe() {
		super(ToolMaterial.STONE);
		this.setRegistryName("stalebreadpickaxe");
		this.setTranslationKey("stalebreadpickaxe");
		this.setCreativeTab(BreadStoneMod.tab);
	}

}
