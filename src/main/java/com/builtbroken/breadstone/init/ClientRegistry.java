package com.builtbroken.breadstone.init;

import com.builtbroken.breadstone.BreadStoneMod;
import com.builtbroken.breadstone.client.renderer.entity.RenderStaleBreadArrow;
import com.builtbroken.breadstone.common.entity.EntityBreadArrow;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
@EventBusSubscriber(modid = BreadStoneMod.MOD_ID, value = Side.CLIENT)
public class ClientRegistry
{

    @SubscribeEvent
    public static void register(final ModelRegistryEvent event)
    {
        //Entity
        RenderingRegistry.registerEntityRenderingHandler(EntityBreadArrow.class, RenderStaleBreadArrow::new);

        //Blocks
        initModel(BlockRegistry.stalebreadblock, 0);
        initModel(BlockRegistry.stalebreadslabhalf, 0);

        //Items
        initModel(ItemRegistry.stalebread, 0);
        initModel(ItemRegistry.stalebreadarrow, 0);

        // Tools
        initModel(ItemRegistry.stalebreadsword, 0);
        initModel(ItemRegistry.stalebreadpickaxe, 0);
        initModel(ItemRegistry.stalebreadaxe, 0);
        initModel(ItemRegistry.stalebreadshovel, 0);
        initModel(ItemRegistry.stalebreadhoe, 0);

        // Armor
        initModel(ItemRegistry.stalebreadhelmet, 0);
        initModel(ItemRegistry.stalebreadchestplate, 0);
        initModel(ItemRegistry.stalebreadleggings, 0);
        initModel(ItemRegistry.stalebreadboots, 0);
    }


    public static void initModel(Item item, int meta)
    {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

    public static void initModel(Block block, int meta)
    {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
