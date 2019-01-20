package com.builtbroken.breadstone.common.item;

import com.builtbroken.breadstone.BreadStoneMod;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ItemStaleBreadArmor extends ItemArmor {

	public String nameExt = "";

	public ItemStaleBreadArmor(EntityEquipmentSlot slot, String nameExt) {
		super(EnumHelper.addArmorMaterial("stalebread", "breadstone:stalebread", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F), -1, slot);
		this.nameExt = nameExt;
		this.setRegistryName("stalebread" + nameExt);
		this.setTranslationKey("stalebread" + nameExt);
		this.setCreativeTab(BreadStoneMod.tab);
	}



}
