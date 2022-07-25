package lk.rent.spring.service;

import lk.rent.spring.entity.Car;
import lk.rent.spring.repo.CarRepo;
import lk.rent.spring.service.impl.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepo carRepo;

    @Override
    public void saveCar(Car entity) {
        carRepo.save(entity);
    }

    @Override
    public void updateCar(Car entity) {
        carRepo.save(entity);
    }

    @Override
    public void deleteCar(String id) {
        carRepo.deleteById(id);
    }

    @Override
    public Car searchCar(String id) {
        return carRepo.findById(id).get();
    }

    @Override
    public List<Car> getAllCar() {
        return carRepo.findAll();
    }
}
