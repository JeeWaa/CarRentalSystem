package lk.rent.spring.service.impl;

import lk.rent.spring.entity.RentDetails;

import java.util.List;

public interface RentDetailsService {

    void saveRentDetails(RentDetails entity);
    RentDetails searchRentDetails(String id);
    List<RentDetails> getAllRentDetails();

}
