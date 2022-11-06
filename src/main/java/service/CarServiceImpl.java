package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCar() {
        List<Car> cars= new ArrayList<>();
        cars.add(new Car("ВАЗ", "2109", 50_000));
        cars.add(new Car("Kia", "Ceed", 470_000));
        cars.add(new Car("BMW", "X5", 1_500_000));
        cars.add(new Car("Haval", "H5", 900_000));
        cars.add(new Car("Jeep", "Wrangler", 1_200_000));
        return cars;
    }
}
