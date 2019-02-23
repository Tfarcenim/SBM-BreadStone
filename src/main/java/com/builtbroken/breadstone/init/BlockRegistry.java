package com.builtbroken.breadstone.init;

import com.builtbroken.breadstone.BreadStoneMod;
import com.builtbroken.breadstone.common.block.BlockStaleBread;
import com.builtbroken.breadstone.common.block.BlockStaleBreadSlab;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@Mod.EventBusSubscriber(modid = BreadStoneMod.MOD_ID)
public class BlockRegistry
{
    @ObjectHolder(BreadStoneMod.MOD_ID + ":stalebreadblock")
    public static BlockStaleBread stalebreadblock = new BlockStaleBread();

    @ObjectHolder(BreadStoneMod.MOD_ID + ":stalebreadslab.half")
    public static BlockStaleBreadSlab stalebreadslabhalf = new BlockStaleBreadSlab.Half();

    @ObjectHolder(BreadStoneMod.MOD_ID + ":stalebreadslab.double")
    public static BlockStaleBreadSlab stalebreadslabdouble = new BlockStaleBreadSlab.Double();

    /**
     * Register this mod's {@link Block}s.
     *
     * @param event The event
     */
    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)
    {
        event.getRegistry().register(stalebreadblock = new BlockStaleBread());
        event.getRegistry().register(stalebreadslabhalf = new BlockStaleBreadSlab.Half());
        event.getRegistry().register(stalebreadslabdouble = new BlockStaleBreadSlab.Double());
    }


    /**
     * Register this mod's {@link ItemBlock}s.
     *
     * @param event The event
     */
    @SubscribeEvent
    public static void registerItemBlocks(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new ItemBlock(stalebreadblock).setRegistryName(stalebreadblock.getRegistryName()));
        event.getRegistry().register(new ItemSlab(stalebreadslabhalf, stalebreadslabhalf, stalebreadslabdouble).setRegistryName(stalebreadslabhalf.getRegistryName()));
    }
}