import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static class Task1 {

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

    public static class Task2 {
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

    public static class Task3 {
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

    public static void starter() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            System.out.println("Введите номер задачи (1, 2, 3) или напишите end:");
            String str = reader.readLine();

            if (!str.equals("end")) {
                switch (str) {
                    case "1": {
                        Task1.task1(reader);
                        break;
                    }

                    case "2": {
                        Task2.task2(reader);
                        break;
                    }

                    case "3": {
                        Task3.task3(reader);
                        break;
                    }

                    default: {
                        System.out.println("1 or 2 or 3");
                    }
                }
            } else {

                break;
            }
        }
    }


    public static void main(String[] args) throws IOException {
        starter();
    }
}
