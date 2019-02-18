package pl.com.sda.rafal.zientara.apps.lesson1.homework.delta;

import java.util.Scanner;

public class MainDelta {
    int a;
    int b;
    int c;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MainDelta object = new MainDelta();

        System.out.println("Pleas enter a, b, c");
        object.a = scanner.nextInt();
        object.b = scanner.nextInt();
        object.c = scanner.nextInt();

        System.out.println(String.format("User input: a=%d, b=%d, c=%d", object.a, object.b, object.c));

        int delta = ((int)Math.pow(object.b, 2)) - (4*object.a*object.c);

        System.out.println("Delta: " + delta);

        if(delta > 0){
            MainDelta.deltaPositive(object, delta);
        } else if (delta == 0){
            deltaZero(object);
        } else {
            System.out.println("Delta is negative.");
        }


    }

    public static void deltaPositive (MainDelta tempObject, int delta) {
        double x1 = ((-1*tempObject.b)-(Math.sqrt(delta)))/(2*tempObject.a);
        double x2 = ((-1*tempObject.b)+(Math.sqrt(delta)))/(2*tempObject.a);

        System.out.println(String.format("x1= %.3f\nx2= %.3f", x1, x2));

    }

    public static void deltaZero (MainDelta tempObject){
        double x1 = (-1*tempObject.b) / (2*tempObject.a);
        System.out.println(String.format("x1= %.3f", x1));
    }
}