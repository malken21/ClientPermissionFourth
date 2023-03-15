package marumasa.client_permission_four.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class MinecraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        new asyncLoop().start();
    }
}
