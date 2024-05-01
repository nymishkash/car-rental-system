package dev.org.carrentalsystem.services;

import dev.org.carrentalsystem.models.Vehicle;
import dev.org.carrentalsystem.repositories.VehicleRepository;

import java.util.List;

public class VehicleService implements VehicleServiceI{

    VehicleRepository vehicleRepo;
    public VehicleService(VehicleRepository vehicleRepo) {
        this.vehicleRepo = vehicleRepo;
    }

    @Override
    public Vehicle getVehicleById(Long id) {
        return null;
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return List.of();
    }

    @Override
    public void updateVehicle(Vehicle vehicle) {

    }

    @Override
    public void createVehicle(Vehicle vehicle) {

    }

    @Override
    public void deleteVehicle(Long id) {

    }
}
