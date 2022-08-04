package lk.rent.spring.repo;

import lk.rent.spring.config.JPAConfig;
import lk.rent.spring.entity.Driver;
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
class DriverRepoTest {

    @Autowired
    DriverRepo repo;

    @Test
    public void save() {
//        Driver driver1 = new Driver("D001","Amal","Kalutara","amal@gmail.com","0772558947");
//        Driver driver2 = new Driver("D002","Amara","Colombo","amara@gmail.com","0778996544");
//        repo.save(driver1);
//        repo.save(driver2);
    }

    @Test
    public void update() {
//        if (repo.existsById("D001")) {
//            Driver driver1 = new Driver("D001","Amal","Panadura","amal@gmail.com","0772558947");
//            repo.save(driver1);
//        }else {
//            throw new RuntimeException("No update");
//        }
    }

    @Test
    public void delete() {
        repo.deleteById("D002");
    }

    @Test
    public void search() {
        Optional<Driver> optional = repo.findById("D001");
        boolean present = optional.isPresent();
        System.out.println(present);
        Driver driver = optional.get();
        System.out.println(driver.toString());
    }

    @Test
    public void getAll() {
        List<Driver> all = repo.findAll();
        for (Driver driver : all) {
            System.out.println(driver.toString());
        }
    }

}