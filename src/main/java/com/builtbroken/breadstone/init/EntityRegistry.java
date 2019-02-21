package com.builtbroken.breadstone.init;

import com.builtbroken.breadstone.BreadStoneMod;
import com.builtbroken.breadstone.common.entity.EntityBreadArrow;

import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

public class EntityRegistry {

	public static final EntityType<EntityBreadArrow> STALEBREAD_ARROW = EntityType.register(BreadStoneMod.MOD_ID + ":stalebreadarrow", EntityType.Builder.create(EntityBreadArrow.class, EntityBreadArrow::new).tracker(128, 1, true));

	@EventBusSubscriber(modid = BreadStoneMod.MOD_ID, bus = Bus.MOD)
	public static class RegistrationHandler {
		/**
		 * Register this mod's {@link EntityType}s.
		 *
		 * @param event The event
		 */
		@SubscribeEvent
		public static void onEvent(final RegistryEvent.Register<EntityType<?>> event) {
			event.getRegistry().register(STALEBREAD_ARROW);
		}
	}

}
