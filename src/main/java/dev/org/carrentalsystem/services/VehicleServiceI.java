package dev.org.carrentalsystem.services;

import dev.org.carrentalsystem.models.Vehicle;

import java.util.List;

public interface VehicleServiceI {

    Vehicle getVehicleById(Long id);
    List<Vehicle> getAllVehicles();
    void updateVehicle(Vehicle vehicle);
    Vehicle createVehicle(Vehicle vehicle);
    void deleteVehicle(Long id);

    void deleteVehicle(Vehicle vehicle);

    void deleteVehicleById(Long id);
}
