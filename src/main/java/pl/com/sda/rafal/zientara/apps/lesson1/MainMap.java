package pl.com.sda.rafal.zientara.apps.lesson1;

import java.util.*;

public class MainMap {

    public static void main(String[] args) {
        Map<Integer, String> texts = new HashMap<Integer, String>();
        Scanner scanner = new Scanner(System.in);
        //todo pêtla programu
        String output;
        int count = 1;
        System.out.println("Podaj text! :)");
        do {
            //nasz text!! :D (z konsoli)
            output = scanner.nextLine();
            if (output.equals("exit")) {
                break;
            }
            texts.put(count, output);
            count++;
        } while (true);

        System.out.println("Moja lista:");
        /*for (String text : texts) {//foreach
            System.out.println(text + " hashset:" + text.hashCode());
        }*/
    }
}
