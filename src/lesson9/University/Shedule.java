package lesson9.University;

import java.util.Date;

class Schedule {
    private Date date;
    private Student student;
    private Teacher teacher;
    private Subject subject;

    public Schedule(Date date, Student student, Teacher teacher, Subject subject) {
        this.date = date;
        this.student = student;
        this.teacher = teacher;
        this.subject = subject;
    }

    public Date getDate() {
        return date;
    }

    public Student getStudent() {
        return student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Subject getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "date=" + date +
                ", student=" + student +
                ", teacher=" + teacher +
                ", subject=" + subject +
                '}';
    }
}
