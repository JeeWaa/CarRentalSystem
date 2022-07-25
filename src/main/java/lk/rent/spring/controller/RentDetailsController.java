package lk.rent.spring.controller;

import lk.rent.spring.entity.RentDetails;
import lk.rent.spring.service.impl.RentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("rentDetails")
@RestController
@CrossOrigin
public class RentDetailsController {

    @Autowired
    RentDetailsService rentDetailsService;

    @PostMapping
    public void saveRentDetails(@ModelAttribute RentDetails rentDetails) {
        rentDetailsService.saveRentDetails(rentDetails);
    }

    @GetMapping(path = {"/id"})
    public RentDetails searchRentDetails(@PathVariable String id) {
        return rentDetailsService.searchRentDetails(id);
    }

    @GetMapping
    public List<RentDetails> getAllRentDetails() {
        return rentDetailsService.getAllRentDetails();
    }
}
