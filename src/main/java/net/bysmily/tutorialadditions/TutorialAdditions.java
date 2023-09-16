package net.bysmily.tutorialadditions;

import net.bysmily.tutorialadditions.block.ModBlocks;
import net.bysmily.tutorialadditions.item.ModItemGroups;
import net.bysmily.tutorialadditions.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialAdditions implements ModInitializer {
	public static final String MOD_ID = "tutorialadditions";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}