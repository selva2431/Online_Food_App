package com.foodApp.service.serviceImpl;

import com.foodApp.dto.request.FoodItemRequest;
import com.foodApp.entities.FoodItem;
import com.foodApp.entities.Restaurant;
import com.foodApp.repositry.FoodItemRepository;
import com.foodApp.repositry.RestaurantRepository;
import com.foodApp.service.FoodItemService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodItemServiceImpl implements FoodItemService {

    @Autowired
    private FoodItemRepository foodItemRepo;

    @Autowired
    private RestaurantRepository restaurantRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public FoodItem addFoodItem(FoodItemRequest item, Long restaurantId) {
        Restaurant restaurant = restaurantRepo.findById(restaurantId)
                .orElseThrow(() -> new RuntimeException("Restaurant not found"));
        FoodItem foodItem= modelMapper.map(item, FoodItem.class);


        foodItem.setRestaurant(restaurant);
        return foodItemRepo.save(foodItem);
    }

    @Override
    public List<FoodItem> getAllItems() {
        return List.of();
    }

    @Override
    public FoodItem getItemById(Long id) {
        return null;
    }

    @Override
    public void deleteItem(Long id) {

    }

    @Override
    public List<FoodItem> getFoodItemsByRestaurant(Long restaurantId) {
        Restaurant restaurant = restaurantRepo.findById(restaurantId)
                .orElseThrow(() -> new RuntimeException("Restaurant not found"));

        return foodItemRepo.findByRestaurant(restaurant);
    }
}
