package net.smoreo.ddyd;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationFactory;
import net.fabricmc.api.ModInitializer;

import net.smoreo.ddyd.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class DDYD implements ModInitializer {
	public static final String MOD_ID = "ddyd";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		GeckoLib.initialize();

	}
}