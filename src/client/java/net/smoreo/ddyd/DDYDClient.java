package net.smoreo.ddyd;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationFactory;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.resource.ResourceLocation; //Doesn't exist??

public class DDYDClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		PlayerAnimationFactory.ANIMATION_DATA_FACTORY.registerFactory(
				new ResourceLocation()//How tf do you init animations
		)
	}
}