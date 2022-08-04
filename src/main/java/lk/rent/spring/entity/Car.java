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
    private String carId;
    private String brand;
    private int qty;
    private String type;
    private int passenger;
    private String transmissionType;
    private String fuelType;
    private double freeMileagePrice;
    private String freeMileageDuration;
    private double extraKMPrice;
    private String registrationNumber;
    private String color;
}
