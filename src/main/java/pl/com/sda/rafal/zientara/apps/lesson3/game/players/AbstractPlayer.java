package pl.com.sda.rafal.zientara.apps.lesson3.game.players;

import pl.com.sda.rafal.zientara.apps.lesson3.game.GameAction;

public abstract class AbstractPlayer {
    private final String name;

    public AbstractPlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract GameAction chooseAction();
}
