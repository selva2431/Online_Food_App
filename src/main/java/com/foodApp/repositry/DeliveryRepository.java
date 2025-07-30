package com.foodApp.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodApp.entities.Delivery;

public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {

}

