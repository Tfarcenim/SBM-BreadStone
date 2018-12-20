package its_meow.breadstone.common.block;

import its_meow.breadstone.BreadStoneMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockStaleBread extends Block {

	public BlockStaleBread() {
		super(Material.ROCK);
		this.setRegistryName("stalebreadblock");
		this.setUnlocalizedName("stalebreadblock");
		this.setCreativeTab(BreadStoneMod.tab);
	}

}
