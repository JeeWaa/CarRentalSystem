package lk.rent.spring.service.impl;

import lk.rent.spring.dto.DriverDTO;
import lk.rent.spring.entity.Driver;

import java.util.List;

public interface DriverService {

    void saveDriver(DriverDTO dto);
    void updateDriver(DriverDTO dto);
    void deleteDriver(String id);
    DriverDTO searchDriver(String id);
    List<DriverDTO> getAllDriver();
}
