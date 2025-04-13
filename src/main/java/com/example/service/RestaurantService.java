package com.example.service;

import java.util.List;

import com.example.dto.RestaurantItemDTO;
import com.example.entities.Restaurant;
import com.example.payloads.RestaurantPayload;

public interface RestaurantService {
	List<RestaurantPayload> getAllRestaurants();

	RestaurantPayload getRestaurantById(int restaurantId);

	RestaurantPayload createRestaurant(RestaurantPayload restaurantPayload);

	void deleteRestaurant(int restaurantId);

	List<Restaurant> getRestaurantByCuisineType(String cuisineType);

	List<RestaurantItemDTO> searchWithItems(String cuisineType, Double rating, String location);
}
