package com.builtbroken.breadstone.common.block;

import com.builtbroken.breadstone.BreadStoneMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockStaleBread extends Block {

	public BlockStaleBread() {
		super(Material.ROCK);
		this.setRegistryName("stalebreadblock");
		this.setTranslationKey("stalebreadblock");
		this.setCreativeTab(BreadStoneMod.tab);
	}

}
