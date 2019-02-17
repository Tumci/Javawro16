package pl.com.sda.rafal.zientara.apps.lesson3.game;

import pl.com.sda.rafal.zientara.apps.lesson3.game.players.AbstractPlayer;

public class Game {
    private AbstractPlayer player1;
    private AbstractPlayer player2;

    public Game(AbstractPlayer player1, AbstractPlayer player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        GameAction gameAction1 = player1.chooseAction();
        GameAction gameAction2 = player2.chooseAction();

        System.out.println(player1.getName() + " wybra³ " + gameAction1);
        System.out.println(player2.getName() + " wybra³ " + gameAction2);

        GameResult gameResult = checkGameResult(gameAction1, gameAction2);
        switch (gameResult) {
            case TIE:
                System.out.println("Remis!");
                break;
            case PLAYER_ONE_WIN:
                System.out.println(player1.getName() + " wygrywa!");
                break;
            case PLAYER_TWO_WIN:
                System.out.println(player2.getName() + " wygrywa!");
                break;
            default:
                System.out.println("WTF");
        }

    }

    private GameResult checkGameResult(GameAction action1, GameAction action2) {
        if (action1 == action2) {
            return GameResult.TIE;
        }
        if (action1 == GameAction.STONE && action2 == GameAction.SCISSORS) {
            return GameResult.PLAYER_ONE_WIN;
        }

        if (action1 == GameAction.PAPER && action2 == GameAction.STONE) {
            return GameResult.PLAYER_ONE_WIN;
        }

        if (action1 == GameAction.SCISSORS && action2 == GameAction.PAPER) {
            return GameResult.PLAYER_ONE_WIN;
        }
        return GameResult.PLAYER_TWO_WIN;
    }
}
