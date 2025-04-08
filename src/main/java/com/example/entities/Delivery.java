package com.example.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Delivery")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Delivery {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deliveryId;

	@ManyToOne
	@JoinColumn(name = "orderId")
	private Order order;

	@Column(name = "deliveryExecutiveId")
	private int deliveryExecutiveId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "estimatedDeliveryTime")
	private Date estimatedDeliveryTime;

	@Column(name = "deliveryStatus")
	private String deliveryStatus;


	@Override
	public String toString() {
		return "Delivery [deliveryId=" + deliveryId + ", order=" + order + ", deliveryExecutiveId="
				+ deliveryExecutiveId + ", estimatedDeliveryTime=" + estimatedDeliveryTime + ", deliveryStatus="
				+ deliveryStatus + "]";
	}

}
