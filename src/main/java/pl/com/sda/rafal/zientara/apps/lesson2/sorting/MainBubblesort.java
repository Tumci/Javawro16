package pl.com.sda.rafal.zientara.apps.lesson2.sorting;

import java.util.Scanner;

public class MainBubblesort {

    public static void main(String[] args) {
        int[] tab = getArray();

        System.out.println("Sortowanie...");
        b_sort(tab);

        System.out.println("Posortowana tablica");
        printArray(tab);
    }

    private static int[] getArray() {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy");
        size = scanner.nextInt();

        int[] tab = new int[size];
        for (int i = 0; i < tab.length; i++) {
            System.out.printf("Podaj %d# element tablicy:", i + 1);
            tab[i] = scanner.nextInt();
        }
        return tab;
    }

    private static void b_sort(int tab[]) {
        int zmiana = 1;
        while (zmiana > 0) {
            zmiana = 0;
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    int temp = tab[i + 1];
                    tab[i + 1] = tab[i];
                    tab[i] = temp;
                    zmiana++;
                }
            }
        }
    }

    private static void printArray(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }

}
