package pl.com.sda.rafal.zientara.apps.lesson3.game.players;

import pl.com.sda.rafal.zientara.apps.lesson3.game.GameAction;

import java.util.Scanner;

public class ScannerPlayer extends AbstractPlayer {

    public ScannerPlayer(String name) {
        super(name);
    }

    public GameAction chooseAction() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz akcje r/p/s");
        while (true) {
            String nextLine = scanner.nextLine().toLowerCase();
            switch (nextLine) {
                case "r":
                case "rock":
                    return GameAction.STONE;
                case "p":
                case "paper":
                    return GameAction.PAPER;
                case "s":
                case "scissors":
                    return GameAction.SCISSORS;
            }
            System.out.println("èle!");
        }
    }
}
