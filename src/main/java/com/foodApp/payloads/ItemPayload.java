package com.foodApp.payloads;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemPayload {
	private int itemId;
	private int orderId;
	private String name;
	private int quantity;
	private double price;


	@Override
	public String toString() {
		return "ItemPayload [itemId=" + itemId + ", orderId=" + orderId + ", name=" + name + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}

}
