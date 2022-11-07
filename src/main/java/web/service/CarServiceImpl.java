package web.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component("carServiceImpl")
public class CarServiceImpl implements CarService {

    private final CarDaoImpl carDaoImpl;

    public CarServiceImpl(@Qualifier("carDaoImpl") CarDaoImpl carDaoImpl) {
        this.carDaoImpl = carDaoImpl;
    }

    @Override
    public List<Car> getCar(int count) {

        carDaoImpl.addCar(new Car("ВАЗ", "2109", 50_000));
        carDaoImpl.addCar(new Car("Kia", "Ceed", 470_000));
        carDaoImpl.addCar(new Car("BMW", "X5", 1_500_000));
        carDaoImpl.addCar(new Car("Haval", "H5", 900_000));
        carDaoImpl.addCar(new Car("Jeep", "Wrangler", 1_200_000));

        List<Car> list = new ArrayList<>();
        if (count > 5) count = 5;
        for (int i = 0; i < count; i++) {
            list.add(carDaoImpl.returnListCar().get(i));
        }

        return list;
    }
}
