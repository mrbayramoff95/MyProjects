package lesson7.Classworks;

public class Bus extends Car {
    private float capacity;

    public Bus() {
    }

    public Bus(String vin, float capacity) {
        super(vin);
        this.capacity = capacity;
    }

    public Bus(float capacity) {
        this.capacity = capacity;
    }

    @Override
    public void drive() {

    }
}
