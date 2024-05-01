package dev.org.carrentalsystem.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String vehicleID;
    private String make;
    private String model;
    private String year;
    private String licensePlate;
    private Float mileage;
    @ManyToOne
    private Branch branch;
    VehicleAvailabilityStatus availabilityStatus;

}
