package its_meow.breadstone;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CreativeTab extends CreativeTabs {

	public CreativeTab(String tab) {
		super(tab);
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Items.BREAD);
	}

	
}