package pl.com.sda.rafal.zientara.apps.lesson1.search;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainLider {

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 2, 2, 1, 6, 2};
        Map<Integer, Integer> lidersMap = new HashMap<Integer, Integer>();
        //Map<key, value>

        for (int i = 0; i < input.length; i++) {
            int current = input[i];
            if (!lidersMap.containsKey(current)) {
                //pierwsze wystapienie klucza
                lidersMap.put(current, 1);
            } else {
                //nastepne wystapienie klucza
                int count = lidersMap.get(current);//pobierz value
                count++;
                lidersMap.put(current, count);
            }
        }

        //todo znajdz max w mapie
        int currentMax = -1;
        int currentMaxKey = -1;
        for(Map.Entry<Integer, Integer> entry : lidersMap.entrySet()) {

        }

        //todo sprawdz czy max jest liderem (wystepuje ponad 1/2 razy)
        //SDA Algorytmy i struktury danych.pdf slajd 15

        for(Map.Entry<Integer, Integer> entry : lidersMap.entrySet()) {
            System.out.println("K="  + entry.getKey() + " V=" + entry.getValue());
        }
    }
}
