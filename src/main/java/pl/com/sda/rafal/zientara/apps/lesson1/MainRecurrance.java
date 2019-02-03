package pl.com.sda.rafal.zientara.apps.lesson1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainRecurrance {

    public static void main(String[] args) {
        int wow = silnia(1);
        System.out.println();
        System.out.println(wow);

        try {
            openFile("E:\\test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<File> findTextFiles(String filePath) {
        List<File> foundFiles = new ArrayList<File>();

        File file = new File(filePath);
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            //tod rekurencja aby znalezc wszystko w podfolderach
            for (File f : files) {
                if (f.getName().endsWith("txt")) ;
                foundFiles.add(f);
            }
        }
        return foundFiles;
    }

    public static void openFile(String filePath) throws IOException {
        File file = new File(filePath);
        file.createNewFile();
    }


    public static int silnia(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Nie ma takiej silnii!");
        }
        if (value <= 1) {
            System.out.print(value);
            return 1;
        } else {
            System.out.print(value + " * ");
            return value * silnia(value - 1);
        }
    }

    private static int power(int value, int pow) {
        int result = 1;
        for (int i = 0; i < pow; i++) {
            result = value * result;
        }
        return result;
    }
}
