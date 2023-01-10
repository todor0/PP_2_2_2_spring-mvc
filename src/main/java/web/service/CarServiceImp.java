package web.service;

import web.model.Car;
import java.util.List;

public class CarServiceImp implements CarService {

    @Override
    public List<Car> countCars(Integer count) {
        return Car.listOf5Cars().stream().limit(count).toList();
    }
}
