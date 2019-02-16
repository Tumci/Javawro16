package pl.com.sda.rafal.zientara.apps.lesson1;

public class MainPrime {

    public static void main(String[] args) {
        int p = 18;
        System.out.println("Sprawdzam " + p);
        boolean isPrime = isPrime(p);
        System.out.println(isPrime);

//        Integer.MAX_VALUE;
//        Float.MAX_VALUE;
//        Long.MAX_VALUE
    }

    public static boolean isPrime(int p) {
        //sprawdzamy pierwszy warunek
        if (p <= 1) {
            return false;
        }
        //todo co robiæ? D:
        //sprawdzamy podzielniki od 2 do p - 1
        for (int i = 2; i < p ; i++) {
            if (p % i == 0) {
                System.out.println("Liczba " + p + " jest podzielna przez " + i);
                return false;
            }
        }
        return true;
    }
}
