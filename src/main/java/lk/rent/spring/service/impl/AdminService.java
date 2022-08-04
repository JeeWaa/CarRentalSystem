package lk.rent.spring.service.impl;

import lk.rent.spring.dto.AdminDTO;
import lk.rent.spring.entity.Admin;

public interface AdminService {
    void saveAdmin(AdminDTO dto);
    void updateAdmin(AdminDTO dto);
    AdminDTO searchAdmin(String id);
}
