package pl.com.sda.rafal.zientara.apps.lesson3.game;

import pl.com.sda.rafal.zientara.apps.lesson3.game.players.AbstractPlayer;
import pl.com.sda.rafal.zientara.apps.lesson3.game.players.ComputerPlayer;
import pl.com.sda.rafal.zientara.apps.lesson3.game.players.ScannerPlayer;

public class MainGame {

    public static void main(String[] args) {
        AbstractPlayer player1 = new ScannerPlayer("Zgonusz");
        AbstractPlayer player2 = new ComputerPlayer("Robot");

        Game game = new Game(player1, player2);
        game.start();
    }
}
