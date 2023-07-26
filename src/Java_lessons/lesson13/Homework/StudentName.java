package Java_lessons.lesson13.Homework;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StudentName {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Ivan");
        students.add("Anya");
        students.add("Masha");
        students.add("Alina");
        students.add("Boris");
        students.add("Alisa");
        students.add("Dima");

        String myName = "Alisa";
        long count = students.stream()
                .filter(name -> name.equalsIgnoreCase(myName))
                .count();
        System.out.println("Количество людей с именем " + myName + ": " + count);

        char firstLetter = 'A';
        ArrayList<String> startsWithA = students.stream()
                .filter(name -> name.toLowerCase().startsWith(String.valueOf(firstLetter).toLowerCase()))
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Имена, начинающиеся с буквы " + firstLetter + ": " + startsWithA);

        String firstElement = students.stream()
                .sorted()
                .findFirst()
                .orElse("Empty");
        System.out.println("Первый элемент коллекции: " + firstElement);
    }
}
