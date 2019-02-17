package pl.com.sda.rafal.zientara.apps.lesson1.homework.delta.refactor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DeltaCounter counter = new DeltaCounter();

        System.out.println("Pleas enter a, b, c");
        counter.setA(scanner.nextInt());
        counter.setB(scanner.nextInt());
        counter.setC(scanner.nextInt());

        int delta = counter.countDelta();
        System.out.println("Delta: " + delta);

        double[] zeros = counter.getZeros();
        //todo wyswietl

    }

}
