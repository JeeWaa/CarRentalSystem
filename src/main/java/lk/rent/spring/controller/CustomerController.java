package lk.rent.spring.controller;

import lk.rent.spring.entity.Customer;
import lk.rent.spring.service.impl.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("customer")
@RestController
@CrossOrigin
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping
    public void saveCustomer(@ModelAttribute Customer customer) {
        customerService.saveCustomer(customer);
    }

    @PutMapping
    public void updateCustomer(@RequestBody Customer customer) {
        customerService.updateCustomer(customer);
    }

    @DeleteMapping(params = {"id"})
    public void deleteCustomer(@RequestParam String id) {
        customerService.deleteCustomer(id);
    }

    @GetMapping(path = "/id")
    public Customer searchCustomer(@PathVariable String id) {
        return customerService.searchCustomer(id);
    }

    @GetMapping
    public List<Customer> getAllCustomer() {
        return customerService.getAllCustomer();
    }

}
