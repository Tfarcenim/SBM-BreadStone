package com.builtbroken.breadstone.common.block;

import com.builtbroken.breadstone.BreadStoneMod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockStaleBread extends Block {

	static final Properties PROPS = Properties.create(Material.ROCK).hardnessAndResistance(4.0F).sound(SoundType.STONE);

	public BlockStaleBread() {
		super(PROPS);
		this.setRegistryName(BreadStoneMod.MOD_ID, "stalebreadblock");
	}

	public static Properties getProps() {
		return PROPS;
	}

}
