package lk.rent.spring.repo;

import lk.rent.spring.config.JPAConfig;
import lk.rent.spring.entity.Car;
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
class CarRepoTest {

    @Autowired
    CarRepo repo;

    @Test
    public void save() {
//        Car car1 = new Car("V001","","",4,"","",2000.00,"10h",1000.00,"","Red");
//        Car car2 = new Car("V002","","",4,"","",2000.00,"10h",1000.00,"","Red");
//        repo.save(car1);
//        repo.save(car2);
    }

    @Test
    public void update() {
//        if (repo.existsById("V002")) {
//            Car car2 = new Car("V002","","",2,"","",2000.00,"10h",1000.00,"","Red");
//            repo.save(car2);
//        }else {
//            throw new RuntimeException("No update");
//        }
    }

    @Test
    public void delete() {
        repo.deleteById("V001");
    }

    @Test
    public void search() {
        Optional<Car> optional = repo.findById("V002");
        boolean present = optional.isPresent();
        System.out.println(present);
        Car car = optional.get();
        System.out.println(car.toString());
    }

    @Test
    public void getAll() {
        List<Car> all = repo.findAll();
        for (Car car : all) {
            System.out.println(car.toString());
        }
    }

}