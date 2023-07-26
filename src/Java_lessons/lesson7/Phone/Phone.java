package Java_lessons.lesson7.Phone;

public class Phone {
    private int number;
    private String model;
    private int weight;

    public Phone() {
    }

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public int [] sendMessage(int... number) {
        return number;
    }
    public void receiveCall(String name) {
        System.out.println("Звонит: " + name + " номер: " + getNumber());
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит: " + name + " номер: " + number);
    }
}
