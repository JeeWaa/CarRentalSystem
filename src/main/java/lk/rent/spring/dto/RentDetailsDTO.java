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
public class RentDetailsDTO {
    private String rentDetailsId;
    private String rentId;
    private String driverId;
    private int qty;
    private String rentDuration;
    private String time;
    private String date;
}
