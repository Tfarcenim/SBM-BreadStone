package its_meow.breadstone.common.item;

import its_meow.breadstone.BreadStoneMod;
import its_meow.breadstone.Ref;
import its_meow.breadstone.init.ItemRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;

public class ItemStaleBreadArmor extends ItemArmor {
	
	public String nameExt = "";
	
	public ItemStaleBreadArmor(EntityEquipmentSlot slot, String nameExt) {
		super(EnumHelper.addArmorMaterial("stalebread", "stalebread", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F), -1, slot);
		this.nameExt = nameExt;
		this.setRegistryName("stalebread" + nameExt);
		this.setUnlocalizedName("stalebread" + nameExt);
		this.setCreativeTab(BreadStoneMod.tab);
	}

}
