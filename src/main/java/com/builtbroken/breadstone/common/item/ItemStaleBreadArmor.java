package com.builtbroken.breadstone.common.item;

import com.builtbroken.breadstone.BreadStoneMod;
import com.builtbroken.breadstone.init.BreadstoneArmorMaterial;
import com.builtbroken.breadstone.init.ItemRegistry;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemStaleBreadArmor extends ItemArmor {

	public String nameExt = "";

	public ItemStaleBreadArmor(EntityEquipmentSlot slot, String nameExt) {
		super(BreadstoneArmorMaterial.getInstance(), slot, ItemRegistry.getProps());
		this.nameExt = nameExt;
		this.setRegistryName(BreadStoneMod.MOD_ID, "stalebread" + nameExt);
	}

}
