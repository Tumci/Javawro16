package pl.com.sda.rafal.zientara.apps.lesson1.homework.delta;

import java.util.Scanner;

public class MainDelta2 {

    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        int a, b, c, delta;
        double x1, x2;

        System.out.println("Podaj wartosc parametru a roznego od 0");
        a = info.nextInt();
        while (a == 0) {
            System.out.println("Nieprawidlowa wartosc parametru a, podaj liczbe rozna od 0");
            a = info.nextInt();
        }

        System.out.println("Podaj wartosc parametru b");
        b = info.nextInt();
        System.out.println("Podaj wartosc parametru c");
        c = info.nextInt();

        delta = b * b - 4 * a * c;
        System.out.println(b + "^2 -4 x " + a + " x " + c + "; Delta= " + delta);

        if (delta > 0) {
            x1 = (-b - Math.sqrt(delta)) / (2 * a);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("x1:" + x1);
            System.out.println("x2:" + x2);
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("x1:" + x1);
        }
        else
            System.out.println("Delta < 0, nie ma rozwiazan");

    }

}
