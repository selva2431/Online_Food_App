package com.example.repositry;

import com.example.dto.RestaurantItemDTO;
import com.example.payloads.RestaurantPayload;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Restaurant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {

    List<Restaurant> findByCuisineType(String cuisineType);

    @Query("SELECT new com.example.dto.RestaurantItemDTO(" +
            "r.restaurantId, r.name, r.cuisineType, r.location, r.rating, " +
            "i.itemId, i.name, i.quantity, i.price) " +
            "FROM Restaurant r JOIN Item i ON i.restaurant = r " +
            "WHERE (:cuisineType IS NULL OR r.cuisineType = :cuisineType) " +
            "AND (:rating IS NULL OR r.rating >= :rating) " +
            "AND (:location IS NULL OR r.location = :location)")
    List<RestaurantItemDTO> searchWithItems(@Param("cuisineType") String cuisineType,
                                            @Param("rating") Double rating,
                                            @Param("location") String location);
}
