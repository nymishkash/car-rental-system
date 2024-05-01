package dev.org.carrentalsystem.services;

import dev.org.carrentalsystem.models.Rental;
import dev.org.carrentalsystem.repositories.EmployeeRepository;
import dev.org.carrentalsystem.repositories.RentalRepository;

import java.util.List;

public class RentalService implements RentalServiceI{
    RentalRepository rentalRepo;
    public RentalService(RentalRepository rentalRepo) {
        this.rentalRepo = rentalRepo;
    }
    @Override
    public void rent(Rental rental) {

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
