package lk.rent.spring.service;

import lk.rent.spring.dto.DriverDTO;
import lk.rent.spring.entity.Driver;
import lk.rent.spring.repo.DriverRepo;
import lk.rent.spring.service.impl.DriverService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DriverServiceImpl implements DriverService {

    @Autowired
    DriverRepo driverRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void saveDriver(DriverDTO dto) {
        driverRepo.save(modelMapper.map(dto, Driver.class));
    }

    @Override
    public void updateDriver(DriverDTO dto) {
        driverRepo.save(modelMapper.map(dto, Driver.class));
    }

    @Override
    public void deleteDriver(String id) {
        driverRepo.deleteById(id);
    }

    @Override
    public DriverDTO searchDriver(String id) {
        return modelMapper.map(driverRepo.findById(id).get(), DriverDTO.class);
    }

    @Override
    public List<DriverDTO> getAllDriver() {
        return modelMapper.map(driverRepo.findAll(), new TypeToken<List<DriverDTO>>(){}.getType());
    }
}
