package Java_lessons.lesson12Homeworks;

import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите количество:");
        Map<Integer, Integer> numbers = new ConcurrentHashMap<>();
        int countOfNumbers = scanner.nextInt();

        for (int i = 0; i < countOfNumbers; ) {
            System.out.println("Введите " + (i + 1) + " число:");
            int newNumber = scanner.nextInt();
            if (numbers.containsKey(newNumber)) {
                System.out.println("Введите число еще раз");
            } else {
                numbers.put(newNumber, i);
                i++;
            }

        }

        System.out.println("Введите сумму: ");
        int sum = scanner.nextInt();

        for (Map.Entry<Integer, Integer> keys : numbers.entrySet()) {
            for (Map.Entry<Integer, Integer> keysValue : numbers.entrySet()) {
                if (keys.getKey() + keysValue.getKey() == sum) {
                    System.out.println(keys.getKey() + " + " + keysValue.getKey());
                }
            }
            numbers.remove(keys.getKey());
        }
    }
}
