package Java_lessons.lesson10.homework;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку с произвольными словами: ");
        String inputString = scanner.nextLine();

        String[] words = inputString.split("\\s+");

        String minUniqueWord = "";
        int minUniqueChars = Integer.MAX_VALUE;

        for (String word : words) {
            int uniqueChars = getUniqueCharsCount(word);
            if (uniqueChars < minUniqueChars) {
                minUniqueChars = uniqueChars;
                minUniqueWord = word;
            }
        }

        System.out.println("Слово с минимальным числом символов: " + minUniqueWord);
    }

    private static int getUniqueCharsCount(String word) {
        String uniqueChars = "";
        for (char c : word.toCharArray()) {
            if (word.indexOf(c) == word.lastIndexOf(c)) {
                uniqueChars += c;
            }
        }
        return uniqueChars.length();
    }
}
