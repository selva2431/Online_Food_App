package com.foodApp.service;

import java.util.List;

import com.foodApp.payloads.PaymentPayload;

public interface PaymentService {
	List<PaymentPayload> getAllPayments();

	PaymentPayload getPaymentById(int paymentId);

	PaymentPayload createPayment(PaymentPayload paymentPayload);

	void deletePayment(int paymentId);
}
