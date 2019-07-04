package club.issizler.simplechat;

import club.issizler.okyanus.api.event.DisconnectEvent;
import club.issizler.okyanus.api.event.EventHandler;

public class DisconnectEventHandler implements EventHandler<DisconnectEvent> {

    @Override
    public void handle(DisconnectEvent event) {
        event.setMessage("§c-§r " + event.getPlayer().getCustomName());
    }

}
