package net.smoreo.ddyd.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.smoreo.ddyd.DDYD;

public class ModItemGroup {
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(DDYD.MOD_ID, "summoning_wand"), () -> new ItemStack(ModItems.SUMMONING_WAND));
}
