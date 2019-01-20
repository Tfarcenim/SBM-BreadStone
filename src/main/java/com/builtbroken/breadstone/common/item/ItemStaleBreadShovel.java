package com.builtbroken.breadstone.common.item;

import com.builtbroken.breadstone.BreadStoneMod;
import net.minecraft.item.ItemSpade;

public class ItemStaleBreadShovel extends ItemSpade {

	public ItemStaleBreadShovel() {
		super(ToolMaterial.STONE);
		this.setRegistryName("stalebreadshovel");
		this.setTranslationKey("stalebreadshovel");
		this.setCreativeTab(BreadStoneMod.tab);
	}

}
