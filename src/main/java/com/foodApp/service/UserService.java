package com.foodApp.service;

import java.util.List;

import com.foodApp.payloads.UserPayload;

public interface UserService {
    List<UserPayload> getAllUsers();
    UserPayload getUserById(int userId);
    UserPayload createUser(UserPayload userPayload);
    void deleteUser(int userId);
}
