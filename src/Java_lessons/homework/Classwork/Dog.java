package Java_lessons.homework.Classwork;

import java.math.BigDecimal;
import java.util.Calendar;

public class Dog extends Animal{
    private BigDecimal weight;

    public Dog() {
    }

    public Dog(int animal_id, String name, Calendar birthday, BigDecimal weight) {
        super(animal_id, name, birthday);
        this.weight = weight;
    }

    @Override
    public void move() {
        System.out.println("The dog ran");
    }

    @Override
    public String toString() {
        return "Dog {" + "weight=" + weight + "} " + super.toString();
    }
}