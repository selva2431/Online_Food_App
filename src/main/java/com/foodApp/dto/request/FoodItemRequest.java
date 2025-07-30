package com.foodApp.dto.request;

import com.foodApp.entities.Restaurant;
import com.foodApp.enums.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemRequest {

    private String name;

    private Double price;

    private String description;

    private Category category;

    private Boolean availability;

}
