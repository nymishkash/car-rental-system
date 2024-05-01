package dev.org.carrentalsystem.services;

import dev.org.carrentalsystem.models.Vehicle;
import org.springframework.stereotype.Service;

import java.util.List;

public interface VehicleService {

    Vehicle getVehicleById(Long id);
    List<Vehicle> getAllVehicles();
    void updateVehicle(Vehicle vehicle);
    void createVehicle(Vehicle vehicle);
    void deleteVehicle(Long id);

}
