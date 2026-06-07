package net.alternative.alternatives_aquatic.mixin;

import net.alternative.alternatives_aquatic.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {
    @Unique
    private boolean alternativesAquatic$nextNightmaresBiteOffhandAttack;

    @Unique
    private boolean alternativesAquatic$swappedNightmaresBiteHands;

    @Inject(method = "attack", at = @At("HEAD"))
    private void alternativesAquatic$swapNightmaresBiteHandsBeforeAttack(Entity target, CallbackInfo info) {
        PlayerEntity player = (PlayerEntity)(Object)this;

        if (!alternativesAquatic$isDualWieldingNightmaresBite(player)) {
            alternativesAquatic$nextNightmaresBiteOffhandAttack = false;
            return;
        }

        if (alternativesAquatic$nextNightmaresBiteOffhandAttack) {
            alternativesAquatic$swapHands(player);
            alternativesAquatic$swappedNightmaresBiteHands = true;
        }
    }

    @Inject(method = "attack", at = @At("RETURN"))
    private void alternativesAquatic$restoreNightmaresBiteHandsAfterAttack(Entity target, CallbackInfo info) {
        PlayerEntity player = (PlayerEntity)(Object)this;

        if (alternativesAquatic$swappedNightmaresBiteHands) {
            alternativesAquatic$swapHands(player);
            alternativesAquatic$swappedNightmaresBiteHands = false;
        }

        if (alternativesAquatic$isDualWieldingNightmaresBite(player)) {
            alternativesAquatic$nextNightmaresBiteOffhandAttack = !alternativesAquatic$nextNightmaresBiteOffhandAttack;
        } else {
            alternativesAquatic$nextNightmaresBiteOffhandAttack = false;
        }
    }

    @Unique
    private boolean alternativesAquatic$isDualWieldingNightmaresBite(PlayerEntity player) {
        return player.getMainHandStack().isOf(ModItems.NIGHTMARES_BITE)
                && player.getOffHandStack().isOf(ModItems.NIGHTMARES_BITE);
    }

    @Unique
    private void alternativesAquatic$swapHands(PlayerEntity player) {
        PlayerInventory inventory = player.getInventory();
        ItemStack mainHandStack = inventory.getMainHandStack();
        ItemStack offHandStack = inventory.offHand.get(0);

        inventory.main.set(inventory.selectedSlot, offHandStack);
        inventory.offHand.set(0, mainHandStack);
    }
}
