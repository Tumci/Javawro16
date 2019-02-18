package pl.com.sda.rafal.zientara.apps.lesson2.sorting;

public class MainSort {

    public static void main(String[] args) {
//        int[] input = {6, 3, 6, 1, 4, 9, 0, 1, 8, 2, 6, 4, 9, 3, 7, 5, 9, 2, 7, 3, 2, 4, 1, 8, 7, 0, 8, 5, 8, 3, 6, 2, 5, 3};
        int[] input = {2, 1, 2, 0, 2, 2, 0, 0, 1, 1};
        int[] output = new int[input.length];

        int[] elementsCount = new int[3];

        for (int value : input) {
            elementsCount[value]++;
        }

        for (int i = 0; i < elementsCount.length; i++) {
            System.out.println(i + " wyst¹pi³o " + elementsCount[i] + " razy");
        }
        // 0 1 2 3 4 5 6 7 8 9
        // 0 0 0 1 1 1 2 2 2 2
        int currentIndex = 0;
        for (int i = 0; i < elementsCount.length; i++) {
            int count = elementsCount[i];
            System.out.println(count);
            for (int j = 0; j < count; j++) {
                output[currentIndex] = i;
                currentIndex++;
            }
        }

        for(int value : output) {
            System.out.print(value + " ");
        }


    }
}
