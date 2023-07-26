package Java_lessons.homework.Director;

public class Director implements Position {
    private String name;
    private int age;
    private String department;

    public Director(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public void sayHello() {
        System.out.println("Здраствуйте, Игорь Иванович.");
    }

    public void printPosition() {
        System.out.println("Position: Руководитель кампании");
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
