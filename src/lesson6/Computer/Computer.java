package lesson6.Computer;

public class Computer {
    double cost;
    String model;
    Hdd hard;
    RAM oper;

    public Computer(double cost, String model) {
        this.cost = cost;
        this.model = model;
        this.hard = new Hdd();
        this.oper = new RAM();
    }

    public Computer(double cost, String model, Hdd hard, RAM oper) {
        this.cost = cost;
        this.model = model;
        this.hard = hard;
        this.oper = oper;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cost=" + cost +
                ", model='" + model + '\'' +
                ", hard=" + hard +
                ", oper=" + oper +
                '}';
    }
}
