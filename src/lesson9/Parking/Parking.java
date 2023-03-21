package lesson9.Parking;

import java.util.Calendar;

class Parking {
    private Car[] cars;

    public Parking(Car[] cars) {
        this.cars = cars;
    }

    public Car checkCar(String vin) throws CarNotFoundException {
        for (Car car : cars) {
            if (car.getVin().equals(vin)) {
                return car;
            }
        }
        throw new CarNotFoundException("Car with VIN " + vin + " not found in the parking");
    }

    public int countByYears(int years) {
        int count = 0;
        Calendar now = Calendar.getInstance();
        for (Car car : cars) {
            Calendar productionDate = Calendar.getInstance();
            productionDate.setTime(car.getProductionDate());
            if (now.get(Calendar.YEAR) - productionDate.get(Calendar.YEAR) == years) {
                count++;
            }
        }
        return count;
    }
}

class CarNotFoundException extends Exception {
    public CarNotFoundException(String message) {
        super(message);
    }
}
