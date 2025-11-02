package edu.icet.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class FoodItem {

    private Long id;
    private String foodName;
    private String category;
    private String description;
    private double price;
    private int availableQuantity;

}
