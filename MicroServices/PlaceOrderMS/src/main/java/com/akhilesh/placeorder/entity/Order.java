package com.akhilesh.placeorder.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "myorders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orderId_generator")
	@SequenceGenerator(name = "orderId_generator", sequenceName = "myorderId_gen", initialValue = 1002, allocationSize = 1)
	@Column(name = "order_id")
	private long orderId;
	private String orderDate;
	private String userId;
	private int totalQty;
	private double totalCost;
	private String status;
}
