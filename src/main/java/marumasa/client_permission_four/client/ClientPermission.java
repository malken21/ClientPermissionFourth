package marumasa.client_permission_four.client;

import com.mojang.logging.LogUtils;
import net.minecraft.client.network.ClientPlayerEntity;
import org.slf4j.Logger;

public class ClientPermission {
    private static final Logger LOGGER = LogUtils.getLogger();

    public static void set(final ClientPlayerEntity ClientPlayer, final int Level) {
        if (ClientPlayer != null) {
            if (!ClientPlayer.hasPermissionLevel(Level)) {
                ClientPlayer.setClientPermissionLevel(Level);
                LOGGER.info("setClientPermission : " + Level);
            }
        }
    }
}
