package com.dromakin.starter;

import com.dromakin.tasks.Task1;
import com.dromakin.tasks.Task2_1;
import com.dromakin.tasks.Task2_2;
import com.dromakin.tasks.Task2_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Starter {
    public static void main(String[] args) throws IOException {
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
                        Task2_1.task2_1();
                        break;

                    case "3":
                        Task2_2.task2_2();
                        break;


                    case "4":
                        Task2_3.task2_3();
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

