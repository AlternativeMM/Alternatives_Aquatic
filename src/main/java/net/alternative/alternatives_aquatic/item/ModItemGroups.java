package net.alternative.alternatives_aquatic.item;

import net.alternative.alternatives_aquatic.Alternatives_Aquatic;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroups {

    public static final ItemGroup ALTERNATIVES_AQUATIC_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Alternatives_Aquatic.MOD_ID, "alternatives_aquatic_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.TRIDENT))
                    .displayName(Text.translatable("itemgroup.alternatives_aquatic.alternatives_aquatic_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(Items.TURTLE_HELMET);
                        entries.add(ModItems.TURTLE_CHESTPLATE);
                        entries.add(ModItems.TURTLE_LEGGINGS);
                        entries.add(ModItems.TURTLE_BOOTS);

                        entries.add(ModItems.SQUID_HELMET);
                        entries.add(ModItems.SQUID_CHESTPLATE);
                        entries.add(ModItems.SQUID_LEGGINGS);
                        entries.add(ModItems.SQUID_BOOTS);

                        entries.add(ModItems.GLOWING_SQUID_HELMET);
                        entries.add(ModItems.GLOWING_SQUID_CHESTPLATE);
                        entries.add(ModItems.GLOWING_SQUID_LEGGINGS);
                        entries.add(ModItems.GLOWING_SQUID_BOOTS);

                        entries.add(ModItems.CORAL_BLADE);
                        entries.add(ModItems.NIGHTMARES_BITE);


                    }).build());

    public static void registerItemGroups() {
        Alternatives_Aquatic.LOGGER.info("Registering Item Groups for " + Alternatives_Aquatic.MOD_ID);
    }
}
