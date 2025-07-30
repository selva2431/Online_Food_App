package com.foodApp.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RestaurantItemDTO {
    private int restaurantId;
    private String restaurantName;
    private String cuisineType;
    private String location;
    private double rating;
    private int itemId;
    private String itemName;
    private int quantity;
    private double price;

    public RestaurantItemDTO(int restaurantId, String restaurantName, String cuisineType, String location, double rating,
                             int itemId, String itemName, int quantity, double price) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.cuisineType = cuisineType;
        this.location = location;
        this.rating = rating;
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }
}
