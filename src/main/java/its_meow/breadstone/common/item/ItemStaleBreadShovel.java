package its_meow.breadstone.common.item;

import its_meow.breadstone.BreadStoneMod;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ItemStaleBreadShovel extends ItemSpade {

	public ItemStaleBreadShovel() {
		super(ToolMaterial.STONE);
		this.setRegistryName("stalebreadshovel");
		this.setUnlocalizedName("stalebreadshovel");
		this.setCreativeTab(BreadStoneMod.tab);
	}

}
