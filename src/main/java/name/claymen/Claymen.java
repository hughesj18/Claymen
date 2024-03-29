package name.claymen;

import name.claymen.block.ModBlocks;
import name.claymen.item.ModItemGroups;
import name.claymen.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Claymen implements ModInitializer {

	public static final String MOD_ID = "claymen";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

		ModBlocks.registerModBlocks();

	}
}