package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao{

    public List<Car> cars= new ArrayList<>();


    @Override
    public void addCar() {
        cars.add(new Car("ВАЗ", "2109", 50_000));
        cars.add(new Car("Kia", "Ceed", 470_000));
        cars.add(new Car("BMW", "X5", 1_500_000));
        cars.add(new Car("Haval", "H5", 900_000));
        cars.add(new Car("Jeep", "Wrangler", 1_200_000));
    }

    public List<Car> returnListCar(){
        return cars;
    }


}
