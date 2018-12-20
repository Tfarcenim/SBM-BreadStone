package its_meow.breadstone.init;


import java.util.HashSet;
import java.util.Set;

import its_meow.breadstone.common.item.ItemStaleBread;
import its_meow.breadstone.common.item.ItemStaleBreadArmor;
import its_meow.breadstone.common.item.ItemStaleBreadAxe;
import its_meow.breadstone.common.item.ItemStaleBreadHoe;
import its_meow.breadstone.common.item.ItemStaleBreadPickaxe;
import its_meow.breadstone.common.item.ItemStaleBreadShovel;
import its_meow.breadstone.common.item.ItemStaleBreadSword;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
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
	public static ItemStaleBreadArmor stalebreadboots = new ItemStaleBreadArmor(EntityEquipmentSlot.FEET, "helmet");
	
	@Mod.EventBusSubscriber
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
					stalebread,
					stalebreadsword,
					stalebreadpickaxe,
					stalebreadaxe,
					stalebreadshovel,
					stalebreadhoe,
					stalebreadhelmet,
					stalebreadchestplate,
					stalebreadleggings,
					stalebreadboots
			};
			final IForgeRegistry<Item> registry = event.getRegistry();

			for (final Item item : items) {
				registry.register(item);
				ITEMS.add(item);
			}
		}

		@SubscribeEvent
		public static void registerItemBlockModels(final ModelRegistryEvent event) {
			initModel(stalebread, 0);
			// Tools
			initModel(stalebreadsword, 0);
			initModel(stalebreadpickaxe, 0);
			initModel(stalebreadaxe, 0);
			initModel(stalebreadshovel, 0);
			initModel(stalebreadhoe, 0);
			// Armor
			initModel(stalebreadhelmet, 0);
			initModel(stalebreadchestplate, 0);
			initModel(stalebreadleggings, 0);
			initModel(stalebreadboots, 0);
		}


		public static void initModel(Item item, int meta) {
			ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		}
	}

}