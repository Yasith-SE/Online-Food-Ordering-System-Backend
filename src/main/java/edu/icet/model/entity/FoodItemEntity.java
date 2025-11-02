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

public class FoodItemEntity {

    @Id
    private String id;
    private String foodName;
    private String category;
    private String description;
    private double price;
    private int availableQuantity;

}
