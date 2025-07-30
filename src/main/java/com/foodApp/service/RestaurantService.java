package com.foodApp.service;

import java.util.List;

import com.foodApp.dto.RestaurantItemDTO;
import com.foodApp.entities.Restaurant;
import com.foodApp.payloads.RestaurantPayload;

public interface RestaurantService {
	List<RestaurantPayload> getAllRestaurants();

	RestaurantPayload getRestaurantById(Long restaurantId);

	RestaurantPayload createRestaurant(RestaurantPayload restaurantPayload);

	void deleteRestaurant(Long restaurantId);

	List<Restaurant> getRestaurantByCuisineType(String cuisineType);

	List<RestaurantItemDTO> searchWithItems(String cuisineType, Double rating, String location);
}
