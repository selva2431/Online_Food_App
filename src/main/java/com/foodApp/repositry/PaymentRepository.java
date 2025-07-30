package com.foodApp.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodApp.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
