package lk.rent.spring.service;

import lk.rent.spring.entity.RentDetails;
import lk.rent.spring.repo.RentDetailsRepo;
import lk.rent.spring.service.impl.RentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RentDetailsServiceImpl implements RentDetailsService {

    @Autowired
    RentDetailsRepo rentDetailsRepo;

    @Override
    public void saveRentDetails(RentDetails entity) {
        rentDetailsRepo.save(entity);
    }

    @Override
    public RentDetails searchRentDetails(String id) {
        return rentDetailsRepo.findById(id).get();
    }

    @Override
    public List<RentDetails> getAllRentDetails() {
        return rentDetailsRepo.findAll();
    }
}
