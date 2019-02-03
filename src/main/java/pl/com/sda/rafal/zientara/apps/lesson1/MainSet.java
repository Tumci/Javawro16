package pl.com.sda.rafal.zientara.apps.lesson1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainSet {

    public static void main(String[] args) {
        Set<String> texts = new HashSet<String>();
        Scanner scanner = new Scanner(System.in);
        //todo pêtla programu
        String output;
        System.out.println("Podaj text! :)");
        do {
            //nasz text!! :D (z konsoli)
            output = scanner.nextLine();
            if (output.equals("exit")) {
                break;
            }
            texts.add(output);
        } while(true);

        System.out.println("Moja lista:");
        for (String text : texts) {//foreach
            System.out.println(text + " hashset:" + text.hashCode());
        }
    }
}
