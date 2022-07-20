package com.akhilesh.placeorder.dto;

import java.util.List;

import com.akhilesh.placeorder.entity.Order;
import com.akhilesh.placeorder.entity.OrderItem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderInfo {

	private Order order;
	
	List<OrderItem> itemsList;
}
