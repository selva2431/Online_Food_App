package com.foodApp.service;

import com.foodApp.dto.request.FoodItemRequest;
import com.foodApp.entities.FoodItem;

import java.util.List;

public interface FoodItemService {
    FoodItem addFoodItem(FoodItemRequest item, Long restaurantId);
    List<FoodItem> getAllItems();
    FoodItem getItemById(Long id);
    void deleteItem(Long id);

    List<FoodItem> getFoodItemsByRestaurant(Long restaurantId);
}
