package net.alternative.alternatives_aquatic.item.custom;


import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.World;

public class SquidHelmetItem extends ArmorItem {
    public SquidHelmetItem(RegistryEntry<ArmorMaterial> material, Settings settings) {
        super(material, Type.HELMET, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient()
                && entity instanceof PlayerEntity player
                && player.getEquippedStack(EquipmentSlot.HEAD).isOf(this)
                && !player.isSubmergedInWater()) {
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 200, 0, true, false));
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }
}