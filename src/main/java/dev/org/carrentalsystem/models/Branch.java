package dev.org.carrentalsystem.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity()
@Table(name = "branch")
public class Branch {
    @Id
    private Long branchID;
    private String branchLocation;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn
    private Employee manager;
    private String email;
}

// {
//         "branchID" : "1",
//         "branchLocation" : "Mysuru",
//         "manager" : {
//             "employeeID" : "1",
//             "firstName" : "Deepak",
//             "lastName" : "Kasera",
//             "email" : "dp@example.com",
//             "phone" : "9999999999"
//         },
//         "email" : "nymish@gmail.com"
// }
