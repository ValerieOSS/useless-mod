package net.lunaoss.uselessmod;
// items/blocks
import net.lunaoss.uselessmod.item.ModItems;

// fabricmc stuff
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MainMod implements ModInitializer {

	public static final String MOD_ID = "useless_shit";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		// register items
		ModItems.registerModItems();
		//ModItems.registerItem("coffee_cup", ModItems.COFFEE_CUP);
		ModItems.registerItem("empty_cup", ModItems.EMPTY_CUP);


		LOGGER.info("Hello Fabric world!");
	}

}
