package lk.rent.spring.service;

import lk.rent.spring.dto.AdminDTO;
import lk.rent.spring.entity.Admin;
import lk.rent.spring.repo.AdminRepo;
import lk.rent.spring.service.impl.AdminService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepo adminRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public void saveAdmin(AdminDTO dto) {
        adminRepo.save(modelMapper.map(dto, Admin.class));
    }

    @Override
    public void updateAdmin(AdminDTO dto) {
        adminRepo.save(modelMapper.map(dto, Admin.class));
    }

    @Override
    public AdminDTO searchAdmin(String id) {
        return modelMapper.map(adminRepo.findById(id).get(), AdminDTO.class);
    }
}
