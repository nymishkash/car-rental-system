package dev.org.carrentalsystem.services;

import dev.org.carrentalsystem.models.Rental;

import java.util.List;

public interface RentalService {
    void rent(Rental rental);
    void cancelRental(Rental rental);
    void updateRental(Rental rental);
    void deleteRental(Rental rental);
    List<Rental> getAllRentals();

}
