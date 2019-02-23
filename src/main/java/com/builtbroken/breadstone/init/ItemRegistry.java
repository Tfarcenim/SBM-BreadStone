package com.builtbroken.breadstone.init;


import com.builtbroken.breadstone.BreadStoneMod;
import com.builtbroken.breadstone.common.item.*;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.HashSet;
import java.util.Set;

@Mod.EventBusSubscriber(modid = BreadStoneMod.MOD_ID)
public class ItemRegistry
{
    public static Item stalebread;

    // Tools
    public static ItemStaleBreadSword stalebreadsword = new ItemStaleBreadSword(); //TODO replace with new ItemSword()
    public static ItemStaleBreadPickaxe stalebreadpickaxe = new ItemStaleBreadPickaxe(); //TODO replace with new
    public static ItemStaleBreadAxe stalebreadaxe = new ItemStaleBreadAxe(); //TODO replace with new
    public static ItemStaleBreadShovel stalebreadshovel = new ItemStaleBreadShovel(); //TODO replace with new
    public static ItemStaleBreadHoe stalebreadhoe = new ItemStaleBreadHoe();  //TODO replace with new

    // Armor
    public static ItemStaleBreadArmor stalebreadhelmet = new ItemStaleBreadArmor(EntityEquipmentSlot.HEAD, "helmet");
    public static ItemStaleBreadArmor stalebreadchestplate = new ItemStaleBreadArmor(EntityEquipmentSlot.CHEST, "chestplate");
    public static ItemStaleBreadArmor stalebreadleggings = new ItemStaleBreadArmor(EntityEquipmentSlot.LEGS, "leggings");
    public static ItemStaleBreadArmor stalebreadboots = new ItemStaleBreadArmor(EntityEquipmentSlot.FEET, "boots");

    //Misc
    public static ItemStaleBreadArrow stalebreadarrow = new ItemStaleBreadArrow();

    public static final Set<Item> ITEMS = new HashSet<>();

    /**
     * Register this mod's {@link Item}s.
     *
     * @param event The event
     */
    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(stalebread = new Item()
                .setRegistryName("stalebread")
                .setTranslationKey("stalebread")
                .setCreativeTab(BreadStoneMod.tab));
        event.getRegistry().register(stalebreadsword);
        event.getRegistry().register(stalebreadpickaxe);
        event.getRegistry().register(stalebreadaxe);
        event.getRegistry().register(stalebreadshovel);
        event.getRegistry().register(stalebreadhoe);
        event.getRegistry().register(stalebreadhelmet);
        event.getRegistry().register(stalebreadchestplate);
        event.getRegistry().register(stalebreadleggings);
        event.getRegistry().register(stalebreadboots);
        event.getRegistry().register(stalebreadarrow);
    }
}