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
public class RentDetails {
    @Id
    String rentDetailsId;
    String rentId;
    int qty;
    String rentDuration;
    String time;
    String date;
}