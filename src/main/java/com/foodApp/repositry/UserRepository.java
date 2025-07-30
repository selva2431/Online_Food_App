package com.foodApp.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodApp.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
