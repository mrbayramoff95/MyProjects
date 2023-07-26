package Java_lessons.lesson12Homeworks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Float> studentsMap = new HashMap<>();

        while (true) {
            System.out.println("""
                    1) Добавить студента
                    2) Вывести всех
                    3) Вывести количество студентов
                    4) Вывести на экран худшего студента
                    else - выход
                    """);
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Ввести имя студента и оценку: ");
                    studentsMap.put(scanner.next(), scanner.nextFloat());
                    break;
                case 2:
                    System.out.println(studentsMap);
                    break;
                case 3:
                    System.out.println(studentsMap.size());
                    break;
                case 4:
                    String minStudent = studentsMap.keySet().iterator().next();
                    for (Map.Entry<String, Float> student : studentsMap.entrySet()) {
                        if (student.getValue() < studentsMap.get(minStudent)) {
                            minStudent = student.getKey();
                        }
                    }
                    System.out.println(minStudent + " - " + studentsMap.get(minStudent));
                    break;
                default:
                    return;
            }
        }
    }
}