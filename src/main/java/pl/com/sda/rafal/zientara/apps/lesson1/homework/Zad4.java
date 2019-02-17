package pl.com.sda.rafal.zientara.apps.lesson1.homework;

public class Zad4 {

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 4, 5, 6, 7, 9, 10, 3, 5, 6, 7, 9, 1, 2};
        double average = getAvg(input);

        //Print table average. %.2f for 2 decimal places
        System.out.println(String.format("Input table average: %.2f", average));
//        System.out.printf("Input table average: %.2f", average);

    }

    private static double getAvg(int[] input) {
        int sum = 0;
        int count = input.length;
        for (int i = 0; i < count; i++) {
            sum = sum + input[i];
//            sum += input[i];
//            count = count + 1;
//            count++;
        }
        return (double) sum / count;
    }
}
