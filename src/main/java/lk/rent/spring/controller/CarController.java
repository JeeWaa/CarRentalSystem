package lk.rent.spring.controller;

import lk.rent.spring.dto.CarDTO;
import lk.rent.spring.entity.Car;
import lk.rent.spring.service.impl.CarService;
import lk.rent.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("car")
@RestController
@CrossOrigin
public class CarController {

    @Autowired
    CarService carService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveCar(@ModelAttribute CarDTO car) {
        carService.saveCar(car);
        return new ResponseUtil(200,"Saved",null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateCar(@RequestBody CarDTO car) {
        carService.updateCar(car);
        return new ResponseUtil(200,"Updated",null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteCar(@RequestParam String id) {
        carService.deleteCar(id);
        return new ResponseUtil(200,"Deleted",null);
    }

    @GetMapping(path = "/id",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchCar(@PathVariable String id) {
        return new ResponseUtil(200,"Ok",carService.searchCar(id));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllCar() {
        return new ResponseUtil(200,"Ok", carService.getAllCar());
    }
}
