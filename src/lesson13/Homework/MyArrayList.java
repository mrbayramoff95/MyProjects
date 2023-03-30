package lesson13.Homework;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random() * 20) + 1);
        }

        list = (ArrayList<Integer>) list.stream()
                .distinct()
                .collect(Collectors.toList());

        list.stream()
                .filter(x -> x >= 7 && x <= 17 && x % 2 == 0)
                .forEach(System.out::println);

        list = (ArrayList<Integer>) list.stream()
                .map(x -> x * 2)
                .collect(Collectors.toList());

        list.stream()
                .sorted()
                .limit(4)
                .forEach(System.out::println);

        System.out.println("Количество элементов: " + list.size());

        double average = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
        System.out.println("Среднее арифметическое: " + average);
    }
}
