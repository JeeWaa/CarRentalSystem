package lk.rent.spring.repo;

import lk.rent.spring.config.JPAConfig;
import lk.rent.spring.entity.Rent;
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
class RentRepoTest {

    @Autowired
    RentRepo repo;

    @Test
    public void save() {
        Rent rent = new Rent("R001","C001");
        repo.save(rent);
    }

    @Test
    public void search() {
        Optional<Rent> optional = repo.findById("R002");
        boolean present = optional.isPresent();
        System.out.println(present);
        Rent rent = optional.get();
        System.out.println(rent.toString());
    }

    @Test
    public void getAll() {
        List<Rent> all = repo.findAll();
        for (Rent rent : all) {
            System.out.println(rent.toString());
        }
    }

}