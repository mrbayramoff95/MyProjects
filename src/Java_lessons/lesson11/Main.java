package Java_lessons.lesson11;

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

        List<GroupMark> groupMarks = new ArrayList<>();

        for (int i = 0; i < students.size(); i++) {
            GroupMark groupMark = getByGroup(groupMarks, students.get(i).getGroup());
            if (groupMark == null) {
                GroupMark newGroupMark = new GroupMark(students.get(i).getGroup(), 1, students.get(i).getMark());
                groupMarks.add(newGroupMark);
            } else {
                int currentAmount = groupMark.getStudentsAmount();
                float currentMark = groupMark.getMarkSum();
                groupMark.setStudentsAmount(currentAmount + 1);
                groupMark.setMarkSum(currentMark + students.get(i).getMark());
            }
        }

        float minAvg = Float.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < groupMarks.size(); i++) {
            float currentAvg = groupMarks.get(i).getMarkSum() / groupMarks.get(i).getStudentsAmount();
            if (currentAvg < minAvg) {
                minAvg = currentAvg;
                minIndex = i;
            }
        }

        String minGroup = groupMarks.get(minIndex).getGroup();

        for (Student student : students) {
            if (student.getGroup().equals(minGroup)) {
                System.out.println(student);
            }
        }
    }

    private static GroupMark getByGroup(List<GroupMark> groupMarks, String group) {
        for (GroupMark groupMark : groupMarks) {
            if (groupMark.getGroup().equals(group)) {
                return groupMark;
            }
        }
        return null;
    }
}