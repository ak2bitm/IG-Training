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
@Table(name = "myorderitems")
public class OrderItem {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orderItemId_generator")
	@SequenceGenerator(name = "orderItemId_generator", sequenceName = "myorderItemId_gen", initialValue = 1, allocationSize = 1)
	@Column(name = "order_item_id")
	private long orderItemId;
	
	private long orderId;
	private long bookId;
	private int qty;
	private double cost;
}
