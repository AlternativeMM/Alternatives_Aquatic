package net.alternative.alternatives_aquatic;

import net.alternative.alternatives_aquatic.item.ModItemGroups;
import net.alternative.alternatives_aquatic.item.ModItems;
import net.alternative.alternatives_aquatic.loot.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Alternatives_Aquatic implements ModInitializer {
	public static final String MOD_ID = "alternatives_aquatic";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModLootTableModifiers.registerLootTableModifiers();
	}
}
