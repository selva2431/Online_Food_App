package com.foodApp.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Restaurant")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long restaurantId;

	@Column(name = "restaurant_name")
	private String name;

	@Column(name = "location", nullable = false)
	private String location;

	@Column(name = "cuisine_type",nullable = false)
	private String cuisineType;

	@Column(name = "rating")
	private double rating;

	@OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<FoodItem> items;


	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", name=" + name + ", location=" + location
				+ ", cuisineType=" + cuisineType + ", rating=" + rating + "]";
	}

}
