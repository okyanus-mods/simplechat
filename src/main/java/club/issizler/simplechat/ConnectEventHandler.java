package club.issizler.simplechat;

import club.issizler.okyanus.api.event.ConnectEvent;
import club.issizler.okyanus.api.event.EventHandler;

public class ConnectEventHandler implements EventHandler<ConnectEvent> {

    @Override
    public void handle(ConnectEvent event) {
        event.setMessage("§a+§r " + event.getPlayer().getCustomName());
    }

}
