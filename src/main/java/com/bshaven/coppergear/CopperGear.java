package com.bshaven.coppergear;

import net.fabricmc.api.ModInitializer;

import com.bshaven.coppergear.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CopperGear implements ModInitializer {
	public static final String MOD_ID = "coppergear";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}