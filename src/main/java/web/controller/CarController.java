package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    @Autowired
    private CarServiceImpl carServiceImpl;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("car", carServiceImpl.getCar(count));
        return "/cars";
    }

}
