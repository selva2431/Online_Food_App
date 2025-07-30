package com.foodApp.service;

import java.util.List;

import com.foodApp.payloads.OrderPayload;

public interface OrderService {
	List<OrderPayload> getAllOrders();

	OrderPayload getOrderById(int orderId);

	OrderPayload createOrder(OrderPayload orderPayload);

	void deleteOrder(int orderId);
}
