package net.alternative.alternatives_aquatic.mixin;

import net.alternative.alternatives_aquatic.item.ModItems;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.util.Hand;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(MinecraftClient.class)
public class MinecraftClientMixin {
    @Shadow
    @Nullable
    public ClientPlayerEntity player;

    @Unique
    private boolean alternativesAquatic$nextNightmaresBiteOffhandSwing;

    @ModifyArg(
            method = "doAttack",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/network/ClientPlayerEntity;swingHand(Lnet/minecraft/util/Hand;)V"
            )
    )
    private Hand alternativesAquatic$alternateNightmaresBiteSwing(Hand hand) {
        if (player == null
                || !player.getMainHandStack().isOf(ModItems.NIGHTMARES_BITE)
                || !player.getOffHandStack().isOf(ModItems.NIGHTMARES_BITE)) {
            alternativesAquatic$nextNightmaresBiteOffhandSwing = false;
            return hand;
        }

        Hand attackHand = alternativesAquatic$nextNightmaresBiteOffhandSwing ? Hand.OFF_HAND : Hand.MAIN_HAND;
        alternativesAquatic$nextNightmaresBiteOffhandSwing = !alternativesAquatic$nextNightmaresBiteOffhandSwing;

        return attackHand;
    }
}
