package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    CarService carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        List<Car> list = new ArrayList<>();
        if (count > 5) count = 5;
        for (int i = 0; i < count; i++) {
            list.add(carService.getCar().get(i));
        }
        model.addAttribute("car", list);
        return "/cars";
    }

}
