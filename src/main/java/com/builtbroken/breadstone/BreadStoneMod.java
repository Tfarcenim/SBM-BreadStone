package com.builtbroken.breadstone;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = BreadStoneMod.MOD_ID, name = BreadStoneMod.NAME, version = BreadStoneMod.VERSION, acceptedMinecraftVersions = BreadStoneMod.acceptedMCV)
public class BreadStoneMod
{

    public static final String MOD_ID = "breadstone";
    public static final String NAME = "Bread Stone";
    public static final String VERSION = "1.0.0";
    public static final String acceptedMCV = "[1.12,1.13)";

    @Instance(MOD_ID)
    public static BreadStoneMod mod;

    public static CreativeTabs tab = new CreativeTabs("BreadStone")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(Items.BREAD);
        }
    };

    public static Logger logger;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = LogManager.getLogger("breadstone");
    }
}