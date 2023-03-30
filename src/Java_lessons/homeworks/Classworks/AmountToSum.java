package Java_lessons.homeworks.Classworks;

import java.util.Objects;

public class AmountToSum {
    private int studentsAmount;
    private float markSum;

    public AmountToSum() {
    }

    public AmountToSum(int studentsAmount, float markSum) {
        this.studentsAmount = studentsAmount;
        this.markSum = markSum;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AmountToSum that = (AmountToSum) o;
        return studentsAmount == that.studentsAmount && Float.compare(that.markSum, markSum) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentsAmount, markSum);
    }
}