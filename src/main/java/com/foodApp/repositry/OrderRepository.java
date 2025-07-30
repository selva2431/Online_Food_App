package com.foodApp.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodApp.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
