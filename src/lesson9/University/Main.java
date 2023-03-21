package lesson9.University;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John");
        Student student2 = new Student("Alice");

        Teacher teacher1 = new Teacher("Prof. Smith");
        Teacher teacher2 = new Teacher("Mrs. Johnson");

        Subject subject1 = new Subject("Math");
        Subject subject2 = new Subject("English");

        Schedule schedule1 = new Schedule(new Date(), student1, teacher1, subject1);
        Schedule schedule2 = new Schedule(new Date(), student2, teacher2, subject2);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);

        List<Subject> subjects = new ArrayList<>();
        subjects.add(subject1);
        subjects.add(subject2);

        List<Schedule> schedules = new ArrayList<>();
        schedules.add(schedule1);
        schedules.add(schedule2);

        University university = new University(students, teachers, subjects, schedules);

        List<Schedule> timetable = university.getTimetable("John", new Date());

        System.out.println("Timetable for John:");
        for (Schedule schedule : timetable) {
            System.out.println(schedule);
        }
    }
}