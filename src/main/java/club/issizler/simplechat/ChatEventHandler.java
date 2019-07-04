package club.issizler.simplechat;

import club.issizler.okyanus.api.event.ChatEvent;
import club.issizler.okyanus.api.event.EventHandler;

public class ChatEventHandler implements EventHandler<ChatEvent> {

    @Override
    public void handle(ChatEvent event) {
        String name = "§7%s";

        if (event.getPlayer().isOp())
            name = "§c%s";

        event.setFormat("§l" + name + "§r %s");
    }

}
