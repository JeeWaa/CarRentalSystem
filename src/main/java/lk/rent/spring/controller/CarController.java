package lk.rent.spring.controller;

import lk.rent.spring.entity.Car;
import lk.rent.spring.service.impl.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("car")
@RestController
@CrossOrigin
public class CarController {

    @Autowired
    CarService carService;

    @PostMapping
    public void saveCar(@ModelAttribute Car car) {
        carService.saveCar(car);
    }

    @PutMapping
    public void updateCar(@RequestBody Car car) {
        carService.updateCar(car);
    }

    @DeleteMapping(params = {"id"})
    public void deleteCar(@RequestParam String id) {
        carService.deleteCar(id);
    }

    @GetMapping(path = "id")
    public Car searchCar(@PathVariable String id) {
        return carService.searchCar(id);
    }

    @GetMapping
    public List<Car> getAllCar() {
        return carService.getAllCar();
    }
}
