package lk.rent.spring.controller;

import lk.rent.spring.entity.Rent;
import lk.rent.spring.service.impl.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("rent")
@RestController
@CrossOrigin
public class RentController {

    @Autowired
    RentService rentService;

    @PostMapping
    public void saveRent(@ModelAttribute Rent rent) {
        rentService.saveRent(rent);
    }

    @GetMapping(path = {"/id"})
    public Rent searchRent(@PathVariable String id) {
        return rentService.searchRent(id);
    }

    @GetMapping
    public List<Rent> getAllRent() {
        return rentService.getAllRent();
    }

}
