package edu.icet.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class Customer {

    private String customerId;
    private String name;
    private int phoneNumber;
    private String emailAddress;
    private String homeAddress;

}
