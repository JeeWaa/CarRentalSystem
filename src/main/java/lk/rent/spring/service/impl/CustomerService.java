package lk.rent.spring.service.impl;

import lk.rent.spring.dto.CustomerDTO;
import lk.rent.spring.entity.Customer;

import java.util.List;

public interface CustomerService {

    void saveCustomer(CustomerDTO dto);
    void updateCustomer(CustomerDTO dto);
    void deleteCustomer(String id);
    CustomerDTO searchCustomer(String id);
    List<CustomerDTO> getAllCustomer();

}
