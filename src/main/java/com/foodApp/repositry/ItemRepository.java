package com.foodApp.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodApp.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
