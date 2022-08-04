package lk.rent.spring.controller;

import lk.rent.spring.dto.CustomerDTO;
import lk.rent.spring.entity.Customer;
import lk.rent.spring.service.impl.CustomerService;
import lk.rent.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("web/customer")
@RestController
@CrossOrigin
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveCustomer(@ModelAttribute CustomerDTO customer) {
        customerService.saveCustomer(customer);
        return new ResponseUtil(200,"Saved",null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO customer) {
        customerService.updateCustomer(customer);
        return new ResponseUtil(200,"Updated",null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteCustomer(@RequestParam String id) {
        customerService.deleteCustomer(id);
        return new ResponseUtil(200,"Deleted",null);
    }

    @GetMapping(path = "/id",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchCustomer(@PathVariable String id) {
        return new ResponseUtil(200,"Ko",customerService.searchCustomer(id));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllCustomer() {
        return new ResponseUtil(200,"Ko",customerService.getAllCustomer());
    }

}
