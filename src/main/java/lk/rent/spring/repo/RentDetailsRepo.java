package lk.rent.spring.repo;

import lk.rent.spring.entity.RentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentDetailsRepo extends JpaRepository<RentDetails,String> {
}
