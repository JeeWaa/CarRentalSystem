package lk.rent.spring.service;

import lk.rent.spring.dto.CarDTO;
import lk.rent.spring.entity.Car;
import lk.rent.spring.repo.CarRepo;
import lk.rent.spring.service.impl.CarService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepo carRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public void saveCar(CarDTO dto) {
        carRepo.save(modelMapper.map(dto, Car.class));
    }

    @Override
    public void updateCar(CarDTO dto) {
        carRepo.save(modelMapper.map(dto, Car.class));
    }

    @Override
    public void deleteCar(String id) {
        carRepo.deleteById(id);
    }

    @Override
    public CarDTO searchCar(String id) {
        return modelMapper.map(carRepo.findById(id).get(), CarDTO.class);
    }

    @Override
    public List<CarDTO> getAllCar() {
        return modelMapper.map(carRepo.findAll(), new TypeToken<List<CarDTO>>(){}.getType());
    }
}
