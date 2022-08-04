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
    private String rentDetailsId;
    private String rentId;
    private String driverId;
    private int qty;
    private String rentDuration;
    private String time;
    private String date;
}
