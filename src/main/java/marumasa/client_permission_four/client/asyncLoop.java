package marumasa.client_permission_four.client;

import net.minecraft.client.MinecraftClient;

public class asyncLoop extends Thread {
    public void run() {
        while (true) {
            try {
                ClientPermission.set(MinecraftClient.getInstance().player, 4);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}