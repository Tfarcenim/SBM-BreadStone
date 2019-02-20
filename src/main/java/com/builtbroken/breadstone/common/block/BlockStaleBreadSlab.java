package com.builtbroken.breadstone.common.block;

import java.util.Random;

import com.builtbroken.breadstone.BreadStoneMod;
import com.builtbroken.breadstone.init.BlockRegistry;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class BlockStaleBreadSlab extends BlockSlab {

	public BlockStaleBreadSlab(String ext) {
		super(Properties.create(Material.ROCK).hardnessAndResistance(4.0F).sound(SoundType.STONE));
		this.setRegistryName(BreadStoneMod.MOD_ID, "stalebreadslab" + ext);
	}

	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(BlockRegistry.stalebreadslabhalf);
	}

	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
		return new ItemStack(BlockRegistry.stalebreadslabhalf);
	}

	public static class Double extends BlockStaleBreadSlab {

		public Double() {
			super("double");
			setDefaultState(getDefaultState().with(TYPE, SlabType.DOUBLE));
		}

	}

	public static class Half extends BlockStaleBreadSlab {

		public Half() {
			super("half");
			setDefaultState(getDefaultState().with(TYPE, SlabType.BOTTOM));
		}

	}

}
