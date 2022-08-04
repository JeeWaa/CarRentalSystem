package lk.rent.spring.service;

import lk.rent.spring.dto.CustomerDTO;
import lk.rent.spring.entity.Customer;
import lk.rent.spring.repo.CustomerRepo;
import lk.rent.spring.service.impl.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void saveCustomer(CustomerDTO dto) {
        customerRepo.save(modelMapper.map(dto, Customer.class));
    }

    @Override
    public void updateCustomer(CustomerDTO dto) {
        customerRepo.save(modelMapper.map(dto, Customer.class));
    }

    @Override
    public void deleteCustomer(String id) {
        customerRepo.deleteById(id);
    }

    @Override
    public CustomerDTO searchCustomer(String id) {
        return modelMapper.map(customerRepo.findById(id).get(), CustomerDTO.class);
    }

    @Override
    public List<CustomerDTO> getAllCustomer() {
        return modelMapper.map(customerRepo.findAll(), new TypeToken<List<CustomerDTO>>(){}.getType());
    }

}
