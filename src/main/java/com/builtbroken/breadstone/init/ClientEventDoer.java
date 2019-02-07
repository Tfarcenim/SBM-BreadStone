package com.builtbroken.breadstone.init;

import com.builtbroken.breadstone.BreadStoneMod;
import com.builtbroken.breadstone.client.renderer.entity.RenderStaleBreadArrow;
import com.builtbroken.breadstone.common.entity.EntityBreadArrow;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
@EventBusSubscriber(modid = BreadStoneMod.MOD_ID, value = Side.CLIENT)
public class ClientEventDoer {
	

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void registerEntityRenderers(final ModelRegistryEvent event) {
    	RenderingRegistry.registerEntityRenderingHandler(EntityBreadArrow.class, RenderStaleBreadArrow::new);
    }
	
}
