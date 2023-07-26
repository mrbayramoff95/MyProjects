package Java_lessons.lesson12Homeworks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");

        String inputString = scanner.next();
        Map<Character, Integer> symbols = new HashMap<>();

        for (int i = 0; i < inputString.length(); i++)
        {
            if (symbols.containsKey(inputString.charAt(i)))
            {
                symbols.put(inputString.charAt(i), symbols.get(inputString.charAt(i)) + 1);
            }
            else
            {
                symbols.put(inputString.charAt(i), 1);
            }
        }
        System.out.println(symbols);
    }
}
