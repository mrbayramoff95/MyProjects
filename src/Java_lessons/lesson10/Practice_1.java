package Java_lessons.lesson10;

import java.util.Scanner;

public class Practice_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String shortest = "";
        String longest = "";
        int shortestLength = Integer.MAX_VALUE;
        int longestLength = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Введите строку #" + (i + 1) + ": ");
            String line = scanner.nextLine();
            if (line.length() < shortestLength) {
                shortest = line;
                shortestLength = line.length();
            }
            if (line.length() > longestLength) {
                longest = line;
                longestLength = line.length();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Самая короткая строка: ").append(shortest).append(" (длина: ").append(shortestLength).append(")\n");
        sb.append("Самая длинная строка: ").append(longest).append(" (длина: ").append(longestLength).append(")\n");
        System.out.println(sb);
    }
}
