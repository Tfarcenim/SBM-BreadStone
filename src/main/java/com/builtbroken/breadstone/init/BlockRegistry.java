package com.builtbroken.breadstone.init;

import com.builtbroken.breadstone.BreadStoneMod;
import com.builtbroken.breadstone.common.block.BlockStaleBread;
import com.builtbroken.breadstone.common.block.BlockStaleBreadSlab;
import com.google.common.base.Preconditions;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.HashSet;
import java.util.Set;

@ObjectHolder(BreadStoneMod.MOD_ID)
public class BlockRegistry
{

    public static BlockStaleBread stalebreadblock = new BlockStaleBread();
    public static BlockStaleBreadSlab stalebreadslabhalf = new BlockStaleBreadSlab.Half();
    public static BlockStaleBreadSlab stalebreadslabdouble = new BlockStaleBreadSlab.Double();

    @Mod.EventBusSubscriber
    public static class RegistrationHandler
    {
        public static final Set<ItemBlock> ITEM_BLOCKS = new HashSet<>();

        /**
         * Register this mod's {@link Block}s.
         *
         * @param event The event
         */
        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event)
        {
            final IForgeRegistry<Block> registry = event.getRegistry();

            final Block[] blocks = {
                    stalebreadblock,
                    stalebreadslabhalf,
                    stalebreadslabdouble
            };

            registry.registerAll(blocks);
        }


        /**
         * Register this mod's {@link ItemBlock}s.
         *
         * @param event The event
         */
        @SubscribeEvent
        public static void registerItemBlocks(final RegistryEvent.Register<Item> event)
        {
            final ItemBlock[] items = {
                    new ItemBlock(stalebreadblock),
            };

            final IForgeRegistry<Item> registry = event.getRegistry();

            for (final ItemBlock item : items)
            {
                final Block block = item.getBlock();
                final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(), "Block %s has null registry name", block);
                registry.register(item.setRegistryName(registryName));
                ITEM_BLOCKS.add(item);
            }

            // Not of type ItemBlock
            registry.register(new ItemSlab(stalebreadslabhalf, stalebreadslabhalf, stalebreadslabdouble).setRegistryName(stalebreadslabhalf.getRegistryName()));

        }

        @SubscribeEvent
        public static void registerItemBlockModels(final ModelRegistryEvent event)
        {
            initModel(stalebreadblock, 0);
            initModel(stalebreadslabhalf, 0);
        }


        public static void initModel(Block block, int meta)
        {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(block.getRegistryName(), "inventory"));
        }
    }
}