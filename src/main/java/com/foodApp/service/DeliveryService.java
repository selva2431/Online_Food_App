package com.foodApp.service;

import java.util.List;

import com.foodApp.payloads.DeliveryPayload;

public interface DeliveryService {
	List<DeliveryPayload> getAllDeliveries();

	DeliveryPayload getDeliveryById(int deliveryId);

	DeliveryPayload createDelivery(DeliveryPayload deliveryPayload);

	void deleteDelivery(int deliveryId);
}
