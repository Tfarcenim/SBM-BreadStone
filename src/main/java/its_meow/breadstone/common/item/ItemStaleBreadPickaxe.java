package its_meow.breadstone.common.item;

import its_meow.breadstone.BreadStoneMod;
import net.minecraft.item.ItemPickaxe;

public class ItemStaleBreadPickaxe extends ItemPickaxe {

	public ItemStaleBreadPickaxe() {
		super(ToolMaterial.STONE);
		this.setRegistryName("stalebreadpickaxe");
		this.setUnlocalizedName("stalebreadpickaxe");
		this.setCreativeTab(BreadStoneMod.tab);
	}

}
