package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCar(int count) {

        carDao.addCar();

        List<Car> list = new ArrayList<>();
        if (count > 5) count = 5;
        for (int i = 0; i < count; i++) {
            list.add(carDao.returnListCar().get(i));
        }

        return list;
    }
}
