package net.lunaoss.uselessmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.lunaoss.uselessmod.MainMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item COFFEE_CUP = registerItem("coffee_cup", new Item(new FabricItemSettings().group(ModItemGroup.USELESS_GROUP).food(ModFoodComponents.COFFEE_CUP)));
    public static final Item EMPTY_CUP = new Item(new Item.Settings().group(ModItemGroup.USELESS_GROUP));


    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MainMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        MainMod.LOGGER.info("Registering mod Items for " + MainMod.MOD_ID);
    }

}
