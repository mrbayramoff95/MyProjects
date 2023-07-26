package Java_lessons.lesson9.Parking;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[] {
                new Car("VIN001", new Date(2010, 5, 1)),
                new Car("VIN002", new Date(2013, 8, 2)),
                new Car("VIN003", new Date(2005, 11, 3)),
        };
        Parking parking = new Parking(cars);

        try {
            Car car = parking.checkCar("VIN004");
            System.out.println("Car found: " + car.getVin());
        } catch (CarNotFoundException e) {
            System.out.println("Car not found: " + e.getMessage());
        }

        int count = parking.countByYears(2);
        System.out.println("Number of cars with age 5 years: " + count);
    }
}
