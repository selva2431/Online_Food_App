package com.foodApp.controllers;
import com.foodApp.dto.RestaurantItemDTO;
import com.foodApp.entities.FoodItem;
import com.foodApp.entities.Restaurant;
import com.foodApp.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.foodApp.payloads.RestaurantPayload;
import com.foodApp.service.RestaurantService;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;

    @Autowired
    private FoodItemService foodItemService;

    @GetMapping
    public ResponseEntity<List<RestaurantPayload>> getAllRestaurants() {
        List<RestaurantPayload> restaurants = restaurantService.getAllRestaurants();
        return new ResponseEntity<>(restaurants, HttpStatus.OK);
    }

    @GetMapping("/{restaurantId}")
    public ResponseEntity<RestaurantPayload> getRestaurantById(@PathVariable Long restaurantId) {
        RestaurantPayload restaurant = restaurantService.getRestaurantById(restaurantId);
        if (restaurant != null) {
            return new ResponseEntity<>(restaurant, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<RestaurantPayload> createRestaurant(@RequestBody RestaurantPayload restaurantPayload) {
        RestaurantPayload createdRestaurant = restaurantService.createRestaurant(restaurantPayload);
        return new ResponseEntity<>(createdRestaurant, HttpStatus.CREATED);
    }

    @DeleteMapping("/{restaurantId}")
    public ResponseEntity<Void> deleteRestaurant(@PathVariable Long restaurantId) {
        restaurantService.deleteRestaurant(restaurantId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @GetMapping("cusineType/{cuisineType}")
    public ResponseEntity<List<Restaurant>> getRestaurant(@PathVariable String cuisineType){
        List<Restaurant> result = restaurantService.getRestaurantByCuisineType(cuisineType);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/getitems/{restaurantId}")
    public List<FoodItem> getItemsByRestaurant(@PathVariable Long restaurantId) {
        return foodItemService.getFoodItemsByRestaurant(restaurantId);
    }


    @GetMapping("/search")
    public ResponseEntity<List<RestaurantItemDTO>> searchRestaurants(
            @RequestParam(required = false) String cuisineType,
            @RequestParam(required = false) Double rating,
            @RequestParam(required = false) String location) {

        List<RestaurantItemDTO> results = restaurantService.searchWithItems(cuisineType, rating, location);
        return ResponseEntity.ok(results);
    }
}
