package generics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    static String extraTrim(String input) {
        return input.replaceAll("^ +| +$|( )+", "$1");
    }

    public static void main(String[] args) {
//        task1();
    }

    public static void task1() throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите текст:");
            System.out.println("Пробелы удалены:" + extraTrim(reader.readLine()));
        } catch (IOException ex) {
            // pass
        }
    }
}
