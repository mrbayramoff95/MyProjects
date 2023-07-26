package Java_lessons.lesson8.homeworks.task3;

import java.util.Date;

public abstract class Contract {
    private int numberOfDocument;
    private Date dataOfDocument;

    public Contract() {
    }

    public Contract(int numberOfDocument, Date dataOfDocument) {
        this.numberOfDocument = numberOfDocument;
        this.dataOfDocument = dataOfDocument;
    }

    @Override
    public String toString() {
        return "Номер документа: " + numberOfDocument +
                "\nДата документа: " + dataOfDocument +
                '}';
    }

    public abstract void print();
}
