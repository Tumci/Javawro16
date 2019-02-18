package pl.com.sda.rafal.zientara.apps.lesson2.search;

public class MainSearch {

    public static void main(String[] args) {
        int[] input = new int[]{2, 4, 6, 7, 8, 10, 11};
        int leftIndex = 0;
        int rightIndex = input.length - 1;
        int currentIndex;

        int wantedNumber = 2;
        while (true) {
            System.out.println();
            currentIndex = (leftIndex + rightIndex) / 2;
            int currentData = input[currentIndex];
            if (currentData == wantedNumber) {
                System.out.println("Wow znalazlem! index:" + currentIndex);
                break;
            } else if (currentData > wantedNumber) {
                rightIndex = currentIndex;
            } else {
                leftIndex = currentIndex;
            }
            System.out.println("Szukamy dalej");
            System.out.println("left:" + leftIndex);
            System.out.println("right:" + rightIndex);
            if (leftIndex + 1 == rightIndex) {
                currentData = input[leftIndex];
                if (currentData == wantedNumber) {
                    System.out.println("Wow znalazlem! index:" + leftIndex);
                    break;
                }
                currentData = input[rightIndex];
                if (currentData == wantedNumber) {
                    System.out.println("Wow znalazlem! index:" + rightIndex);
                    break;
                }
                System.out.println("Nie znaleziono liczby");
                break;
            }

        }
    }
}
