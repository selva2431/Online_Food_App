package com.foodApp.repositry;

import com.foodApp.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository< Role,Integer> {
}
