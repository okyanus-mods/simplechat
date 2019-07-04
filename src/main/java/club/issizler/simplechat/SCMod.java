package club.issizler.simplechat;

import club.issizler.okyanus.api.Mod;

public class SCMod extends Mod {

    @Override
    public void init() {
        registerEvent(new ChatEventHandler());
        registerEvent(new ConnectEventHandler());
        registerEvent(new DisconnectEventHandler());
    }

}
