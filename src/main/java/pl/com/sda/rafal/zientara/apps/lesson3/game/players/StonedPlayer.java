package pl.com.sda.rafal.zientara.apps.lesson3.game.players;

import pl.com.sda.rafal.zientara.apps.lesson3.game.GameAction;

public class StonedPlayer extends AbstractPlayer {

    public StonedPlayer(String name) {
        super(name);
    }

    @Override
    public GameAction chooseAction() {
        return GameAction.STONE;
    }
}
