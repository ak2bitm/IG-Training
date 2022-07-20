package com.akhilesh.placeorder.service;

import java.util.List;

import com.akhilesh.placeorder.dto.OrderInfo;
import com.akhilesh.placeorder.entity.Order;

public interface OrderService {

	public void placeOrder(OrderInfo orderInfo);
	public List<Order> getOrdersByUserId(String userId);
	public Order getOrderByOrderId(long orderId);
}
