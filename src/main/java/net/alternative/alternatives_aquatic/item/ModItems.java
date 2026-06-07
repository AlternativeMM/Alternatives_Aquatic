package net.alternative.alternatives_aquatic.item;

import net.alternative.alternatives_aquatic.Alternatives_Aquatic;
import net.alternative.alternatives_aquatic.item.custom.SquidHelmetItem;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item TURTLE_CHESTPLATE = registerItem("turtle_chestplate",
            new ArmorItem(ModArmorMaterials.TURTLE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item TURTLE_LEGGINGS = registerItem("turtle_leggings",
            new ArmorItem(ModArmorMaterials.TURTLE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item TURTLE_BOOTS = registerItem("turtle_boots",
            new ArmorItem(ModArmorMaterials.TURTLE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    public static final Item SQUID_HELMET = registerItem("squid_helmet",
            new SquidHelmetItem(ModArmorMaterials.SQUID_ARMOR_MATERIAL, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item SQUID_CHESTPLATE = registerItem("squid_chestplate",
            new ArmorItem(ModArmorMaterials.SQUID_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item SQUID_LEGGINGS = registerItem("squid_leggings",
            new ArmorItem(ModArmorMaterials.GLOWING_SQUID_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item SQUID_BOOTS = registerItem("squid_boots",
            new ArmorItem(ModArmorMaterials.GLOWING_SQUID_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    public static final Item GLOWING_SQUID_HELMET = registerItem("glowing_squid_helmet",
            new SquidHelmetItem(ModArmorMaterials.GLOWING_SQUID_ARMOR_MATERIAL, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item GLOWING_SQUID_CHESTPLATE = registerItem("glowing_squid_chestplate",
            new ArmorItem(ModArmorMaterials.GLOWING_SQUID_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item GLOWING_SQUID_LEGGINGS = registerItem("glowing_squid_leggings",
            new ArmorItem(ModArmorMaterials.GLOWING_SQUID_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item GLOWING_SQUID_BOOTS = registerItem("glowing_squid_boots",
            new ArmorItem(ModArmorMaterials.GLOWING_SQUID_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    public static final Item CORAL_BLADE = registerItem("coral_blade",
            new SwordItem(ModToolMaterials.CORAL, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.CORAL, 3, -1.7f))));


    public static final Item NIGHTMARES_BITE = registerItem("nightmares_bite",
            new SwordItem(ModToolMaterials.NIGHTMARES_BITE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.NIGHTMARES_BITE, 2, -2.0f))));





    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Alternatives_Aquatic.MOD_ID + ":" + name), item);
    }

    public static void registerModItems() {
        Alternatives_Aquatic.LOGGER.info("Registering ModItems for " + Alternatives_Aquatic.MOD_ID);
    }
}
