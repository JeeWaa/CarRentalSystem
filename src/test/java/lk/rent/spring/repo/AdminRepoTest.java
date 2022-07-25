package lk.rent.spring.repo;

import lk.rent.spring.config.JPAConfig;
import lk.rent.spring.entity.Admin;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.jupiter.api.Assertions.*;

@WebAppConfiguration
@ContextConfiguration(classes = {JPAConfig.class})
@ExtendWith(SpringExtension.class)
class AdminRepoTest {

    @Autowired
    AdminRepo repo;

    @Test
    public void save() {
        Admin admin = new Admin("admin","1234");
        repo.save(admin);
    }

    @Test
    public void update() {
        if (repo.existsById("admin")) {
            Admin admin = new Admin("admin","5678");
            repo.save(admin);
        }else {
            throw new RuntimeException("No update");
        }
    }
}