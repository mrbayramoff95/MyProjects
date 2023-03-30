package Java_lessons.lesson7.Classworks;

public class Car {
    protected String vin;

    public Car() {
    }

    public Car(String vin) {
        this.vin = vin;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public void drive() {
        System.out.println("Car driving");
    }
}