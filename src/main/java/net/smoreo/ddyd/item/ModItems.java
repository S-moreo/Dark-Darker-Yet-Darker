package net.smoreo.ddyd.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.smoreo.ddyd.DDYD;

public class ModItems {

    //Actually adding the Item
    public static final Item SUMMONING_WAND = registerItem("summoning_wand",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEM_GROUP)));
    public static final Item POMNI = registerItem("pomni",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEM_GROUP)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(DDYD.MOD_ID,name),item);
    }

    public static void registerModItems() {
        DDYD.LOGGER.debug("Registering Mod Items for " + DDYD.MOD_ID);
    }
}
