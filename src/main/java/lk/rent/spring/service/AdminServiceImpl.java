package lk.rent.spring.service;

import lk.rent.spring.entity.Admin;
import lk.rent.spring.repo.AdminRepo;
import lk.rent.spring.service.impl.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepo adminRepo;

    @Override
    public void saveAdmin(Admin entity) {
        adminRepo.save(entity);
    }

    @Override
    public void updateAdmin(Admin entity) {
        adminRepo.save(entity);
    }

    @Override
    public Admin searchAdmin(String id) {
        return adminRepo.findById(id).get();
    }
}
