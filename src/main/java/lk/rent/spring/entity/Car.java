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
public class Car {
    @Id
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
