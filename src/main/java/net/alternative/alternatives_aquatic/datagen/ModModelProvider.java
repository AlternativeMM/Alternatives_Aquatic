package net.alternative.alternatives_aquatic.datagen;

import net.alternative.alternatives_aquatic.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TURTLE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TURTLE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TURTLE_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SQUID_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SQUID_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SQUID_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SQUID_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GLOWING_SQUID_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GLOWING_SQUID_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GLOWING_SQUID_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GLOWING_SQUID_BOOTS));

        itemModelGenerator.register(ModItems.CORAL_BLADE, Models.HANDHELD);
    }
}
