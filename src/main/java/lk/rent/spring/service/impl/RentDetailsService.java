package lk.rent.spring.service.impl;

import lk.rent.spring.dto.RentDetailsDTO;
import lk.rent.spring.entity.RentDetails;

import java.util.List;

public interface RentDetailsService {

    void saveRentDetails(RentDetailsDTO dto);
    RentDetailsDTO searchRentDetails(String id);
    List<RentDetailsDTO> getAllRentDetails();

}
