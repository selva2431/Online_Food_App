package com.example.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Restaurant")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int restaurantId;

	@Column(name = "restaurant_name")
	private String name;

	@Column(name = "location", nullable = false)
	private String location;

	@Column(name = "cuisine_type",nullable = false)
	private String cuisineType;

	@Column(name = "rating")
	private double rating;


	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", name=" + name + ", location=" + location
				+ ", cuisineType=" + cuisineType + ", rating=" + rating + "]";
	}

}
