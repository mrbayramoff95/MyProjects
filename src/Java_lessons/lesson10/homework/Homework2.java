package Java_lessons.lesson10.homework;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку с произвольными словами: ");
        String str = scanner.nextLine();
        scanner.close();

        String[] words = str.split("\\s+");

        String shortest = words[0];
        String longest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
            if (word.length() >= longest.length()) {
                longest = word;
            }
        }

        System.out.println("Самое короткое слово: " + shortest);
        System.out.println("Самое длинное слово: " + longest);
    }
}
