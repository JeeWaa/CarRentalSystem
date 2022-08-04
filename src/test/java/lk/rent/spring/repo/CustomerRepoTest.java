package lk.rent.spring.repo;

import lk.rent.spring.config.JPAConfig;
import lk.rent.spring.entity.Customer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@WebAppConfiguration
@ContextConfiguration(classes = {JPAConfig.class})
@ExtendWith(SpringExtension.class)
class CustomerRepoTest {

    @Autowired
    CustomerRepo repo;

    @Test
    public void save() {
        Customer customer1 = new Customer("C001","jeewa","1234","Jeewantha","Panadura","jeewa@gmail.com","0766156864");
//        Customer customer2 = new Customer("C002","Fernando","Colombo","fernando@gmail.com","0703160002");
//        Customer customer3 = new Customer("C003","Amal","Colombo","amal@gmail.com","0777259933");
//        Customer customer4 = new Customer("C004","Kamal","Colombo","kamal@gmail.com","0702778456");
//        Customer customer5 = new Customer("C005","Amara","Colombo","amara@gmail.com","0715556213");
//        Customer customer6 = new Customer("C006","Kamala","Colombo","kamala@gmail.com","0703665489");
        repo.save(customer1);
//        repo.save(customer2);
//        repo.save(customer3);
//        repo.save(customer4);
//        repo.save(customer5);
//        repo.save(customer6);
    }

    @Test
    public void update() {
//        if (repo.existsById("C004")) {
//            Customer customer4 = new Customer("C004","Kamal","Panadura","kamal@gmail.com","0702778456");
//            repo.save(customer4);
//        }else {
//            throw new RuntimeException("No update");
//        }
    }

    @Test
    public void delete() {
        repo.deleteById("C004");
    }

    @Test
    public void search() {
        Optional<Customer> optional = repo.findById("C002");
        boolean present = optional.isPresent();
        System.out.println(present);
        Customer customer = optional.get();
        System.out.println(customer.toString());
    }

    @Test
    public void getAll() {
        List<Customer> all = repo.findAll();
        for (Customer customer : all) {
            System.out.println(customer.toString());
        }
    }

}