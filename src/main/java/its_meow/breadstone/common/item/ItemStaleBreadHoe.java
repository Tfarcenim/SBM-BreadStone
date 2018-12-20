package its_meow.breadstone.common.item;

import its_meow.breadstone.BreadStoneMod;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class ItemStaleBreadHoe extends ItemHoe {

	public ItemStaleBreadHoe() {
		super(ToolMaterial.STONE);
		this.setRegistryName("stalebreadhoe");
		this.setUnlocalizedName("stalebreadhoe");
		this.setCreativeTab(BreadStoneMod.tab);
	}
	
}
