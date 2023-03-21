package lesson9.Parking;

import java.util.Date;

class Car {
    private String vin;
    private Date productionDate;

    public Car(String vin, Date productionDate) {
        this.vin = vin;
        this.productionDate = productionDate;
    }

    public String getVin() {
        return vin;
    }

    public Date getProductionDate() {
        return productionDate;
    }
}
