package Java_lessons.homework.Classwork;

import java.util.Calendar;

public class Cat extends Animal{
    private String  eyesColor;

    public Cat() {
    }

    public Cat(int animal_id, String name, Calendar birthday, String eyesColor) {
        super(animal_id, name, birthday);
        this.eyesColor = eyesColor;
    }

    @Override
    public void move() {
        System.out.println("The cat ran");
    }

    @Override
    public String toString() {
        return "Cat {" + "eyesColor='" + eyesColor + '\'' + "} " + super.toString();
    }
}