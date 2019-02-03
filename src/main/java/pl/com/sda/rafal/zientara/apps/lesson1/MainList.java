package pl.com.sda.rafal.zientara.apps.lesson1;

import java.util.*;

public class MainList {

    public static void main(String[] args) {
        List<String> texts = new ArrayList<String>();
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

        //List<String> texts = new ArrayList<String>();
        System.out.println("Moja lista:");
        for (String tex : texts) {//foreach
            System.out.println(tex + " hashset:" + tex.hashCode());
        }
    }
}
