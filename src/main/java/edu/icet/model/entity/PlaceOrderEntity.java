package edu.icet.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity


public class PlaceOrderEntity {

    @Id
    private String orderId;
    private String customerId;
    private String selectItem;
    private LocalDateTime orderDate;
    private String deliveryAddress;
    private double totalAmount;
    private String paymentMethod;


}
