package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static int days = 0;
    public static int hours = 0;
    public static int minutes = 0;

    public static int sum_max = 0;
    public static int sum_min = 0;

    public static void task2(BufferedReader reader) {

        try {
            System.out.println("Введите название задачи:");
            String name = reader.readLine();

            System.out.println("Сколько дней потребуется на выполнение?");
            int local_d = Integer.parseInt(reader.readLine());
            days += local_d;

            System.out.println("Сколько часов?");
            int local_h = Integer.parseInt(reader.readLine());
            hours += local_h;

            System.out.println("Сколько минут?");
            int local_m = Integer.parseInt(reader.readLine());
            minutes += local_m;

            int sum = 24 * local_d * 3600 + local_h * 3600 + local_m * 60;
            if (sum >= sum_max) {
                sum_max = sum;
            } else if (sum <= sum_min) {
                sum_min = sum;
            }

            System.out.println("Для выхода напишите end, а для дальнейшей записи - enter:");
            String stop = reader.readLine();



            if (stop.equals("end")) {
                System.out.println("Всего потребуется: " + (24 * days * 3600 + hours * 3600 + minutes * 60));
                System.out.println("Самая продолжительная задача займет: " + sum_max);
                System.out.println("Самая короткая задача займет: " + sum_min);
            } else {
                task2(reader);
            }
        } catch (IOException ex) {
            // pass
        }
    }
}
