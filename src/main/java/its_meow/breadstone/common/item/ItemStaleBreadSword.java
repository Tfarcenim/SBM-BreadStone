package its_meow.breadstone.common.item;

import its_meow.breadstone.BreadStoneMod;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class ItemStaleBreadSword extends ItemSword {

	public ItemStaleBreadSword() {
		super(ToolMaterial.STONE);
		this.setRegistryName("stalebreadsword");
		this.setUnlocalizedName("stalebreadsword");
		this.setCreativeTab(BreadStoneMod.tab);
	}

}
