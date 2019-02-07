package com.builtbroken.breadstone.init;

import com.builtbroken.breadstone.BreadStoneMod;
import com.builtbroken.breadstone.common.entity.EntityBreadArrow;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.registries.IForgeRegistry;

public class EntityRegistry {
	
	private static int modEntities = 0;
	
	public static EntityEntry buildEntry(Class<? extends Entity> EntityClass, String entityNameIn){
		return EntityEntryBuilder.create()
				.entity(EntityClass)
				.id(new ResourceLocation(BreadStoneMod.MOD_ID, entityNameIn), modEntities++)
				.name(entityNameIn)
				.tracker(128, 1, true)
				.build();
	}
	
	
	@EventBusSubscriber(modid = BreadStoneMod.MOD_ID)
	public static class RegistrationHandler
	{
		/**
		 * Register this mod's {@link EntityEntry}s.
		 *
		 * @param event The event
		 */
		@SubscribeEvent
		public static void onEvent(final RegistryEvent.Register<EntityEntry> event)
		{
			final IForgeRegistry<EntityEntry> registry = event.getRegistry();

			registry.register(buildEntry(EntityBreadArrow.class, "stalebreadarrow"));
		}
}
	
}
