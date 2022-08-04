package lk.rent.spring.controller;

import lk.rent.spring.dto.RentDetailsDTO;
import lk.rent.spring.entity.RentDetails;
import lk.rent.spring.service.impl.RentDetailsService;
import lk.rent.spring.util.ResponseUtil;
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
    public ResponseUtil saveRentDetails(@ModelAttribute RentDetailsDTO rentDetails) {
        rentDetailsService.saveRentDetails(rentDetails);
        return new ResponseUtil(200,"Saved",null);
    }

    @GetMapping(path = {"/id"})
    public ResponseUtil searchRentDetails(@PathVariable String id) {
        return new ResponseUtil(200,"Ok", rentDetailsService.searchRentDetails(id));
    }

    @GetMapping
    public ResponseUtil getAllRentDetails() {
        return new ResponseUtil(200,"Ok", rentDetailsService.getAllRentDetails());
    }
}
