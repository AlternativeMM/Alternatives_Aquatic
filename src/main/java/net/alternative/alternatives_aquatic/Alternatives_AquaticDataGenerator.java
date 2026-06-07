package net.alternative.alternatives_aquatic;

import net.alternative.alternatives_aquatic.datagen.ModItemTagProvider;
import net.alternative.alternatives_aquatic.datagen.ModModelProvider;
import net.alternative.alternatives_aquatic.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class Alternatives_AquaticDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
