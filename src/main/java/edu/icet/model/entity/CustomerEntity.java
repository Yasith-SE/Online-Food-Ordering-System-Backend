package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class CustomerEntity {
        @Id
        private String customerId;
        private String name;
        private int phoneNumber;
        private String emailAddress;
        private String homeAddress;


}
