package com.foodApp.controllers;

import com.foodApp.dto.request.FoodItemRequest;
import com.foodApp.entities.FoodItem;
import com.foodApp.service.FoodItemService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/food")
public class FoodItemController {

    @Autowired
    private FoodItemService foodItemService;

    @PostMapping("/restaurant/{restaurantId}/add")
    public FoodItem addFoodItem(@RequestBody FoodItemRequest item, @PathVariable Long restaurantId) {
        return foodItemService.addFoodItem(item, restaurantId);
    }

    @GetMapping("/all")
    public List<FoodItem> getAllItems() {
        return foodItemService.getAllItems();
    }

    @GetMapping("/{id}")
    public FoodItem getItemById(@PathVariable Long id) {
        return foodItemService.getItemById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        foodItemService.deleteItem(id);
    }
}
