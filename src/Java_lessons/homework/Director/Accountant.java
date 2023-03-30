package Java_lessons.homework.Director;

public class Accountant implements Position {
    private String name;
    private int age;
    private String specialization;

    public Accountant(String name, int age, String specialization) {
        this.name = name;
        this.age = age;
        this.specialization = specialization;
    }

    public void sayHello() {
        System.out.println("Здравствуйте, Галина Ивановна.");
    }

    public void printPosition() {
        System.out.println("Position: Бухгалтер");
    }

    // Геттеры и сеттеры для полей класса
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}