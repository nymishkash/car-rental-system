package dev.org.carrentalsystem.controllers;

import dev.org.carrentalsystem.models.Rental;
import dev.org.carrentalsystem.services.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rental")
public class RentalController {

    @Autowired
    RentalService rentalService;

    @PostMapping("/create")
    public Rental rent(Rental rental) {
        return rentalService.rent(rental);
    }
}
