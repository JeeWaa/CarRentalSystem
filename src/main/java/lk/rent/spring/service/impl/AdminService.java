package lk.rent.spring.service.impl;

import lk.rent.spring.entity.Admin;

public interface AdminService {
    void saveAdmin(Admin entity);
    void updateAdmin(Admin entity);
    Admin searchAdmin(String id);
}
