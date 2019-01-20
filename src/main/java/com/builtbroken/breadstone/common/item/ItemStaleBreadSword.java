package com.builtbroken.breadstone.common.item;

import com.builtbroken.breadstone.BreadStoneMod;
import net.minecraft.item.ItemSword;

public class ItemStaleBreadSword extends ItemSword {

	public ItemStaleBreadSword() {
		super(ToolMaterial.STONE);
		this.setRegistryName("stalebreadsword");
		this.setTranslationKey("stalebreadsword");
		this.setCreativeTab(BreadStoneMod.tab);
	}

}
