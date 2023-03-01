package lesson6;

public class Car {
    String vin;
    float engineCapacity;
    String mark;

    public Car() {
    }

    public Car(String vin, float engineCapacity, String mark) {
        this.vin = vin;
        this.engineCapacity = engineCapacity;
        this.mark = mark;
    }

    void drive() {
        System.out.println("Car " + vin + " is driving");
    }
}
