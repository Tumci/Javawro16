package pl.com.sda.rafal.zientara.apps.lesson1.search;

public class MainSearch {

    public static void main(String[] args) {
        int[] input = new int[]{1, 4, 78, 3};
        int wantedNumber = 1;
        int ouputIndex = getIndex(input, wantedNumber);
        System.out.println("output=" + ouputIndex);
    }

    private static int getIndex( int[] input, int wanted) {
        for (int i = 0; i < input.length; i++) {
            System.out.println("i=" + i);
            int current = input[i];
            System.out.println("current=" + current);
            if (wanted == input[i]) {
                return i;
            } else {
                System.out.println("To nie to");
            }
            System.out.println();
        }
        return -1;
    }
}
