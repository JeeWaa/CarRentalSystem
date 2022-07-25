package lk.rent.spring.service;

import lk.rent.spring.entity.Driver;
import lk.rent.spring.repo.DriverRepo;
import lk.rent.spring.service.impl.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DriverServiceImpl implements DriverService {

    @Autowired
    DriverRepo driverRepo;

    @Override
    public void saveDriver(Driver entity) {
        driverRepo.save(entity);
    }

    @Override
    public void updateDriver(Driver entity) {
        driverRepo.save(entity);
    }

    @Override
    public void deleteDriver(String id) {
        driverRepo.deleteById(id);
    }

    @Override
    public Driver searchDriver(String id) {
        return driverRepo.findById(id).get();
    }

    @Override
    public List<Driver> getAllDriver() {
        return driverRepo.findAll();
    }
}
