package Java_lessons.lesson7.Classworks;

public class MainCar {
    public static void main(String[] args) {
        Car[] cars = new Car[2];

        Bus bus = new Bus();
        Truck truck = new Truck();

        cars[0] = bus;
        cars[1] = truck;

        for (Car car : cars) {
            car.drive();
        }
    }
}