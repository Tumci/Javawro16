package pl.com.sda.rafal.zientara.apps.lesson1.homework;

public class Zad3RecurrenceLoop {

    public static void main(String[] args) {
        loop(10);
    }

    public static boolean isEven(int value) {
        if (value % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void loop(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Nie ma takiej silnii!");
        }
        if (value == 0) {
            System.out.print(value);
        } else {
            System.out.print(value + " ");
            loop(value - 1);
        }
    }


}
