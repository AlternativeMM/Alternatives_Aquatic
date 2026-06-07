package net.alternative.alternatives_aquatic.item;

import net.alternative.alternatives_aquatic.Alternatives_Aquatic;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> TURTLE_ARMOR_MATERIAL = registerArmorMaterial("turtle",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.BODY, 4);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.BOOTS, 5);
            }), 9, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, () -> Ingredient.ofItems(Items.TURTLE_SCUTE),
                    List.of(new ArmorMaterial.Layer(Identifier.of(Alternatives_Aquatic.MOD_ID, "turtle"))),0, 0));

    public static final RegistryEntry<ArmorMaterial> SQUID_ARMOR_MATERIAL = registerArmorMaterial("squid",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.BODY, 4);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.BOOTS, 5);
            }), 9, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, () -> Ingredient.ofItems(Items.INK_SAC),
                    List.of(new ArmorMaterial.Layer(Identifier.of(Alternatives_Aquatic.MOD_ID, "squid"))),0, 0));

    public static final RegistryEntry<ArmorMaterial> GLOWING_SQUID_ARMOR_MATERIAL = registerArmorMaterial("glowing_squid",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.BODY, 4);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.BOOTS, 5);
            }), 9, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, () -> Ingredient.ofItems(Items.GLOW_INK_SAC),
                    List.of(new ArmorMaterial.Layer(Identifier.of(Alternatives_Aquatic.MOD_ID, "glowing_squid"))),0, 0));


    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(Alternatives_Aquatic.MOD_ID, name), material.get());
    };
}
