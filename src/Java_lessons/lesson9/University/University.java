package Java_lessons.lesson9.University;

import java.util.*;

class University {
    private List<Student> students;
    private List<Teacher> teachers;
    private List<Subject> subjects;
    private List<Schedule> schedules;

    public University(List<Student> students,
                      List<Teacher> teachers,
                      List<Subject> subjects,
                      List<Schedule> schedules)
    {
        this.students = students;
        this.teachers = teachers;
        this.subjects = subjects;
        this.schedules = schedules;
    }

    public List<Schedule> getTimetable(String studentName, Date date) {
        List<Schedule> result = new ArrayList<>();
        for (Schedule schedule : schedules) {
            if (schedule.getDate().equals(date) && schedule.getStudent().getName().equals(studentName)) {
                result.add(schedule);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John"));
        students.add(new Student("Jane"));

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Dr. Smith"));
        teachers.add(new Teacher("Prof. Brown"));

        List<Subject> subjects = new ArrayList<>();
        subjects.add(new Subject("Math"));
        subjects.add(new Subject("English"));

        List<Schedule> schedules = new ArrayList<>();
        schedules.add(new Schedule(new Date(), students.get(0), teachers.get(0), subjects.get(0)));
        schedules.add(new Schedule(new Date(), students.get(1), teachers.get(1), subjects.get(1)));

        University university = new University(students, teachers, subjects, schedules);
        List<Schedule> timetable = university.getTimetable("John", new Date());
        for (Schedule schedule : timetable) {
            System.out.println(schedule);
        }
    }
}