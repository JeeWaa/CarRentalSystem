package lk.rent.spring.controller;

import lk.rent.spring.entity.Driver;
import lk.rent.spring.service.impl.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("driver")
@RestController
@CrossOrigin
public class DriverController {

    @Autowired
    DriverService driverService;

    @PostMapping
    public void saveDriver(@ModelAttribute Driver driver) {
        driverService.saveDriver(driver);
    }

    @PutMapping
    public void updateDriver(@RequestBody Driver driver) {
        driverService.updateDriver(driver);
    }

    @DeleteMapping(params = {"id"})
    public void deleteDriver(@RequestParam String id) {
        driverService.deleteDriver(id);
    }

    @GetMapping(path = {"/id"})
    public Driver searchDriver(@PathVariable String id) {
        return driverService.searchDriver(id);
    }

    @GetMapping
    public List<Driver> getAllDriver() {
        return driverService.getAllDriver();
    }

}
