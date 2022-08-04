package lk.rent.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
public class Driver {
    @Id
    private String driverId;
    private String username;
    private String password;
    private String name;
    private String address;
    private String email;
    private String number;
}
