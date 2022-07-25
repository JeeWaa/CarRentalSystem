package lk.rent.spring.service.impl;

import lk.rent.spring.entity.Driver;

import java.util.List;

public interface DriverService {

    void saveDriver(Driver entity);
    void updateDriver(Driver entity);
    void deleteDriver(String id);
    Driver searchDriver(String id);
    List<Driver> getAllDriver();
}
