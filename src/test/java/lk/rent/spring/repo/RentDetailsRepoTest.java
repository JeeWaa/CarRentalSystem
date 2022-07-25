package lk.rent.spring.repo;

import lk.rent.spring.config.JPAConfig;
import lk.rent.spring.entity.RentDetails;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@WebAppConfiguration
@ContextConfiguration(classes = {JPAConfig.class})
@ExtendWith(SpringExtension.class)
class RentDetailsRepoTest {

    @Autowired
    RentDetailsRepo repo;

    @Test
    public void save() {
        RentDetails rentDetails = new RentDetails("RD001","R001",10,"12h","08:30:00","08:04:2022");
        repo.save(rentDetails);
    }

    @Test
    public void search() {
        Optional<RentDetails> optional = repo.findById("RD001");
        boolean present = optional.isPresent();
        System.out.println(present);
        RentDetails rentDetails = optional.get();
        System.out.println(rentDetails.toString());
    }

    @Test
    public void getAll() {
        List<RentDetails> all = repo.findAll();
        for (RentDetails rentDetails : all) {
            System.out.println(rentDetails.toString());
        }
    }

}