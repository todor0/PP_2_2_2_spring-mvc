package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {
    private final CarService carService = new CarServiceImp();

    @GetMapping(value = "/cars")
    public String listOfCars(@RequestParam(required = false, value = "count") Integer count
            , ModelMap model) {
        List<Car> cars = new ArrayList<>();

        if (count == null) {
            cars = Car.listOf5Cars();
        } else {
            cars = carService.countCars(count);
        }
        model.addAttribute("cars", cars);

        return "cars";
    }
}
