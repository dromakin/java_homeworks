package homework1.tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class Task1 {

    public static void task1(BufferedReader reader) {
        try {
            System.out.println("Введите радиус окружности в сантиметрах:");
            double r = Double.parseDouble(reader.readLine());
            System.out.println("Площадь круга: " + String.format("%.2f", (Math.PI * Math.pow(r, 2))) + " см.кв.");
            System.out.println("Длина окружности: " + String.format("%.2f", (2 * Math.PI * r)) + " см.");
        } catch (IOException ex) {
            // pass
        }
    }
}
