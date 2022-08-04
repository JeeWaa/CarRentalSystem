package lk.rent.spring.service.impl;

import lk.rent.spring.dto.CarDTO;
import lk.rent.spring.entity.Car;

import java.util.List;

public interface CarService {

    void saveCar(CarDTO dto);
    void updateCar(CarDTO dto);
    void deleteCar(String id);
    CarDTO searchCar(String id);
    List<CarDTO> getAllCar();

}
