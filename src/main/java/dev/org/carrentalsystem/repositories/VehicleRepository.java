package dev.org.carrentalsystem.repositories;

import dev.org.carrentalsystem.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    @Override
    Vehicle save(Vehicle vehicle);

    @Override
    Optional<Vehicle> findById(Long id);

    @Override
    void delete(Vehicle vehicle);

    @Override
    void deleteById(Long id);
}
