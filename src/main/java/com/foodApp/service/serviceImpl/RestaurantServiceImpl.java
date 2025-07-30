package com.foodApp.service.serviceImpl;

import com.foodApp.dto.RestaurantItemDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodApp.entities.Restaurant;
import com.foodApp.payloads.RestaurantPayload;
import com.foodApp.repositry.RestaurantRepository;
import com.foodApp.service.RestaurantService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestaurantServiceImpl implements RestaurantService {
	@Autowired
	private RestaurantRepository restaurantRepository;

	@Autowired
	private ModelMapper modelMapper;

	public List<RestaurantPayload> getAllRestaurants() {
		List<Restaurant> restaurants = restaurantRepository.findAll();
		return restaurants.stream().map(restaurant -> modelMapper.map(restaurant, RestaurantPayload.class))
				.collect(Collectors.toList());
	}

	public RestaurantPayload getRestaurantById(Long restaurantId) {
		Restaurant restaurant = restaurantRepository.findById(restaurantId).orElse(null);
		if (restaurant != null) {
			return modelMapper.map(restaurant, RestaurantPayload.class);
		}
		return null;
	}

	public RestaurantPayload createRestaurant(RestaurantPayload restaurantPayload) {
		Restaurant restaurant = modelMapper.map(restaurantPayload, Restaurant.class);
		Restaurant savedRestaurant = restaurantRepository.save(restaurant);
		return modelMapper.map(savedRestaurant, RestaurantPayload.class);
	}

	public void deleteRestaurant(Long restaurantId) {
		restaurantRepository.deleteById(restaurantId);
	}


	public List<Restaurant> getRestaurantByCuisineType(String cuisineType) {
		List<Restaurant> restaurants = restaurantRepository.findByCuisineType(cuisineType);
		return restaurants;
	}

	public List<RestaurantItemDTO> searchWithItems(String cuisineType, Double rating, String location) {
		return restaurantRepository.searchWithItems(cuisineType, rating, location);
	}

}
