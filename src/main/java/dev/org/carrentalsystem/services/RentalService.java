package dev.org.carrentalsystem.services;

import dev.org.carrentalsystem.models.Rental;
import dev.org.carrentalsystem.repositories.EmployeeRepository;
import dev.org.carrentalsystem.repositories.RentalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalService implements RentalServiceI{
    RentalRepository rentalRepo;
    public RentalService(RentalRepository rentalRepo) {
        this.rentalRepo = rentalRepo;
    }
    @Override
    public Rental rent(Rental rental) {
        return rentalRepo.save(rental);
    }

    @Override
    public void cancelRental(Rental rental) {

    }

    @Override
    public void updateRental(Rental rental) {

    }

    @Override
    public void deleteRental(Rental rental) {

    }

    @Override
    public List<Rental> getAllRentals() {
        return List.of();
    }
}
