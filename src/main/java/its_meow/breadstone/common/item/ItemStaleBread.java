package its_meow.breadstone.common.item;

import its_meow.breadstone.BreadStoneMod;
import net.minecraft.item.Item;

public class ItemStaleBread extends Item {
	
	public ItemStaleBread() {
		super();
		this.setRegistryName("stalebread");
		this.setUnlocalizedName("stalebread");
		this.setCreativeTab(BreadStoneMod.tab);
	}
	
}
