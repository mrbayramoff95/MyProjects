package lesson7.Clinic;

import java.util.Random;

public class TreatmentPlan {
    private int Doc;
    Random random = new Random();

    public TreatmentPlan() {
        this.Doc = random.nextInt(3);
    }

    public int getCode() {
        return Doc;
    }

    @Override
    public String toString() {
        return "TreatmentPlan{" + "code=" + Doc + '}';
    }
}
