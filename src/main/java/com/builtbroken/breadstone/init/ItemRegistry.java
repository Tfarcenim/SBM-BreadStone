package com.builtbroken.breadstone.init;

import java.util.HashSet;
import java.util.Set;

import com.builtbroken.breadstone.BreadStoneMod;
import com.builtbroken.breadstone.common.item.*;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.IForgeRegistry;

public class ItemRegistry {

	public static ItemStaleBread stalebread = new ItemStaleBread();

	// Tools
	public static ItemStaleBreadSword stalebreadsword = new ItemStaleBreadSword();
	public static ItemStaleBreadPickaxe stalebreadpickaxe = new ItemStaleBreadPickaxe();
	public static ItemStaleBreadAxe stalebreadaxe = new ItemStaleBreadAxe();
	public static ItemStaleBreadShovel stalebreadshovel = new ItemStaleBreadShovel();
	public static ItemStaleBreadHoe stalebreadhoe = new ItemStaleBreadHoe();

	// Armor
	public static ItemStaleBreadArmor stalebreadhelmet = new ItemStaleBreadArmor(EntityEquipmentSlot.HEAD, "helmet");
	public static ItemStaleBreadArmor stalebreadchestplate = new ItemStaleBreadArmor(EntityEquipmentSlot.CHEST, "chestplate");
	public static ItemStaleBreadArmor stalebreadleggings = new ItemStaleBreadArmor(EntityEquipmentSlot.LEGS, "leggings");
	public static ItemStaleBreadArmor stalebreadboots = new ItemStaleBreadArmor(EntityEquipmentSlot.FEET, "boots");

	//Misc
	public static ItemStaleBreadArrow stalebreadarrow = new ItemStaleBreadArrow();

	private static Properties ITEM_PROPS;

	public static Properties getProps() {
		if (ITEM_PROPS == null) {
			ITEM_PROPS = new Properties().group(BreadStoneMod.getItemGroup());
		}
		return ITEM_PROPS;
	}

	@Mod.EventBusSubscriber(modid = BreadStoneMod.MOD_ID, bus = Bus.MOD)
	public static class RegistrationHandler {
		public static final Set<Item> ITEMS = new HashSet<>();

		/**
		 * Register this mod's {@link Item}s.
		 *
		 * @param event The event
		 */
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			Item[] items = {
					stalebread, stalebreadsword, stalebreadpickaxe, stalebreadaxe, stalebreadshovel, stalebreadhoe, stalebreadhelmet, stalebreadchestplate, stalebreadleggings, stalebreadboots, stalebreadarrow
			};
			final IForgeRegistry<Item> registry = event.getRegistry();

			for (final Item item : items) {
				registry.register(item);
				ITEMS.add(item);
			}
		}
	}

}