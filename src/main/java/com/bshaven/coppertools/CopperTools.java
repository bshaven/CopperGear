package com.bshaven.coppertools;

import net.fabricmc.api.ModInitializer;

import com.bshaven.coppertools.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CopperTools implements ModInitializer {
	public static final String MOD_ID = "coppertools";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("CopperTools is loading. Have fun crafting with copper!");
		ModItems.registerModItems();
	}
}