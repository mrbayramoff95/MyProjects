package Java_lessons.homeworks.Classworks;

import Java_lessons.lesson11.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Slava", "01", 8f));
        students.add(new Student("Roman", "01", 7f));
        students.add(new Student("Angelina", "02", 5f));
        students.add(new Student("Dmitry", "02", 7f));
        students.add(new Student("Ivan", "02", 4f));
        students.add(new Student("Sasha", "03", 9f));
        students.add(new Student("Sasha", "04", 3f));


        Map<String, AmountToSum> groupToMarksMap = new HashMap<>();

        for (int i = 0; i < students.size(); i++) {
            String currentGroup = students.get(i).getGroup();
            AmountToSum value = groupToMarksMap.get(currentGroup);
            if (value == null) {
                AmountToSum newValue = new AmountToSum(1, students.get(i).getMark());
                groupToMarksMap.put(currentGroup, newValue);
            } else {
                int currentAmount = value.getStudentsAmount();
                float currentMark = value.getMarkSum();
                value.setStudentsAmount(currentAmount + 1);
                value.setMarkSum(currentMark + students.get(i).getMark());
            }
        }

        Map<String, Float> groupToAvgMap = new HashMap<>();

        Set<Map.Entry<String, AmountToSum>> groupToMarksSet = groupToMarksMap.entrySet();

        for (Map.Entry<String, AmountToSum> entry : groupToMarksSet) {
            String key = entry.getKey();
            Float value = entry.getValue().getMarkSum() / entry.getValue().getStudentsAmount();
            groupToAvgMap.put(key, value);
        }

        Map.Entry<String, Float> minGroup = null;
        for (Map.Entry<String, Float> entry : groupToAvgMap.entrySet()) {
            if (minGroup == null) {
                minGroup = entry;
            }
            if (entry.getValue() < minGroup.getValue()) {
                minGroup = entry;
            }
        }

        for (Student student : students) {
            if (student.getGroup().equals(minGroup.getKey())) {
                System.out.println(student);
            }
        }
    }
}