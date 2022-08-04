package lk.rent.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
public class CustomerDTO {
    private String customerId;
    private String username;
    private String password;
    private String name;
    private String address;
    private String email;
    private String number;
}
