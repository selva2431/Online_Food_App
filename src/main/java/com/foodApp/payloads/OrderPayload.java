package com.foodApp.payloads;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderPayload {
	private int orderId;
	private int userId;
	private int restaurantId;
	private double totalAmount;
	private String orderStatus;
	private Date orderDate;

	@Override
	public String toString() {
		return "OrderPayload [orderId=" + orderId + ", userId=" + userId + ", restaurantId=" + restaurantId
				+ ", totalAmount=" + totalAmount + ", orderStatus=" + orderStatus + ", orderDate=" + orderDate + "]";
	}

}
