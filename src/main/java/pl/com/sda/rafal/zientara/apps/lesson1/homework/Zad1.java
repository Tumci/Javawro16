package pl.com.sda.rafal.zientara.apps.lesson1.homework;

/**
 * Stwórz algorytm, który zsumuje wszystkie elementy tablicy int o parzystych wartoœciach.
 */
public class Zad1 {
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 5, 1, 6, 2};
        int sum = 0;
        for (int value : input) {
            if (value % 2 == 0) {
                sum = sum + value;
            }
        }
        System.out.println("Wynik:");
        System.out.println(sum);
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
        /*
        if (value % 2 == 0) {
            return true;
        } else {
            return false;
        }
         */
    }
}
