package lesson13.Classwork;

import lesson11.Student;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<Student> students = initCollection();

        long number = students.stream()
                .filter(student -> {
                    System.out.println("Filter 1 " + student.getName());
                    return student.getMark() > 6f;
                })
                .filter(student -> {
                    System.out.println("Filter 2 " + student.getName());
                    return student.getMark() > 7f;
                })
                .filter(student -> {
                    System.out.println("Filter 3 " + student.getName());
                    return student.getMark() > 8f;
                })
                .count();
        System.out.println(number);
    }


    public static List<Student> initCollection() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Slava", "01", 8f));
        students.add(new Student("Roman", "01", 7f));
        students.add(new Student("Angelina", "02", 5f));
        students.add(new Student("Dmitry", "02", 7f));
        students.add(new Student("Ivan", "02", 4f));
        students.add(new Student("Sasha", "03", 9f));
        return students;
    }
}
