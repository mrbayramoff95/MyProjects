package Java_lessons.lesson10;

import java.util.Scanner;

public class Practice_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();

        String[] strings = new String[n];
        int sumLength = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            strings[i] = scanner.next();
            sumLength += strings[i].length();
        }

        int averageLength = sumLength / n;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (strings[i].length() > averageLength) {
                result.append(strings[i]).append(" (").append(strings[i].length()).append(")\n");
            }
        }

        System.out.println("Строки, длина которых больше средней: ");
        System.out.println(result.toString());

        scanner.close();
    }
}

