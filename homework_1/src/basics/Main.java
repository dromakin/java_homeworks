package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            System.out.println("Введите номер задачи (1, 2, 3) или напишите end:");
            String str = reader.readLine();

            if (!str.equals("end")) {
                switch (str) {
                    case "1":
                        Task1.task1(reader);
                        break;

                    case "2":
                        Task2.task2(reader);
                        break;

                    case "3":
                        Task3.task3(reader);
                        break;

                    default:
                        System.out.println("1 or 2 or 3");
                }
            } else {

                break;
            }
        }
    }
}
