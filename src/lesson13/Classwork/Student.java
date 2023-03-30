package lesson13.Classwork;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private List<Float> marks;

    public Student() {
        marks = new ArrayList<>();
    }

    public Student(String name, String group, List<Float> marks) {
        this.name = name;
        this.group = group;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public List<Float> getMarks() {
        return marks;
    }

    public void setMarks(List<Float> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
