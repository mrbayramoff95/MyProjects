package Java_lessons.lesson6;

import java.util.Random;

public class StudentClassRandom {
    private String group;
    private int grade;

    public StudentClassRandom(String group) {
        this.group = group;
        Random random = new Random();
        this.grade = random.nextInt(11);
    }
    public class Main {

        public static void main(String[] args) {
            String group = "Class A";
            for (int i = 1; i <= 5; i++) {
                System.out.println("Student " + i + " - Group: ");
            }
        }
    }
}
