package lk.rent.spring.service;

import lk.rent.spring.entity.Customer;
import lk.rent.spring.repo.CustomerRepo;
import lk.rent.spring.service.impl.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public void saveCustomer(Customer entity) {
        customerRepo.save(entity);
    }

    @Override
    public void updateCustomer(Customer entity) {
        customerRepo.save(entity);
    }

    @Override
    public void deleteCustomer(String id) {
        customerRepo.deleteById(id);
    }

    @Override
    public Customer searchCustomer(String id) {
        return customerRepo.findById(id).get();
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepo.findAll();
    }

}
