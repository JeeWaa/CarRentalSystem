package lk.rent.spring.service;

import lk.rent.spring.dto.RentDetailsDTO;
import lk.rent.spring.entity.RentDetails;
import lk.rent.spring.repo.RentDetailsRepo;
import lk.rent.spring.service.impl.RentDetailsService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RentDetailsServiceImpl implements RentDetailsService {

    @Autowired
    RentDetailsRepo rentDetailsRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void saveRentDetails(RentDetailsDTO dto) {
        rentDetailsRepo.save(modelMapper.map(dto, RentDetails.class));
    }

    @Override
    public RentDetailsDTO searchRentDetails(String id) {
        return modelMapper.map(rentDetailsRepo.findById(id).get(), RentDetailsDTO.class);
    }

    @Override
    public List<RentDetailsDTO> getAllRentDetails() {
        return modelMapper.map(rentDetailsRepo.findAll(), new TypeToken<List<RentDetailsDTO>>(){}.getType());
    }
}
