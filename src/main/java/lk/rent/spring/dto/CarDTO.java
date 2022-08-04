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
public class CarDTO {
    String carId;
    String brand;
    String type;
    int passenger;
    String transmissionType;
    String fuelType;
    double freeMileagePrice;
    String freeMileageDuration;
    double extraKMPrice;
    String registrationNumber;
    String color;
}
