package net.alternative.alternatives_aquatic.loot;

import net.alternative.alternatives_aquatic.item.ModItems;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

public class ModLootTableModifiers {
    private static final float BURIED_TREASURE_CHANCE = 0.08F;
    private static final float UNDERWATER_RUIN_BIG_CHANCE = 0.05F;
    private static final float UNDERWATER_RUIN_SMALL_CHANCE = 0.03F;

    public static void registerLootTableModifiers() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if (!source.isBuiltin()) {
                return;
            }

            if (LootTables.BURIED_TREASURE_CHEST == key) {
                addNightmaresBitePool(tableBuilder, BURIED_TREASURE_CHANCE);
            } else if (LootTables.UNDERWATER_RUIN_BIG_CHEST == key) {
                addNightmaresBitePool(tableBuilder, UNDERWATER_RUIN_BIG_CHANCE);
            } else if (LootTables.UNDERWATER_RUIN_SMALL_CHEST == key) {
                addNightmaresBitePool(tableBuilder, UNDERWATER_RUIN_SMALL_CHANCE);
            }
        });
    }

    private static void addNightmaresBitePool(net.minecraft.loot.LootTable.Builder tableBuilder, float chance) {
        LootPool.Builder poolBuilder = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1.0F))
                .conditionally(RandomChanceLootCondition.builder(chance))
                .with(ItemEntry.builder(ModItems.NIGHTMARES_BITE));

        tableBuilder.pool(poolBuilder);
    }
}
