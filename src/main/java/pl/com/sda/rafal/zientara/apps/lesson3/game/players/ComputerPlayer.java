package pl.com.sda.rafal.zientara.apps.lesson3.game.players;

import pl.com.sda.rafal.zientara.apps.lesson3.game.GameAction;

import java.util.Random;

public class ComputerPlayer extends AbstractPlayer {

    public ComputerPlayer(String name) {
        super(name);
    }

    public GameAction chooseAction() {
        Random random = new Random();

        int value = random.nextInt(3);
        switch (value) {
            case 0:
                return GameAction.STONE;
            case 1:
                return GameAction.SCISSORS;
            default:
            case 2:
                return GameAction.PAPER;
        }
    }

    private GameAction returnFromIf(int value) {
        if (value == 0) {
            return GameAction.STONE;
        } else if (value == 1) {
            return GameAction.PAPER;
        } else {
            return GameAction.SCISSORS;
        }
    }

}
