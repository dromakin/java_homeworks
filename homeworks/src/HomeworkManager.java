import homework1.Homework1;
import homework2.Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HomeworkManager {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            System.out.println("Введите номер домашнего задания (1, 2) или напишите end:");
            String str = reader.readLine();

            if (!str.equals("end")) {
                switch (str) {
                    case "1":
                        Homework1.run();
                        break;

                    case "2":
                        Homework2.run();
                        break;

                    default:
                        System.out.println("1 or 2");
                }
            } else {

                break;
            }
        }
    }
}
