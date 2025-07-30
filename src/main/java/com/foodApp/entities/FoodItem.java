package com.foodApp.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.foodApp.enums.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="FOOD_ITEM")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FoodItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "price")
    private Double price;
    @Column(name = "description")
    private String description;

    @Enumerated(EnumType.STRING)
    private Category category;

    @Column(name = "availability")
    private Boolean availability;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    @JsonBackReference
    private Restaurant restaurant;

}
