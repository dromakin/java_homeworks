package homework1.tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class Task3 {
    public static void task3(BufferedReader reader) {

        try {
            System.out.println("Введите год в формате \"yyyy\"");
            int year = Integer.parseInt(reader.readLine());

            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                System.out.println("Количество дней 366.");
            } else {
                System.out.println("Количество дней 365.");
            }
        } catch (IOException ex) {
            // pass
        }

    }
}
