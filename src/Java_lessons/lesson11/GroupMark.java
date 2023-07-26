package Java_lessons.lesson11;

public class GroupMark {
    private String group;
    private int studentsAmount;
    private float markSum;

    public GroupMark() {
    }

    public GroupMark(String group, int studentsAmount, float markSum) {
        this.group = group;
        this.studentsAmount = studentsAmount;
        this.markSum = markSum;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getStudentsAmount() {
        return studentsAmount;
    }

    public void setStudentsAmount(int studentsAmount) {
        this.studentsAmount = studentsAmount;
    }

    public float getMarkSum() {
        return markSum;
    }

    public void setMarkSum(float markSum) {
        this.markSum = markSum;
    }

    @Override
    public String toString() {
        return "GroupMark{" +
                "group='" + group + '\'' +
                ", studentsAmount=" + studentsAmount +
                ", markSum=" + markSum +
                '}';
    }
}
