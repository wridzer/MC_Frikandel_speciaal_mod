package koelekikkers.frikandelspeciaal;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import koelekikkers.frikandelspeciaal.item.ModItems;

public class FrikandelSpeciaal implements ModInitializer {
	public static final String MOD_ID = "frikandelspeciaal";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Frikandel Speciaal mod");
		ModItems.registerModItems();
	}
}