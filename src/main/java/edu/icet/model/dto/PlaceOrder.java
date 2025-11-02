package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class PlaceOrder {

    private Long orderId;
    private Long customerId;
    private String customerName;
    private String selectItem;
    private LocalDateTime orderDate;
    private String deliveryAddress;
    private double totalAmount;
    private String paymentMethod;


}

