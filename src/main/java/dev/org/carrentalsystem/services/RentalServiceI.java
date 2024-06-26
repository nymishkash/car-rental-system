package dev.org.carrentalsystem.services;

import dev.org.carrentalsystem.models.Rental;

import java.util.List;

public interface RentalServiceI {
    Rental rent(Rental rental);
    void cancelRental(Rental rental);
    void updateRental(Rental rental);
    void deleteRental(Rental rental);
    List<Rental> getAllRentals();

}
