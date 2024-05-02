package dev.org.carrentalsystem.services;

import dev.org.carrentalsystem.models.Vehicle;
import dev.org.carrentalsystem.repositories.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService implements VehicleServiceI{

    VehicleRepository vehicleRepo;
    public VehicleService(VehicleRepository vehicleRepo) {
        this.vehicleRepo = vehicleRepo;
    }

    @Override
    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepo.save(vehicle);
    }

    @Override
    public void deleteVehicle(Long id) {

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
    public void deleteVehicle(Vehicle vehicle) {
        vehicleRepo.delete(vehicle);
    }

    @Override
    public void deleteVehicleById(Long id) {
        vehicleRepo.deleteById(id);
    }
}
