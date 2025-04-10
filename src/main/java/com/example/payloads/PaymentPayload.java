package com.example.payloads;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentPayload {
	private int paymentId;
	private int orderId;
	private double amount;
	private String paymentMethod;
	private String paymentStatus;

	@Override
	public String toString() {
		return "PaymentPayload [paymentId=" + paymentId + ", orderId=" + orderId + ", amount=" + amount
				+ ", paymentMethod=" + paymentMethod + ", paymentStatus=" + paymentStatus + "]";
	}

}
