package com.builtbroken.breadstone.common.block;

import com.builtbroken.breadstone.BreadStoneMod;
import com.builtbroken.breadstone.init.BlockRegistry;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public abstract class BlockStaleBreadSlab extends BlockSlab {

	public static final PropertyEnum<Variant> VARIANT = PropertyEnum.<Variant>create("variant", Variant.class);

	public BlockStaleBreadSlab(String ext) {
		super(Material.ROCK);
		this.setRegistryName("stalebreadslab" + ext);
		this.setTranslationKey("stalebreadslab" + ext);

		IBlockState iblockstate = this.blockState.getBaseState().withProperty(VARIANT, Variant.DEFAULT);

		if(!this.isDouble()) {
			iblockstate.withProperty(HALF, BlockSlab.EnumBlockHalf.BOTTOM);
		}

		this.setDefaultState(iblockstate);
		this.useNeighborBrightness = !this.isDouble();
		this.setCreativeTab(BreadStoneMod.tab);
		this.setHardness(4.0F);
	}

	@Override
	public String getTranslationKey(int meta) {
		return super.getTranslationKey();
	}

	@Override
	public IProperty<?> getVariantProperty() {
		return VARIANT;
	}

	@Override
	public Comparable<?> getTypeForItem(ItemStack stack) {
		return Variant.DEFAULT;
	}

	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(BlockRegistry.stalebreadslabhalf);
	}

	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
		return new ItemStack(BlockRegistry.stalebreadslabhalf);
	}

	@Override
	public final IBlockState getStateFromMeta(final int meta) {
		IBlockState blockstate = this.blockState.getBaseState().withProperty(VARIANT, Variant.DEFAULT);

		if(!this.isDouble()) {
			blockstate = blockstate.withProperty(HALF, ((meta&8)!=0)?EnumBlockHalf.TOP:EnumBlockHalf.BOTTOM);
		}

		return blockstate;
	}

	@Override
	public final int getMetaFromState(final IBlockState state) {
		int meta = 0;

		if(!this.isDouble()&& state.getValue(HALF)==EnumBlockHalf.TOP) {
			meta |= 8;
		}

		return meta;
	}

	@Override
	protected BlockStateContainer createBlockState() {
		if(!this.isDouble()){
			return new BlockStateContainer(this, new IProperty[] {VARIANT, HALF});
		}
		return new BlockStateContainer(this, new IProperty[] {VARIANT});
	}

	public static class Double extends BlockStaleBreadSlab
	{

		public Double() {
			super("double");
		}

		@Override
		public boolean isDouble() {
			return true;
		}

	}

	public static class Half extends BlockStaleBreadSlab
	{

		public Half() {
			super("half");
		}

		@Override
		public boolean isDouble() {
			return false;
		}

	}

	public static enum Variant implements IStringSerializable
	{
		DEFAULT;

		@Override
		public String getName() {
			return "default";
		}
	}
}
