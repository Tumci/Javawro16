package pl.com.sda.rafal.zientara.apps.lesson3;

public class MainChars {
    private static final int DELTA = 90 - 65 + 1;

    public static void main(String[] args) {
        String input = "Ale zabawa Julian!";
        char firstCharacter = input.charAt(0);
        StringBuilder cezar = new StringBuilder(input.length());//Doh Cdedzd M......!
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            letter = encryptCesar(letter);
            cezar.append(letter);
        }

        System.out.println(90 - 65 + 1);
        System.out.println(122 - 97 + 1);

//        String text = "text " + 10 + 'Z';

        System.out.println(cezar);
    }

    public static char encryptCesar(char c) {
        if (isBigLetter(c)) {
            c += 3;//szyfrowanie
            if (c > 90) {//poprawki
                c -= DELTA;
            }
        } else if (isSmallLetter(c)) {
            c += 3;
            if (c > 122) {
                c -= DELTA;
            }
        }
        return c;
    }

    private static boolean isBigLetter(char c) {
        return c >= 65 && c <= 90;
    }

    private static boolean isSmallLetter(char tempChar) {
        return tempChar >= 97 && tempChar <= 122;
    }

    public static void printChar(char c) {
        System.out.println((int) c + " = " + c);
    }

    /*
    65 = A
    90 = Z

    97 = a
    122 = z
     */
}
