package com.builtbroken.breadstone;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;

@Mod(modid = BreadStoneMod.MOD_ID, name = BreadStoneMod.NAME, version = BreadStoneMod.VERSION)
public class BreadStoneMod
{
    public static final String MOD_ID = "breadstone";
    public static final String NAME = "[SBM] Bread Stone";
    public static final String VERSION = "1.1.0";

    public static CreativeTabs tab = new CreativeTabs("breadstone")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(Items.BREAD);
        }
    };
}