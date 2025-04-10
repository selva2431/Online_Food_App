package com.example.payloads;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryPayload {
	private int deliveryId;
	private int orderId;
	private int deliveryExecutiveId;
	private Date estimatedDeliveryTime;
	private String deliveryStatus;

	@Override
	public String toString() {
		return "DeliveryPayload [deliveryId=" + deliveryId + ", orderId=" + orderId + ", deliveryExecutiveId="
				+ deliveryExecutiveId + ", estimatedDeliveryTime=" + estimatedDeliveryTime + ", deliveryStatus="
				+ deliveryStatus + "]";
	}

}
