package lk.rent.spring.service.impl;

import lk.rent.spring.entity.Car;

import java.util.List;

public interface CarService {

    void saveCar(Car entity);
    void updateCar(Car entity);
    void deleteCar(String id);
    Car searchCar(String id);
    List<Car> getAllCar();

}
