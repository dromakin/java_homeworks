package homework2;

import homework2.tasks.task1.Task1;
import homework2.tasks.task2.task21.Task21;
import homework2.tasks.task2.task22.Task22;
import homework2.tasks.task2.task23.Task23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework2 {
    public static void run() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            System.out.println("Введите номер задачи (1, 2, 3, 4) или напишите end:");
            String str = reader.readLine();

            if (!str.equals("end")) {
                switch (str) {
                    case "1":
                        Task1.task1();
                        break;

                    case "2":
                        Task21.task21();
                        break;

                    case "3":
                        Task22.task22();
                        break;


                    case "4":
                        Task23.task23();
                        break;

                    default:
                        System.out.println("1 or 2 or 3 or 4");
                }
            } else {
                break;
            }
        }
    }
}

