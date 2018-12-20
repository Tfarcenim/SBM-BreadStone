package its_meow.breadstone.common.item;

import its_meow.breadstone.BreadStoneMod;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ItemStaleBreadAxe extends ItemAxe {

	public ItemStaleBreadAxe() {
		super(ToolMaterial.STONE);
		this.setRegistryName("stalebreadaxe");
		this.setUnlocalizedName("stalebreadaxe");
		this.setCreativeTab(BreadStoneMod.tab);
	}

}
