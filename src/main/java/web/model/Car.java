package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String brand;

    private String model;

    private int serialNumber;

    public Car() {
    }

    public Car(String brand, String model, int serialNumber) {
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public static List<Car> listOf5Cars () {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Car1", "1", 1111));
        cars.add(new Car("Car2", "2", 1112));
        cars.add(new Car("Car3", "3", 1113));
        cars.add(new Car("Car4", "4", 1114));
        cars.add(new Car("Car5", "5", 1115));
        return cars;
    }
}
