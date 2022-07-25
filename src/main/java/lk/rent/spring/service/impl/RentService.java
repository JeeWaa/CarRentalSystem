package lk.rent.spring.service.impl;

import lk.rent.spring.entity.Rent;

import java.util.List;

public interface RentService {

    void saveRent(Rent entity);
    Rent searchRent(String id);
    List<Rent> getAllRent();

}
