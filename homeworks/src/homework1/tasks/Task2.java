package homework1.tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class Task2 {
    public static int days = 0;
    public static int hours = 0;
    public static int minutes = 0;

    public static int sum_max = 0;
    public static int sum_min = 0;

    public static int getSumTime(int _days, int _hours, int _minutes) {
        return 24 * _days * 3600 + _hours * 3600 + _minutes * 60;
    }

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

            int sum = Task2.getSumTime(local_d, local_h, local_m);
            if (sum >= sum_max) {
                sum_max = sum;
            } else if (sum <= sum_min) {
                sum_min = sum;
            }

            System.out.println("Для выхода напишите end, а для дальнейшей записи - enter:");
            String stop = reader.readLine();

            if (stop.equals("end")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Всего потребуется: ").append(Task2.getSumTime(days, hours, minutes));
                stringBuilder.append("\nСамая продолжительная задача займет: ").append(sum_max);
                stringBuilder.append("\nСамая короткая задача займет: ").append(sum_min);
                System.out.println(stringBuilder.toString());
            } else {
                task2(reader);
            }
        } catch (IOException ex) {
            // pass
        }
    }
}
