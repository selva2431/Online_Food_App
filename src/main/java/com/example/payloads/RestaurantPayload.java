package com.example.payloads;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RestaurantPayload {
	private int restaurantId;
	private String name;
	private String location;
	private String cuisineType;
	private double rating;


	@Override
	public String toString() {
		return "RestaurantPayload [restaurantId=" + restaurantId + ", name=" + name + ", location=" + location
				+ ", cuisineType=" + cuisineType + ", rating=" + rating + "]";
	}

}
