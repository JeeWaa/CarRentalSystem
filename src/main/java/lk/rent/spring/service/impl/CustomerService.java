package lk.rent.spring.service.impl;

import lk.rent.spring.entity.Customer;

import java.util.List;

public interface CustomerService {

    void saveCustomer(Customer entity);
    void updateCustomer(Customer entity);
    void deleteCustomer(String id);
    Customer searchCustomer(String id);
    List<Customer> getAllCustomer();

}
