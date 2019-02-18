package pl.com.sda.rafal.zientara.apps.lesson1.homework;

public class Zad2 {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};

        double median = getMedian(values);
        System.out.println("Mediana:" + median);
    }

    private static double getMedian(int[] values) {
        if (values.length % 2 == 1) {//nieparzysta liczba elementow
            return values[values.length / 2];
        } else {
            return getMedianForEvenElements(values);
        }
    }

    private static double getMedianForEvenElements(int[] values) {
        int rightIndex = values.length / 2;
        int leftIndex = rightIndex - 1;
        double left = values[leftIndex];
        double right = values[rightIndex];
        return (left + right) / 2;
    }
}
