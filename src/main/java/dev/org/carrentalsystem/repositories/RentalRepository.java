package dev.org.carrentalsystem.repositories;

import dev.org.carrentalsystem.models.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RentalRepository extends JpaRepository<Rental, Long> {

    @Override
    Rental save(Rental rental);

    @Override
    Optional<Rental> findById(Long id);

    @Override
    void delete(Rental rental);

    @Override
    void deleteById(Long id);
}
