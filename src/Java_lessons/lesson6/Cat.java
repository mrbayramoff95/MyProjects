package Java_lessons.lesson6;

public class Cat {
    String name;
    int age;
    double amountOfFeed;

    public Cat() {
    }

    boolean eat(double amount) {
        if (amount > 10) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.eat(11));
    }
}
