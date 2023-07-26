package Java_lessons.lesson6;

import java.util.Arrays;

public class Student {
    private String name;
    private String group;
    private double diplomaAssessment;

    public Student(String name, String group, double diplomaAssessment) {
        this.name = name;
        this.group = group;
        this.diplomaAssessment = diplomaAssessment;
    }
    public Student() {

    }

    public static void main(String[] args) {
        Student[] students = new Student[14];

        for (int i = 0; i < students.length; i++) {
            String name = "Student " + (i+1);
            String group = "Group " + ((i%2) + 1);
            double diplomaAssessment = Math.random() * 10;
            students[i] = new Student(name, group, diplomaAssessment);
            System.out.println(students[i].name);
        }
        System.out.println(Arrays.toString(students));
    }
}

