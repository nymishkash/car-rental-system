package dev.org.carrentalsystem.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Rental {
    @Id
    private String rentalID;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn
    private Vehicle vehicle;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn
    private Customer customer;
    private Date startDate;
    private Date endDate;
    private Long totalCost;
}
