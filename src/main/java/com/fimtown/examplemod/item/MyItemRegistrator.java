package com.fimtown.examplemod.item;

import com.fimtown.examplemod.FimTownMod;
import com.fimtown.examplemod.util.Registration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class MyItemRegistrator {

    public static final RegistryObject<Item> COPPER_INGOT =
            Registration.ITEMS.register("copper_ingot",
                () -> new Item(new Item.Properties().group(FimTownMod.COURSE_TAB)));

    public static final RegistryObject<Item> HUMAN_LEASH =
            Registration.ITEMS.register("human_leash",
                    () -> new Item(new Item.Properties().group(FimTownMod.COURSE_TAB)));

    public static void register() { }

}
