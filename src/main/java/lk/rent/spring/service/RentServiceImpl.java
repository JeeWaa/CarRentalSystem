package lk.rent.spring.service;

import lk.rent.spring.entity.Rent;
import lk.rent.spring.repo.RentRepo;
import lk.rent.spring.service.impl.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RentServiceImpl implements RentService {

    @Autowired
    RentRepo rentRepo;

    @Override
    public void saveRent(Rent entity) {
        rentRepo.save(entity);
    }

    @Override
    public Rent searchRent(String id) {
        return rentRepo.findById(id).get();
    }

    @Override
    public List<Rent> getAllRent() {
        return rentRepo.findAll();
    }
}
