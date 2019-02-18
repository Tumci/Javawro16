package pl.com.sda.rafal.zientara.apps.lesson1.homework;

public class Zad5Max {

    public static void main(String[] args) {
//        max1();

        int[] ints = new int[0];
        findMax(ints);
    }

    private static void max1() {
        int[] input = new int[]{10, 3, 1, 45, 21, 12, 67, 101, 1, 4, 9, 4, 102};
        System.out.println("Table length: " + input.length);

        int max = -1;

        for (int i = 0; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }
        }

        System.out.println("Maximum value in input table is: " + max);
    }


    public static int findMax(int[] array) {
        if (array.length == 0) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
//        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        return max;
    }
}
