package lesson6;

public class RAM {
    String name;
    double volume;

    public RAM() {
    }

    public RAM(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
