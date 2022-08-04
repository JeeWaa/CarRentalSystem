package lk.rent.spring.service;

import lk.rent.spring.dto.RentDTO;
import lk.rent.spring.entity.Rent;
import lk.rent.spring.repo.RentRepo;
import lk.rent.spring.service.impl.RentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RentServiceImpl implements RentService {

    @Autowired
    RentRepo rentRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void saveRent(RentDTO dto) {
        rentRepo.save(modelMapper.map(dto, Rent.class));
    }

    @Override
    public RentDTO searchRent(String id) {
        return modelMapper.map(rentRepo.findById(id).get(), RentDTO.class);
    }

    @Override
    public List<RentDTO> getAllRent() {
        return modelMapper.map(rentRepo.findAll(), new TypeToken<List<RentDTO>>(){}.getType());
    }
}
