package pl.com.sda.rafal.zientara.apps.lesson2.search;

public class Bubble {
    public static void main(String[] args) {
        int[] input = new int[]{5, 1, 2, 3, 4};
//        int[] input = new int[]{5, 4, 3, 2, 1};
        int steps = sort(input);

        for (int lol : input) {
            System.out.print(lol + " ");
        }
        System.out.println("\n\nSorted in " + steps + " steps");
    }

    private static int sort(int[] input) {
        int steps = 0;

        for (int j = 0; j < input.length - 1; j++) {
            // optymalizacja 1 (-j)
            // po obiegu wiemy ze jedna liczba najwiesza przeszla na prawo - nie trzeba znowu sprawdzac

            int noSwitches = 0;
            for (int i = 0; i < input.length - 1 - j; i++) {
                if (input[i] > input[i + 1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                } else {
                    noSwitches++;
                }
                steps++;
            }

            //optymalizacja 2
            //w tym obiegu nie bylo zamian - wszystko gotowe
            //optymalizacja 3
            // -j
            if (noSwitches == input.length - 1 - j) {
                return steps;
            }
        }
        return steps;
    }
}
