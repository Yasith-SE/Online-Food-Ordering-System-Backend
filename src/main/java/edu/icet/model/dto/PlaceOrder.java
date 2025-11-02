package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class PlaceOrder {

    private String orderId;
    private String customerId;
    private String selectItem;
    private LocalDateTime orderDate;
    private String deliveryAddress;
    private double totalAmount;
    private String paymentMethod;


}

