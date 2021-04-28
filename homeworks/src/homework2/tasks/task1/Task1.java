package homework2.tasks.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task1 {

    public static void task1() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Возможные режимы:\n").append(Arrays.toString(TrimString.values())).append("\nExit - end\n").append("Введите режим:");

        while (true) {
            System.out.println(stringBuilder.toString());
            String str = reader.readLine();

            if (!str.equals("end")) {
                switch (str) {
                    case "EXTRASPACE":
                        System.out.println("Введите текст:");
                        System.out.println("Лишние пробелы удалены: " +
                                reader.readLine().replaceAll(TrimString.EXTRASPACE.getRegexp(), "$1"));
                        break;

                    case "ALLSPACES":
                        System.out.println("Введите текст:");
                        System.out.println("Все пробелы удалены: " +
                                reader.readLine().replaceAll(TrimString.ALLSPACES.getRegexp(), ""));
                        break;

                    case "NOTEXT":
                        System.out.println("Введите текст:");
                        System.out.println("Все буквы удалены: " +
                                reader.readLine().replaceAll(TrimString.NOTEXT.getRegexp(), ""));
                        break;

                    case "NODIGITS":
                        System.out.println("Введите текст:");
                        System.out.println("Все цифры удалены: " +
                                reader.readLine().replaceAll(TrimString.NODIGITS.getRegexp(), ""));
                        break;

                    case "PUNCTUATION":
                        System.out.println("Введите текст:");
                        System.out.println("Вся пунктуация удалена: " +
                                reader.readLine().replaceAll(TrimString.PUNCTUATION.getRegexp(), ""));
                        break;

                    default:
                        System.out.println("See instructions:");
                }
                System.out.println();
            } else {
                break;
            }
        }
    }
}
