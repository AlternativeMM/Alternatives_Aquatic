package net.alternative.alternatives_aquatic.datagen;

import net.alternative.alternatives_aquatic.item.ModItems;
import net.alternative.alternatives_aquatic.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.TURTLE_CHESTPLATE)
                .add(ModItems.TURTLE_LEGGINGS)
                .add(ModItems.TURTLE_BOOTS)
                .add(ModItems.SQUID_HELMET)
                .add(ModItems.SQUID_CHESTPLATE)
                .add(ModItems.SQUID_LEGGINGS)
                .add(ModItems.SQUID_BOOTS)
                .add(ModItems.GLOWING_SQUID_HELMET)
                .add(ModItems.GLOWING_SQUID_CHESTPLATE)
                .add(ModItems.GLOWING_SQUID_LEGGINGS)
                .add(ModItems.GLOWING_SQUID_BOOTS);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.CORAL_BLADE);
    }
}
