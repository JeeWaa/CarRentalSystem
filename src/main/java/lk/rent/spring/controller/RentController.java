package lk.rent.spring.controller;

import lk.rent.spring.dto.RentDTO;
import lk.rent.spring.entity.Rent;
import lk.rent.spring.service.impl.RentService;
import lk.rent.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("rent")
@RestController
@CrossOrigin
public class RentController {

    @Autowired
    RentService rentService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveRent(@ModelAttribute RentDTO rent) {
        rentService.saveRent(rent);
        return new ResponseUtil(200,"Saved",null);
    }

    @GetMapping(path = "/id",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchRent(@PathVariable String id) {
        return new ResponseUtil(200,"Ok", rentService.searchRent(id));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllRent() {
        return new ResponseUtil(200,"Ok", rentService.getAllRent());
    }

}
