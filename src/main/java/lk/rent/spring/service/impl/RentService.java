package lk.rent.spring.service.impl;

import lk.rent.spring.dto.RentDTO;
import lk.rent.spring.entity.Rent;

import java.util.List;

public interface RentService {

    void saveRent(RentDTO dto);
    RentDTO searchRent(String id);
    List<RentDTO> getAllRent();

}
